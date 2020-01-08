package com.wzh.back_template.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Builder;
import lombok.Data;

/**
@author wzh
@date 2020/1/7 - 15:18
*/
@Data
@Builder
@Table(name = "ecs_region")
public class Region implements Serializable {
    @Id
    @Column(name = "region_id")
    @GeneratedValue(generator = "JDBC")
    private Short regionId;

    @Column(name = "parent_id")
    private Short parentId;

    @Column(name = "region_name")
    private String regionName;

    @Column(name = "region_type")
    private Boolean regionType;

    @Column(name = "agency_id")
    private Short agencyId;

    private static final long serialVersionUID = 1L;
}