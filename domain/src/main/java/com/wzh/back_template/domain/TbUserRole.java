package com.wzh.back_template.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
*@auther wzh
*@date 2020/5/19 - 7:48
**/
@Data
@Table(name = "tb_user_role")
public class TbUserRole implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 用户 ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色 ID
     */
    @Column(name = "role_id")
    private Long roleId;

    private static final long serialVersionUID = 1L;
}