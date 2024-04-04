package dcs.df.com.delta.capita.pricing;

public class BuyOneGetOneFreePricingStrategy implements PricingStrategy {
    private int pricePerItem;

    public BuyOneGetOneFreePricingStrategy(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public int calculatePrice(int quantity) {
        int pairs = quantity / 2;
        int remainder = quantity % 2;
        return (pairs * pricePerItem) + (remainder * pricePerItem);
    }
}
