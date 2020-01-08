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
@Table(name = "ecs_order_info")
public class OrderInfo implements Serializable {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(generator = "JDBC")
    private Integer orderId;

    @Column(name = "order_sn")
    private String orderSn;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "order_status")
    private Boolean orderStatus;

    @Column(name = "shipping_status")
    private Boolean shippingStatus;

    @Column(name = "pay_status")
    private Boolean payStatus;

    @Column(name = "consignee")
    private String consignee;

    @Column(name = "country")
    private Short country;

    @Column(name = "province")
    private Short province;

    @Column(name = "city")
    private Short city;

    @Column(name = "district")
    private Short district;

    @Column(name = "address")
    private String address;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "tel")
    private String tel;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    @Column(name = "best_time")
    private String bestTime;

    @Column(name = "sign_building")
    private String signBuilding;

    @Column(name = "postscript")
    private String postscript;

    @Column(name = "shipping_id")
    private Byte shippingId;

    @Column(name = "shipping_name")
    private String shippingName;

    @Column(name = "pay_id")
    private Byte payId;

    @Column(name = "pay_name")
    private String payName;

    @Column(name = "how_oos")
    private String howOos;

    @Column(name = "how_surplus")
    private String howSurplus;

    @Column(name = "pack_name")
    private String packName;

    @Column(name = "card_name")
    private String cardName;

    @Column(name = "card_message")
    private String cardMessage;

    @Column(name = "inv_payee")
    private String invPayee;

    @Column(name = "inv_content")
    private String invContent;

    @Column(name = "goods_amount")
    private BigDecimal goodsAmount;

    @Column(name = "shipping_fee")
    private BigDecimal shippingFee;

    @Column(name = "insure_fee")
    private BigDecimal insureFee;

    @Column(name = "pay_fee")
    private BigDecimal payFee;

    @Column(name = "pack_fee")
    private BigDecimal packFee;

    @Column(name = "card_fee")
    private BigDecimal cardFee;

    /**
     * 对接erp专用，商品优惠总金额
     */
    @Column(name = "goods_discount_fee")
    private BigDecimal goodsDiscountFee;

    @Column(name = "money_paid")
    private BigDecimal moneyPaid;

    @Column(name = "surplus")
    private BigDecimal surplus;

    @Column(name = "integral")
    private Integer integral;

    @Column(name = "integral_money")
    private BigDecimal integralMoney;

    @Column(name = "bonus")
    private BigDecimal bonus;

    @Column(name = "order_amount")
    private BigDecimal orderAmount;

    @Column(name = "from_ad")
    private Short fromAd;

    @Column(name = "referer")
    private String referer;

    @Column(name = "add_time")
    private Integer addTime;

    @Column(name = "confirm_time")
    private Integer confirmTime;

    @Column(name = "pay_time")
    private Integer payTime;

    @Column(name = "shipping_time")
    private Integer shippingTime;

    @Column(name = "pack_id")
    private Byte packId;

    @Column(name = "card_id")
    private Byte cardId;

    @Column(name = "bonus_id")
    private Integer bonusId;

    @Column(name = "invoice_no")
    private String invoiceNo;

    @Column(name = "extension_code")
    private String extensionCode;

    @Column(name = "extension_id")
    private Integer extensionId;

    @Column(name = "to_buyer")
    private String toBuyer;

    @Column(name = "pay_note")
    private String payNote;

    @Column(name = "agency_id")
    private Short agencyId;

    @Column(name = "inv_type")
    private String invType;

    @Column(name = "tax")
    private BigDecimal tax;

    @Column(name = "is_separate")
    private Boolean isSeparate;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "discount")
    private BigDecimal discount;

    @Column(name = "callback_status")
    private Object callbackStatus;

    @Column(name = "lastmodify")
    private Integer lastmodify;

    @Column(name = "is_sync")
    private Integer isSync;

    /**
     * 是否申请过售后
     */
    @Column(name = "after_sale")
    private Integer afterSale;

    private static final long serialVersionUID = 1L;
}