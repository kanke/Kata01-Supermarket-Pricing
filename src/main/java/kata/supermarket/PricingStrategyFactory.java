package kata.supermarket;

import java.util.List;

/**
 * Created by kanke on 01/12/2019.
 */
public class PricingStrategyFactory implements Pricing {

    private final List<Item> items;
    private final Integer volume;

    public PricingStrategyFactory(List<Item> items, Integer volume) {
        this.items = items;
        this.volume = volume;
    }

    @Override
    public PricingStrategy getPricing() {
        if (volume != null)
        {
            return new DiscountStrategy(items, volume);
        }

        return new RegularStrategy(items);
    }

}
