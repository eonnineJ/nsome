package com.app.nsome.International.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
public class Nation {
    @Id
    private String code;

    private String name;
}
