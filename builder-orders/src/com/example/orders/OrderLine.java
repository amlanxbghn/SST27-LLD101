package com.example.orders;

public class OrderLine {
    private String sku;
    private int quantity;
    private int unitPriceCents;

    public OrderLine(String sku, int quantity, int unitPriceCents) {
        this.sku = sku;
        this.quantity = quantity;
        this.unitPriceCents = unitPriceCents;
    }

    public final String getSku() { return sku; }
    public final int getQuantity() { return quantity; }
    public final int getUnitPriceCents() { return unitPriceCents; }

}
