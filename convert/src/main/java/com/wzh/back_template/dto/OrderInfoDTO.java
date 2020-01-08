package com.wzh.back_template.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wzh
 * @date 2020/1/3 - 13:32
 */
@Data
public class OrderInfoDTO implements Serializable {
    private String orderSn;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date payTime;
    private String consignee;
    private String mobile;
    private String address;
    private String postscript;
}
