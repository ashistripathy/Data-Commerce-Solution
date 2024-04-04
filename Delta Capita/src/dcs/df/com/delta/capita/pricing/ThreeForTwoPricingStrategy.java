package dcs.df.com.delta.capita.pricing;

public class ThreeForTwoPricingStrategy implements PricingStrategy {
    private int pricePerItem;

    public ThreeForTwoPricingStrategy(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public int calculatePrice(int quantity) {
        int setsOfThree = quantity / 3;
        int remainder = quantity % 3;
        return (setsOfThree * 2 * pricePerItem) + (remainder * pricePerItem);
    }
}