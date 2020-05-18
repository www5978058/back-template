package com.wzh.back_template.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
*@auther wzh
*@date 2020/5/19 - 7:48
**/
@Data
@Table(name = "tb_role_permission")
public class TbRolePermission implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 角色 ID
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 权限 ID
     */
    @Column(name = "permission_id")
    private Long permissionId;

    private static final long serialVersionUID = 1L;
}