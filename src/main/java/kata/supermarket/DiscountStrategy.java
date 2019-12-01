package kata.supermarket;

import java.math.BigDecimal;
import java.util.List;

public class DiscountStrategy implements PricingStrategy {

    private final List<Item> items;
    private final int volume;

    public DiscountStrategy(List<Item> items, int volume) {
        this.items = items;
        this.volume = volume;
    }

    public BigDecimal applyDiscount() {
        if (volume < 1) {
            throw new IllegalArgumentException("Discount should contain volume");
        }

        BigDecimal volumeDiscount = BigDecimal.valueOf(0);

        if (items.size() > volume)
            for (Item item : items) {
                volumeDiscount = item.price().multiply(BigDecimal.valueOf(volume));
            }

        return volumeDiscount;
    }

    @Override
    public BigDecimal getTotal() {
        return PricingStrategy.subtotal(items).subtract(applyDiscount());
    }
}
