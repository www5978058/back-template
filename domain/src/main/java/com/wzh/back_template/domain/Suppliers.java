package com.wzh.back_template.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Builder;
import lombok.Data;

/**
@author wzh
@date 2020/1/7 - 15:18
*/
@Data
@Builder
@Table(name = "ecs_suppliers")
public class Suppliers implements Serializable {
    @Id
    @Column(name = "suppliers_id")
    @GeneratedValue(generator = "JDBC")
    private Short suppliersId;

    @Column(name = "suppliers_name")
    private String suppliersName;

    @Column(name = "suppliers_desc")
    private String suppliersDesc;

    @Column(name = "is_check")
    private Boolean isCheck;

    @Column(name = "first_kg")
    private BigDecimal firstKg;

    @Column(name = "add_kg")
    private BigDecimal addKg;

    @Column(name = "first_kg_far")
    private BigDecimal firstKgFar;

    @Column(name = "add_kg_far")
    private BigDecimal addKgFar;

    private static final long serialVersionUID = 1L;
}