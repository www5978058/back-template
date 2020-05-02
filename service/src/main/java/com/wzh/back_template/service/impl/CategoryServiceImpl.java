package com.wzh.back_template.service.impl;

import com.wzh.back_template.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wzh.back_template.mapper.CategoryMapper;
import com.wzh.back_template.service.CategoryService;
/**
@author wzh
@date 2020/1/7 - 15:18
*/
@Service
public class CategoryServiceImpl implements CategoryService{

    @Resource
    private CategoryMapper categoryMapper;

}
