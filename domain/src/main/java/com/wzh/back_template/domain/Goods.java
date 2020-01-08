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
@Table(name = "ecs_goods")
public class Goods implements Serializable {
    @Id
    @Column(name = "goods_id")
    @GeneratedValue(generator = "JDBC")
    private Integer goodsId;

    @Column(name = "cat_id")
    private Short catId;

    @Column(name = "goods_sn")
    private String goodsSn;

    @Column(name = "goods_name")
    private String goodsName;

    @Column(name = "goods_name_style")
    private String goodsNameStyle;

    @Column(name = "click_count")
    private Integer clickCount;

    @Column(name = "brand_id")
    private Short brandId;

    @Column(name = "provider_name")
    private String providerName;

    @Column(name = "goods_number")
    private Integer goodsNumber;

    @Column(name = "goods_weight")
    private BigDecimal goodsWeight;

    @Column(name = "market_price")
    private BigDecimal marketPrice;

    @Column(name = "virtual_sales")
    private Short virtualSales;

    @Column(name = "shop_price")
    private BigDecimal shopPrice;

    @Column(name = "promote_price")
    private BigDecimal promotePrice;

    @Column(name = "promote_start_date")
    private Integer promoteStartDate;

    @Column(name = "promote_end_date")
    private Integer promoteEndDate;

    @Column(name = "warn_number")
    private Byte warnNumber;

    @Column(name = "keywords")
    private String keywords;

    @Column(name = "goods_brief")
    private String goodsBrief;

    @Column(name = "goods_desc")
    private String goodsDesc;

    @Column(name = "goods_thumb")
    private String goodsThumb;

    @Column(name = "goods_img")
    private String goodsImg;

    @Column(name = "original_img")
    private String originalImg;

    @Column(name = "is_real")
    private Byte isReal;

    @Column(name = "extension_code")
    private String extensionCode;

    @Column(name = "is_on_sale")
    private Boolean isOnSale;

    @Column(name = "is_alone_sale")
    private Boolean isAloneSale;

    @Column(name = "is_shipping")
    private Boolean isShipping;

    @Column(name = "integral")
    private Integer integral;

    @Column(name = "add_time")
    private Integer addTime;

    @Column(name = "sort_order")
    private Short sortOrder;

    @Column(name = "is_delete")
    private Boolean isDelete;

    @Column(name = "is_best")
    private Boolean isBest;

    @Column(name = "is_new")
    private Boolean isNew;

    @Column(name = "is_hot")
    private Boolean isHot;

    @Column(name = "is_promote")
    private Boolean isPromote;

    @Column(name = "bonus_type_id")
    private Byte bonusTypeId;

    @Column(name = "last_update")
    private Integer lastUpdate;

    @Column(name = "goods_type")
    private Short goodsType;

    @Column(name = "seller_note")
    private String sellerNote;

    @Column(name = "give_integral")
    private Integer giveIntegral;

    @Column(name = "rank_integral")
    private Integer rankIntegral;

    @Column(name = "suppliers_id")
    private Short suppliersId;

    @Column(name = "is_check")
    private Boolean isCheck;

    /**
     * 手输运费
     */
    @Column(name = "ship_fee")
    private BigDecimal shipFee;

    @Column(name = "is_oversea")
    private Boolean isOversea;

    @Column(name = "is_separate")
    private Boolean isSeparate;

    private static final long serialVersionUID = 1L;
}