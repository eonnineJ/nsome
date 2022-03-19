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
    @JoinColumn(name = "id")
    Member writerId;

    @ManyToOne
    @JoinColumn(name = "name")
    Member writer;

    LocalDate writeDate;

    String title;

    String contant;

    Integer hits;





}
