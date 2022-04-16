package com.app.nsome.board.entity;

import com.app.nsome.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    Member writerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "name")
    Member writer;

    LocalDate writeDate;

    String title; // 제목

    String contant; // 내용

    Integer hits; // 조회수
}
