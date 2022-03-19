package com.app.nsome.member.entity;

import com.app.nsome.International.entity.Nation;
import com.app.nsome.common.entity.Image;
import com.app.nsome.member.domain.MemberType;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
@Getter
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String email;

    String name;

    String password;

    String phoneNumber;

    Character gender;

    @ManyToOne
    @JoinColumn(name = "code")
    Nation nation;

    @ManyToMany
    @JoinTable(name = "member_image"
               , joinColumns = @JoinColumn(name = "photo_id")
               , inverseJoinColumns = @JoinColumn(name = "image_id")
    )
    List<Image> photo = new ArrayList<>();

    LocalDate nameLastChangeDate;

    @Enumerated(EnumType.STRING)
    MemberType type;

}
