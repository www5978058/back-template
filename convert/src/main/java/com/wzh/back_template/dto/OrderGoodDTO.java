package com.wzh.back_template.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wzh
 * @date 2020/1/3 - 13:32
 */
@Data
public class OrderGoodDTO implements Serializable {
    private String goodsName;
    private Integer goodsNumber;
    private String suppliersName;
    private String catName;
    private String goodsSn;
    private String goodsAttr;

}
