package kata.supermarket.Item.Impl;

import kata.supermarket.Item.Item;
import kata.supermarket.Product;

import java.math.BigDecimal;

public class ItemByUnit implements Item {

    private final Product product;

    public ItemByUnit(final Product product) {
        this.product = product;
    }

    public BigDecimal price() {
        return product.pricePerUnit();
    }
}
