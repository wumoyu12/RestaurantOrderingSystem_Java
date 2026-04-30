package javaPack;

public class DisplayMenu
{
  
    public void showMenu(int category)
    {
        if (category == 1)
        {
            System.out.println("Breakfast Menu:");
            System.out.println("1. Milk - $2.00");
            System.out.println("2. Bread - $3.00");
            System.out.println("3. Fruit - $4.00");
        }
        else if (category == 2)
        {
            System.out.println("Lunch Menu:");
            System.out.println("1. Chicken Sandwich - $8.00");
            System.out.println("2. Salad - $6.00");
            System.out.println("3. Fried Rice - $9.00");
        }
        else if (category == 3)
        {
            System.out.println("Dinner Menu:");
            System.out.println("1. Steak - $15.00");
            System.out.println("2. Beef Noodle - $12.00");
            System.out.println("3. Fried Noodle - $10.00");
        }
        else
        {
            System.out.println("Invalid category.");
        }
    }
}
