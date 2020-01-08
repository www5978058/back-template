package com.wzh.back_template.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wzh.back_template.mapper.SuppliersMapper;
import com.wzh.back_template.service.SuppliersService;
/**
@author wzh
@date 2020/1/7 - 15:18
*/
@Service
public class SuppliersServiceImpl implements SuppliersService{

    @Resource
    private SuppliersMapper suppliersMapper;

}
