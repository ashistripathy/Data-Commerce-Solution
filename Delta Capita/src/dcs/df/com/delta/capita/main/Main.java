package dcs.df.com.delta.capita.main;

import dcs.df.com.delta.capita.factory.*;
import dcs.df.com.delta.capita.shopping.Basket;
import dcs.df.com.delta.capita.shopping.Item;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ItemFactory appleFactory = new AppleFactory();
        ItemFactory bananaFactory = new BananaFactory();
        ItemFactory melonFactory = new MelonFactory();
        ItemFactory limeFactory = new LimeFactory();

        // Create items using factories with specified quantity
        List<Item> apples = appleFactory.createItem(2);
        List<Item> bananas = bananaFactory.createItem(1);
        List<Item> melons = melonFactory.createItem(2);
        List<Item> limes = limeFactory.createItem(3);

        // Add items to the basket
        Basket basket = new Basket();
        basket.addItems(apples);
        basket.addItems(bananas);
        basket.addItems(melons);
        basket.addItems(limes);

        int totalCost = basket.calculateTotalCost();
        System.out.println("Total cost of the basket: " + totalCost + " p");
    }
}
