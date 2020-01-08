package com.wzh.back_template.service;

import com.wzh.back_template.dto.OrderInfoDTO;
import com.wzh.back_template.excel.OrderExcel;
import com.wzh.back_template.web.PageInfo;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
@author wzh
@date 2020/1/7 - 15:18
*/
public interface OrderInfoService{

    /**
     * 分页查询
     * @param draw 页码
     * @param start 开始位置
     * @param length 长度
     * @param example 条件
     * @return 分页对象
     */
    PageInfo<OrderInfoDTO> page(int draw, int start, int length, Example example);

    /**
     * 根据订单号导出订单
     * @param orderSn 订单号
     * @return 订单excel格式
     */
    List<OrderExcel> download(List<String> orderSn);
}
