package dcs.df.com.delta.capita.shopping;

import dcs.df.com.delta.capita.pricing.BuyOneGetOneFreePricingStrategy;
import dcs.df.com.delta.capita.pricing.PricingStrategy;
import dcs.df.com.delta.capita.pricing.RegularPricingStrategy;
import dcs.df.com.delta.capita.pricing.ThreeForTwoPricingStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {
    private List<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void addItems(List<Item> items) {
        this.items.addAll(items);
    }

    public int calculateTotalCost() {
        // Map of item names to their corresponding pricing strategies
        Map<String, PricingStrategy> pricingStrategies = new HashMap<>();
        pricingStrategies.put("Apple", new RegularPricingStrategy(35));
        pricingStrategies.put("Banana", new RegularPricingStrategy(20));
        pricingStrategies.put("Melon", new BuyOneGetOneFreePricingStrategy(50));
        pricingStrategies.put("Lime", new ThreeForTwoPricingStrategy(15));

        // Map to store quantity of each item
        Map<String, Integer> itemQuantity = new HashMap<>();

        // Count the quantity of each item in the basket
        for (Item item : items) {
            String itemName = item.getName();
            itemQuantity.put(itemName, itemQuantity.getOrDefault(itemName, 0) + 1);
        }

        // Calculate total cost based on pricing strategies and item quantities
        int totalCost = 0;
        for (Map.Entry<String, Integer> entry : itemQuantity.entrySet()) {
            String itemName = entry.getKey();
            int quantity = entry.getValue();
            PricingStrategy pricingStrategy = pricingStrategies.get(itemName);
            totalCost += pricingStrategy.calculatePrice(quantity);
        }

        return totalCost;
    }
}
