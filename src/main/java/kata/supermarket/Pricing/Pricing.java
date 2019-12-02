package kata.supermarket.Pricing;

import kata.supermarket.Item.Item;

import java.util.List;

/**
 * Create pricing strategy for a data source such as database, text file or service
 */
public interface Pricing {

    PricingStrategy getPricing(List<Item> items);
}
