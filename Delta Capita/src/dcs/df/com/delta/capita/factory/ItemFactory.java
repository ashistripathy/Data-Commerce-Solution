package dcs.df.com.delta.capita.factory;

import dcs.df.com.delta.capita.shopping.Item;

import java.util.List;

public interface ItemFactory {
    List<Item> createItem(int quantity);
}
