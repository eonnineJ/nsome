package com.app.nsome;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Test {

    @Id @GeneratedValue
    Integer id;

}
