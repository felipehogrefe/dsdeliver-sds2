package com.devsuperior.dsdeliver.dto;

import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.entities.OrderStatus;
import com.devsuperior.dsdeliver.entities.Product;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Double longitude;
    private Double latitude;
    private String address;
    private Instant moment;
    private OrderStatus status;

    private List<ProductDTO> products = new ArrayList<>();

    public OrderDTO() {}

    public OrderDTO(Long id, Double longitude, Double latitude, String address, Instant moment, OrderStatus status, Set<ProductDTO> products) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
        this.moment = moment;
        this.status = status;
    }

    public OrderDTO(Order order) {
        id = order.getId();
        longitude = order.getLongitude();
        latitude = order.getLatitude();
        address = order.getAddress();
        moment = order.getMoment();
        status = order.getStatus();
        products = order.getProducts().stream().map(ProductDTO::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }
}
