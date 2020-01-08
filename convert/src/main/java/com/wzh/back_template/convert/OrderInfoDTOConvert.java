package com.wzh.back_template.convert;

import com.wzh.back_template.domain.OrderInfo;
import com.wzh.back_template.dto.OrderInfoDTO;
import com.wzh.back_template.mapper.RegionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author wzh
 * @date 2020/1/7 - 16:18
 */
@Component
public class OrderInfoDTOConvert extends BaseConverter<OrderInfo, OrderInfoDTO> {
    @Autowired
    RegionMapper regionMapper;
    @Override
    public OrderInfoDTO doForward(OrderInfo orderInfo) {
        OrderInfoDTO orderInfoDTO = super.doForward(orderInfo);
        orderInfoDTO.setPayTime(new Date(orderInfo.getPayTime() * 1000L));
        orderInfoDTO.setAddress(getAddress(orderInfo));
        return orderInfoDTO;
    }

    @Override
    public OrderInfo doBackward(OrderInfoDTO orderInfoDTO) {
        throw new AssertionError("OrderGoodDTO不能逆转");
    }

    private String getAddress(OrderInfo orderInfo){
        String province = regionMapper.selectByPrimaryKey(orderInfo.getProvince()).getRegionName();
        String city = regionMapper.selectByPrimaryKey(orderInfo.getCity()).getRegionName();
        String district = regionMapper.selectByPrimaryKey(orderInfo.getDistrict()).getRegionName();
        return province+city+district+orderInfo.getAddress();
    }
}
