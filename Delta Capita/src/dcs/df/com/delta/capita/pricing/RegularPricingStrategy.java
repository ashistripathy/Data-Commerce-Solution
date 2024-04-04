package dcs.df.com.delta.capita.pricing;

public class RegularPricingStrategy implements PricingStrategy {
    private int pricePerItem;

    public RegularPricingStrategy(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public int calculatePrice(int quantity) {
        return quantity * pricePerItem;
    }
}
