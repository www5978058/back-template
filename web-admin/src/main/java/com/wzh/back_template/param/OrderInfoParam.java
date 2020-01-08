package com.wzh.back_template.param;

import lombok.Data;

/**
 * @author wzh
 * @date 2020/1/8 - 10:06
 */
@Data
public class OrderInfoParam {
    private String startDate;
    private String endDate;
    private String orderSn;
}
