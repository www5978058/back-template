package com.wzh.back_template.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
*@auther wzh
*@date 2020/5/19 - 7:48
**/
@Data
@Table(name = "tb_role")
public class TbRole implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 父角色
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 角色名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 角色英文名称
     */
    @Column(name = "enname")
    private String enname;

    /**
     * 备注
     */
    @Column(name = "description")
    private String description;

    @Column(name = "created")
    private Date created;

    @Column(name = "updated")
    private Date updated;

    private static final long serialVersionUID = 1L;
}