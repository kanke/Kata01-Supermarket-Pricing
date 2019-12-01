package kata.supermarket.Pricing;

/**
 * Create pricing strategy for a data source such as database, text file or service
 */
public interface Pricing {

    PricingStrategy getPricing();
}
