package com.app.nsome.member.entity;

import com.app.nsome.common.entity.Image;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MemberInspection {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "image_id")
    private Set<Image> image = new HashSet<>();

}
