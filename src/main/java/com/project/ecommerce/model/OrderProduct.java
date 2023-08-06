package com.project.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class OrderProduct {
    @EmbeddedId
    @JsonIgnore
    private OrderProductPK pk;

    @Column(nullable = false) private Integer quantity;

    public OrderProduct() {
        super();
    }

    public OrderProduct(Order order, Product product, Integer quantity) {
        pk = new OrderProductPK();
        pk.setOrder(order);
        pk.setProduct(product);
        this.quantity = quantity;
    }
}
