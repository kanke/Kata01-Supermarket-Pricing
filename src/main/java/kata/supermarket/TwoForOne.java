package kata.supermarket;

import java.math.BigDecimal;
import java.util.List;

public class TwoForOne implements DiscountStrategy {

    private final List<Item> items;
    private final int volume;

    public TwoForOne(List<Item> items, int volume) {
        this.items = items;
        this.volume = volume;
    }

    @Override
    public BigDecimal applyDiscount() {

        BigDecimal volumeDiscount = BigDecimal.valueOf(0);

        if (items.size() > volume)
            for (Item item : items) {
                volumeDiscount = item.price().multiply(BigDecimal.valueOf(volume));
            }

        return volumeDiscount;
    }

}
