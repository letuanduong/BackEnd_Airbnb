package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private String nameHouse;
    private Long bedroom;
    private Long bathroom;
    private Long priceHouse;
    private Long voteNumber;
    private String houseTypes;
    private String roomTypes;
    private String location;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
