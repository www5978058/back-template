package com.wzh.back_template.convert;

import com.wzh.back_template.domain.OrderGoods;
import com.wzh.back_template.domain.OrderInfo;
import com.wzh.back_template.excel.OrderExcel;
import com.wzh.back_template.mapper.OrderGoodsMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wzh
 * @date 2020/1/8 - 10:32
 */
@Component
public class OrderExcelConvert extends BaseConverter<OrderInfo, List<OrderExcel>> {
    @Autowired
    OrderGoodsMapper orderGoodsMapper;
    @Autowired
    OrderInfoDTOConvert orderInfoDTOConvert;
    @Autowired
    OrderGoodDTOConvert orderGoodDTOConvert;
    @Override
    public List<OrderExcel> doForward(OrderInfo orderInfo) {
        List<OrderExcel> list = new ArrayList<>();
        this.selectOrderGoodsByOrderId(orderInfo.getOrderId()).stream().map(orderGoodDTOConvert::doForward).forEach(a -> {
            OrderExcel orderExcel = new OrderExcel();
            BeanUtils.copyProperties(orderInfoDTOConvert.doForward(orderInfo),orderExcel);
            BeanUtils.copyProperties(a,orderExcel);
            list.add(orderExcel);
        });
        return list;
    }

    private List<OrderGoods> selectOrderGoodsByOrderId(Integer orderId){
        Example example = new Example(OrderGoods.class);
        example.createCriteria().andEqualTo("orderId",orderId);
        return orderGoodsMapper.selectByExample(example);
    }
}

