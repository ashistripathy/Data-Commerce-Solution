package dcs.df.com.delta.capita.main;

import dcs.df.com.delta.capita.shopping.Basket;
import dcs.df.com.delta.capita.shopping.Item;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addItem(new Item("Apple"));
        basket.addItem(new Item("Apple"));
        basket.addItem(new Item("Banana"));
        basket.addItem(new Item("Melon"));
        basket.addItem(new Item("Melon"));
        basket.addItem(new Item("Melon"));
        basket.addItem(new Item("Lime"));
        basket.addItem(new Item("Lime"));
        basket.addItem(new Item("Lime"));

        int totalCost = basket.calculateTotalCost();
        System.out.println("Total cost of the basket: " + totalCost + " p");
    }
}
