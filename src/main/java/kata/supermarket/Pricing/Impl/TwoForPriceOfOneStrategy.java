package kata.supermarket.Pricing.Impl;

import kata.supermarket.Item.Item;
import kata.supermarket.Pricing.PricingStrategy;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoForPriceOfOneStrategy implements PricingStrategy {

    private final List<Item> items;
    private final int volume;

    public TwoForPriceOfOneStrategy(List<Item> items, int volume) {
        this.items = items;
        this.volume = volume;
    }

    private BigDecimal applyDiscount() {
        if (volume < 1) {
            throw new IllegalArgumentException("Discount should contain applied volume");
        }

        int count = items.size();
        List<Item> result = IntStream.range(0, count)
                .filter(n -> n % volume != 0)
                .mapToObj(items::get)
                .collect(Collectors.toList());

        return result.stream().map(Item::price)
                .reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
    }

    @Override
    public BigDecimal calculateTotal() {
        return PricingStrategy.subtotal(items).subtract(applyDiscount());
    }
}
