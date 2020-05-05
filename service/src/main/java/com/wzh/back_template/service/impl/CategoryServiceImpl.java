package com.wzh.back_template.service.impl;

import com.wzh.back_template.base.BaseServiceImpl;
import com.wzh.back_template.domain.Category;
import com.wzh.back_template.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wzh.back_template.mapper.CategoryMapper;
import com.wzh.back_template.service.CategoryService;
import tk.mybatis.mapper.entity.Example;

import java.time.LocalDateTime;
import java.util.List;

/**
@author wzh
@date 2020/1/7 - 15:18
*/
@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category,CategoryMapper> implements CategoryService{
    @Override
    public List<Category> selectLastOne(){
        Example example = new Example(Category.class);
        example.createCriteria().andGreaterThanOrEqualTo("mtime", LocalDateTime.of(2020,1,5,10,10));
        return mapper.selectByExample(example);
    }
}
