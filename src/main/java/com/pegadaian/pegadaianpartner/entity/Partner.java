package com.pegadaian.pegadaianpartner.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity(name = "tbl_partner")
@Table(name = "tbl_partner")
public class Partner {
    @Id
    private String partner_id;

    @Column(length = 32)
    private String partner_name;

    @Column(precision=10, scale=2)
    private Double partner_sell_percentage;

    @Column(length = 10)
    private String status;

    @Column(length = 10)
    private String created_date;

    @Column(length = 100)
    private String created_by;

    @Column(length = 10)
    private String modified_date;

    @Column(length = 100)
    private String modified_by;

}
