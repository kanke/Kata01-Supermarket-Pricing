package kata.supermarket.Pricing.Impl;

import kata.supermarket.Item.Item;
import kata.supermarket.Pricing.PricingStrategy;

import java.math.BigDecimal;
import java.util.List;


public class RegularStrategy implements PricingStrategy {

    private final List<Item> items;

    public RegularStrategy(List<Item> items) {
        this.items = items;
    }

    @Override
    public BigDecimal calculateTotal() {
        return PricingStrategy.subtotal(items);
    }
}
