package com.wzh.back_template.service.impl;

import com.github.pagehelper.PageHelper;
import com.wzh.back_template.convert.OrderExcelConvert;
import com.wzh.back_template.convert.OrderInfoDTOConvert;
import com.wzh.back_template.domain.OrderInfo;
import com.wzh.back_template.dto.OrderInfoDTO;
import com.wzh.back_template.excel.OrderExcel;
import com.wzh.back_template.mapper.OrderInfoMapper;
import com.wzh.back_template.service.OrderInfoService;
import com.wzh.back_template.web.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wzh
 * @date 2020/1/7 - 15:18
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Resource
    private OrderInfoMapper orderInfoMapper;
    @Autowired
    OrderInfoDTOConvert orderInfoDTOConvert;
    @Autowired
    OrderExcelConvert orderExcelConvert;

    @Override
    public PageInfo<OrderInfoDTO> page(int draw, int start, int length, Example example) {
        int total = orderInfoMapper.selectCountByExample(example);
        List<OrderInfoDTO> list = null;
        if (total > 0) {
            PageHelper.startPage(start/length+1, length);
            list = orderInfoMapper.selectByExample(example).stream().map(orderInfoDTOConvert::doForward).collect(Collectors.toList());
        }
        PageInfo<OrderInfoDTO> pageInfo = new PageInfo<>();
        return pageInfo.setDraw(draw)
                .setRecordsTotal(total)
                .setRecordsFiltered(total)
                .setData(list);
    }

    @Override
    public List<OrderExcel> download(List<String> orderSn) {
        Example example = new Example(OrderInfo.class);
        example.createCriteria().andIn("orderSn",orderSn);
        List<OrderInfo> orderInfos = orderInfoMapper.selectByExample(example);
        return orderInfos.stream().map(orderExcelConvert::doForward).flatMap(List::stream).collect(Collectors.toList());
    }
}
