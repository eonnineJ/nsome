package com.app.nsome.member.entity;

import com.app.nsome.International.entity.Nation;
import com.app.nsome.common.entity.Image;
import com.app.nsome.member.domain.GenderType;
import com.app.nsome.member.domain.MemberType;
import com.app.nsome.payment.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;

    private String name;

    private String password;

    private String phoneNumber;

    private GenderType gender;

    private LocalDate nameLastChangeDate;

//    @ManyToMany
//    @JoinTable(name = "member_image"
//               , joinColumns = @JoinColumn(name = "photo_id")
//               , inverseJoinColumns = @JoinColumn(name = "image_id")
//    )
//    private Set<Image> photo = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nation_code")
    private Nation nation;

    @OneToMany
    @JoinColumn(name = "payment_id")
    private Set<Payment> payment;

    @Enumerated(EnumType.STRING)
    private MemberType type;

}
