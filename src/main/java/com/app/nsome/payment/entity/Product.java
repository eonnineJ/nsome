package com.app.nsome.payment.entity;

import com.app.nsome.payment.domain.ProductType;

import javax.persistence.*;

@Entity
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long price;

    @Enumerated(EnumType.STRING)
    private ProductType type;

    private Integer reward;

    private String desc;

}
