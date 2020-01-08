package com.wzh.back_template.convert;

import com.wzh.back_template.domain.Goods;
import com.wzh.back_template.domain.OrderGoods;
import com.wzh.back_template.domain.Suppliers;
import com.wzh.back_template.dto.OrderGoodDTO;
import com.wzh.back_template.mapper.CategoryMapper;
import com.wzh.back_template.mapper.GoodsMapper;
import com.wzh.back_template.mapper.SuppliersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author wzh
 * @date 2020/1/7 - 16:18
 */
@Component
public class OrderGoodDTOConvert extends BaseConverter<OrderGoods, OrderGoodDTO> {
    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    SuppliersMapper suppliersMapper;
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public OrderGoodDTO doForward(OrderGoods orderGoods) {
        OrderGoodDTO orderGoodDTO = super.doForward(orderGoods);
        Goods goods = goodsMapper.selectByPrimaryKey(orderGoods.getGoodsId());
        if(goods != null){
            orderGoodDTO.setSuppliersName(Optional.ofNullable(suppliersMapper.selectByPrimaryKey(goods.getSuppliersId().intValue())).map(Suppliers::getSuppliersName).orElse(null));
            orderGoodDTO.setCatName(categoryMapper.selectByPrimaryKey(goods.getCatId().intValue()).getCatName());
        }
        return orderGoodDTO;
    }

    @Override
    public OrderGoods doBackward(OrderGoodDTO orderGoodDTO) {
        throw new AssertionError("OrderGoodDTO不能逆转");
    }
}
