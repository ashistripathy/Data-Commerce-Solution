package dcs.df.com.delta.capita.factory;

import dcs.df.com.delta.capita.shopping.Item;

import java.util.ArrayList;
import java.util.List;

public class BananaFactory implements ItemFactory{
    @Override
    public List<Item> createItem(int quantity) {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            items.add(new Item("Banana"));
        }
        return items;
    }
}
