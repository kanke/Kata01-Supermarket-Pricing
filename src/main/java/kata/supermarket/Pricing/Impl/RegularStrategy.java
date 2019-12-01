package kata.supermarket.Pricing.Impl;

import kata.supermarket.Item.Item;
import kata.supermarket.Pricing.PricingStrategy;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by kanke on 01/12/2019.
 */
public class RegularStrategy implements PricingStrategy {

    private final List<Item> items;

    public RegularStrategy(List<Item> items) {
        this.items = items;
    }

    @Override
    public BigDecimal getTotal() {
        return PricingStrategy.subtotal(items);
    }
}
