package kata.supermarket;

/**
 * Create pricing strategy for a data source such as database, text file or service
 */
public interface Pricing {

    PricingStrategy getPricing();
}
