package com.wzh.back_template.service;

import com.wzh.back_template.base.BaseService;
import com.wzh.back_template.domain.Category;

import java.util.List;

/**
@author wzh
@date 2020/1/7 - 15:18
*/
public interface CategoryService extends BaseService<Category> {
    /**
     * 测试扩展查询
     * @return
     */
    List<Category> selectLastOne();
}
