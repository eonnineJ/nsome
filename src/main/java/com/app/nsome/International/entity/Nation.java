package com.app.nsome.International.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Nation {
    @Id
    String code;

    String name;
}
