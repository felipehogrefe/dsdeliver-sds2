package com.devsuperior.dsdeliver.dto;

import com.devsuperior.dsdeliver.entities.OrderStatus;
import com.devsuperior.dsdeliver.entities.Product;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class OrderDTO implements Serializable {
    private Long id;
    private Double longitude;
    private Double latitude;
    private String address;
    private Instant moment;
    private OrderStatus status;

    private Set<Product> products = new HashSet<>();

    public OrderDTO() {}

    public OrderDTO(Long id, Double longitude, Double latitude, String address, Instant moment, OrderStatus status, Set<Product> products) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
        this.moment = moment;
        this.status = status;
        this.products = products;
    }
}
