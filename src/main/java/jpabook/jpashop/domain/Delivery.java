package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Delivery extends BaseAttributes {

    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    private String city;
    private String street;
    private String zipcode;
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery")
    private Order order;
}
