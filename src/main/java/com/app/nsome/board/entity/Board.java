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
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Member writerId;

    @ManyToOne
    @JoinColumn(name = "writer_id")
    private Member writer;

    private LocalDate writeDate;

    private String title; // 제목

    private String contant; // 내용

    private Integer hits; // 조회수
}
