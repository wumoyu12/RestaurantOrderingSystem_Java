package javaPack;

import java.util.ArrayList;

public class Reciept
{
    private ArrayList<String> items;
    private ArrayList<Double> prices;

    public Reciept(ArrayList<String> orderItems, ArrayList<Double> orderPrices)
    {
        items = orderItems;
        prices = orderPrices;
    }

    public void printReceipt()
    {
        double total = 0;

        System.out.println();
        System.out.println("Final Receipt");
        System.out.println("---------------------------");

        for (int i = 0; i < items.size(); i++)
        {
            System.out.println(items.get(i) + " - $" + prices.get(i));
            total = total + prices.get(i);
        }

        System.out.println("---------------------------");
        System.out.println("Total: $" + total);
    }
}
