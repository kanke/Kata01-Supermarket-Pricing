package kata.supermarket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket {
    private final List<Item> items;
    private final Pricing pricing;

    public Basket() {
        this.items = new ArrayList<>();
        pricing = new PricingStrategyFactory(Collections.unmodifiableList(items), 1);
    }

    public void add(final Item item) {
        this.items.add(item);
    }

    public BigDecimal total() {
        return pricing.getPricing().getTotal();
    }
}
