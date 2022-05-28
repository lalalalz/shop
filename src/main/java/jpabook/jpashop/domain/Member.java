package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;

//    @Embedded
//    private Address homeAddress;
//
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "city", column = @Column(name = "workCity")),
//            @AttributeOverride(name = "street", column = @Column(name = "workStreet")),
//            @AttributeOverride(name = "zipcode", column = @Column(name = "workZipcode"))
//    })
//    private Address workAddress;

    private String city;
    private String street;
    private String zipcode;

    @OneToMany
    @JoinColumn(name = "member")
    private List<Order> orders = new ArrayList<>();
}