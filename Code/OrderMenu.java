package javaPack;

import java.util.ArrayList;

public class OrderMenu
{
    private ArrayList<String> items;
    private ArrayList<Double> prices;

    public OrderMenu()
    {
        items = new ArrayList<String>();
        prices = new ArrayList<Double>();
    }

    public void addItem(String item, double price)
    {
        items.add(item);
        prices.add(price);
        System.out.println(item + " has been added to your order.");
    }

    public ArrayList<String> getItems()
    {
        return items;
    }

    public ArrayList<Double> getPrices()
    {
        return prices;
    }
}
