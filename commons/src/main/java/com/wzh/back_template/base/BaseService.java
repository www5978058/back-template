package com.wzh.back_template.base;


import com.github.pagehelper.PageInfo;

/**
 * @auther wzh
 * @date 2020/5/3 - 12:48
 **/
public interface BaseService<T extends BaseEntity> {
    int insert(T t);

    int delete(T t);

    int update(T t);

    int count(T t);

    T selectOne(T t);

    PageInfo<T> page(int pageNum, int pageSize, T t);
}
