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
@Table(name = "ecs_category")
public class Category implements Serializable {
    @Id
    @Column(name = "cat_id")
    @GeneratedValue(generator = "JDBC")
    private Short catId;

    @Column(name = "cat_name")
    private String catName;

    @Column(name = "keywords")
    private String keywords;

    @Column(name = "cat_desc")
    private String catDesc;

    @Column(name = "parent_id")
    private Short parentId;

    @Column(name = "sort_order")
    private Boolean sortOrder;

    @Column(name = "template_file")
    private String templateFile;

    @Column(name = "measure_unit")
    private String measureUnit;

    @Column(name = "show_in_nav")
    private Boolean showInNav;

    @Column(name = "`style`")
    private String style;

    @Column(name = "is_show")
    private Boolean isShow;

    @Column(name = "grade")
    private Byte grade;

    @Column(name = "filter_attr")
    private String filterAttr;

    private static final long serialVersionUID = 1L;
}