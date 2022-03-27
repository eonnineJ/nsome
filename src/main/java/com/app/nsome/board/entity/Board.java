package com.app.nsome.board.entity;

import com.app.nsome.member.entity.Member;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "writer_id")
    Member writer;

    LocalDate writeDate;

    String title; // 제목

    String contant; // 내용

    Integer hits; // 조회수



}
