package javaPack;

import java.util.Scanner;

public class MainRestaurant
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        DisplayMenu display = new DisplayMenu();
        OrderMenu order = new OrderMenu();

        String answer = "y";

        while (answer.equals("y") || answer.equals("yes"))
        {
            int category = 0;

            while (true)
            {
                System.out.println("Choose a category:");
                System.out.println("1. Breakfast");
                System.out.println("2. Lunch");
                System.out.println("3. Dinner");

                if (input.hasNextInt())
                {
                    category = input.nextInt();
                    input.nextLine();

                    if (category >= 1 && category <= 3)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Invalid category.");
                    }
                }
                else
                {
                    input.nextLine();
                    System.out.println("Invalid input. Please enter a number.");
                }
            }

            display.showMenu(category);

            int choice = 0;

            while (true)
            {
                System.out.println("Enter the item number you want to order:");

                if (input.hasNextInt())
                {
                    choice = input.nextInt();
                    input.nextLine();

                    if (choice >= 1 && choice <= 3)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Invalid item.");
                    }
                }
                else
                {
                    input.nextLine();
                    System.out.println("Invalid input. Please enter a number.");
                }
            }

            if (category == 1)
            {
                if (choice == 1)
                {
                    order.addItem("Milk", 2.00);
                }
                else if (choice == 2)
                {
                    order.addItem("Bread", 3.00);
                }
                else if (choice == 3)
                {
                    order.addItem("Fruit", 4.00);
                }
            }
            else if (category == 2)
            {
                if (choice == 1)
                {
                    order.addItem("Chicken Sandwich", 8.00);
                } else if (choice == 2)
                {
                    order.addItem("Salad", 6.00);
                }
                else if (choice == 3)
                {
                    order.addItem("Fried Rice", 9.00);
                }
            }
            else if (category == 3)
            {
                if (choice == 1)
                {
                    order.addItem("Steak", 15.00);
                }
                else if (choice == 2)
                {
                    order.addItem("Beef Noodle", 12.00);
                }
                else if (choice == 3)
                {
                    order.addItem("Fried Noodle", 10.00);
                }
            }

            while (true)
            {
                System.out.println("Do you want to order more? y/yes or n/no");
                answer = input.nextLine();

                String a = answer.toLowerCase();

                if (a.equals("y") || a.equals("yes") || a.equals("n") || a.equals("no"))
                {
                    answer = a;
                    break;
                }
                else
                {
                    System.out.println("Invalid input.");
                }
            }
        }

        Reciept reciept = new Reciept(order.getItems(), order.getPrices());
        reciept.printReceipt();

        input.close();
    }
}
