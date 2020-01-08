package com.wzh.back_template.controller;

import com.wzh.back_template.domain.OrderInfo;
import com.wzh.back_template.dto.OrderInfoDTO;
import com.wzh.back_template.param.OrderInfoParam;
import com.wzh.back_template.service.OrderInfoService;
import com.wzh.back_template.utils.ExcelUtils;
import com.wzh.back_template.web.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * @author wzh
 * @date 2020/1/3 - 9:27
 */
@Controller
@RequestMapping("/order")
public class OrderInfoController {
    @Autowired
    OrderInfoService orderInfoService;

    @ResponseBody
    @GetMapping("/page")
    public PageInfo<OrderInfoDTO> page(@RequestParam(required = false,defaultValue = "0") int draw,
                                       @RequestParam(required = false,defaultValue = "0") int start,
                                       @RequestParam(required = false,defaultValue = "10") int length, OrderInfoParam orderInfoParam, Model model){
        Example example = new Example(OrderInfo.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(orderInfoParam.getStartDate())) {
            criteria.andGreaterThanOrEqualTo("payTime",LocalDateTime.parse(orderInfoParam.getStartDate(),DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toEpochSecond(ZoneOffset.of("+8")));
        }

        if (StringUtils.isNotBlank(orderInfoParam.getEndDate())) {
            criteria.andLessThanOrEqualTo("payTime",LocalDateTime.parse(orderInfoParam.getEndDate(),DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toEpochSecond(ZoneOffset.of("+8")));
        }
        if(StringUtils.isNotBlank(orderInfoParam.getOrderSn())){
            criteria.andEqualTo("orderSn",orderInfoParam.getOrderSn());
        }
        criteria.andEqualTo("payStatus", 2);
        example.setOrderByClause("pay_time desc");
        return orderInfoService.page(draw,start,length,example);
    }

    @GetMapping("download")
    public void download(@RequestParam(value = "ids") String[] orderSns,HttpServletResponse response) throws IOException {
        ExcelUtils.download("新订单",orderInfoService.download(Arrays.asList(orderSns)),response);
    }

}
