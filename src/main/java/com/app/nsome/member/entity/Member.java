package com.app.nsome.member.entity;

import com.app.nsome.International.entity.Nation;
import com.app.nsome.common.entity.Image;
import com.app.nsome.member.domain.MemberType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
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
    Set<Image> photo = new HashSet<>();

    LocalDate nameLastChangeDate;

    @Enumerated(EnumType.STRING)
    MemberType type;

}
