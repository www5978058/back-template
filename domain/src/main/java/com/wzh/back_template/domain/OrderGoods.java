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
@Table(name = "ecs_order_goods")
public class OrderGoods implements Serializable {
    @Id
    @Column(name = "rec_id")
    @GeneratedValue(generator = "JDBC")
    private Integer recId;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "goods_id")
    private Integer goodsId;

    @Column(name = "goods_name")
    private String goodsName;

    @Column(name = "goods_sn")
    private String goodsSn;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "goods_number")
    private Short goodsNumber;

    @Column(name = "market_price")
    private BigDecimal marketPrice;

    @Column(name = "goods_price")
    private BigDecimal goodsPrice;

    /**
     * 对接erp专用，商品优惠金额
     */
    @Column(name = "discount_fee")
    private BigDecimal discountFee;

    @Column(name = "goods_attr")
    private String goodsAttr;

    @Column(name = "send_number")
    private Short sendNumber;

    @Column(name = "is_real")
    private Boolean isReal;

    @Column(name = "extension_code")
    private String extensionCode;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "is_gift")
    private Short isGift;

    @Column(name = "goods_attr_id")
    private String goodsAttrId;

    @Column(name = "seller_id")
    private Integer sellerId;

    @Column(name = "express_name")
    private String expressName;

    @Column(name = "express_no")
    private String expressNo;

    private static final long serialVersionUID = 1L;
}