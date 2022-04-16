package com.app.nsome.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
public class Image {
    @Id
    @GeneratedValue
    private Integer id;

    private String location;

    private String name;

    private String size;

}
