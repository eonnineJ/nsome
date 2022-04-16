package com.app.nsome.content.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chat {
    // TODO 기술 구현 이후 설계 예정
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
