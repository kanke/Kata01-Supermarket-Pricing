package kata.supermarket.Pricing.Impl;

import kata.supermarket.Item.Item;
import kata.supermarket.Pricing.Pricing;
import kata.supermarket.Pricing.PricingStrategy;

import java.util.List;

/**
 * Created by kanke on 01/12/2019.
 */
public class PricingStrategyFactory implements Pricing {

    @Override
    public PricingStrategy getPricing(List<Item> items) {

        //this should ideally not be hardcoded and come from a source. Using 2 because of 2-4-1 pricing
        Integer volume = 2;

        if (volume != null)
        {
            return new TwoForPriceOfOneStrategy(items, volume);
        }

        return new RegularStrategy(items);
    }

}
