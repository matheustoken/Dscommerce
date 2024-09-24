package com.devsuperior.dscommerce.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name="tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant momemnt;
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Order(){
    }

    public Order(Long id, Instant momemnt, OrderStatus status, User client) {
        this.id = id;
        this.momemnt = momemnt;
        this.status = status;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMomemnt() {
        return momemnt;
    }

    public void setMomemnt(Instant momemnt) {
        this.momemnt = momemnt;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }
}
