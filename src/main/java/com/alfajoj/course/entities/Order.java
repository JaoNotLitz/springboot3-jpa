package com.alfajoj.course.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Getter
@Entity
@Table(name = "tb-order")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;
    private OrderStatus orderStatus;

    public void setClient(User client) {
        this.client = client;
    }

    @ManyToOne
    @JoinColumn(name="client_id")
    private User client;

    public void setId(Long id) {
        this.id = id;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Order() {
    }

    public Order(Long id, Instant moment, OrderStatus orderStatus) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
    }

}
