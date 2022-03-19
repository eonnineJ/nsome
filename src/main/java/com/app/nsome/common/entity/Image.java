package com.app.nsome.common.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Image {
    @Id
    @GeneratedValue
    Integer id;

    String location;

    String name;

    String size;

}
