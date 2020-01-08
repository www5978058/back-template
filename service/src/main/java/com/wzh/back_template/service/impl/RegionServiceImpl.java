package com.wzh.back_template.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wzh.back_template.mapper.RegionMapper;
import com.wzh.back_template.service.RegionService;
/**
@author wzh
@date 2020/1/7 - 15:18
*/
@Service
public class RegionServiceImpl implements RegionService{

    @Resource
    private RegionMapper regionMapper;

}
