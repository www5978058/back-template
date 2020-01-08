package com.wzh.back_template.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author wzh
 * @date 2020/1/8 - 10:30
 */
@Data
public class OrderExcel {
    @ExcelProperty("订单号")
    private String orderSn;
    @ExcelProperty("支付时间")
    private Date payTime;
    @ExcelProperty("商品名称")
    private String goodsName;
    @ExcelProperty("购买数量")
    private Integer goodsNumber;
    @ExcelProperty("供货商编码")
    private String suppliersName;
    @ExcelProperty("商品品类")
    private String catName;
    @ExcelProperty("商品编码")
    private String goodsSn;
    @ExcelProperty("规格编码")
    private String goodsAttr;
    @ExcelProperty("用户留言")
    private String postscript;
    @ExcelProperty("收货人")
    private String consignee;
    @ExcelProperty("收货人电话")
    private String mobile;
    @ExcelProperty("收货地址")
    private String address;

}
