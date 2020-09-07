package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String urlImage;
    private String nameImage;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
