package com.wzh.back_template.base;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.MyMapper;

import java.time.LocalDateTime;

/**
 * @auther wzh
 * @date 2020/5/3 - 12:50
 **/
@Service
@Transactional(readOnly = true)
public class BaseServiceImpl<T extends BaseEntity,M extends MyMapper<T>> implements BaseService<T> {
    @Autowired
    protected M mapper;
    @Override
    @Transactional(readOnly = false)
    public int insert(T t) {
        LocalDateTime now = LocalDateTime.now();
        t.setCtime(now);
        t.setMtime(now);
        return mapper.insert(t);
    }

    @Override
    @Transactional(readOnly = false)
    public int delete(T t) {
        return mapper.delete(t);
    }

    @Override
    @Transactional(readOnly = false)
    public int update(T t) {
        t.setMtime(LocalDateTime.now());
        return mapper.updateByPrimaryKeySelective(t);
    }

    @Override
    public int count(T t) {
        return mapper.selectCount(t);
    }

    @Override
    public T selectOne(T t) {
        return mapper.selectOne(t);
    }

    @Override
    public PageInfo<T> page(int pageNum, int pageSize, T t) {
        PageHelper.startPage(pageNum,pageSize);
        PageInfo<T> pageInfo = new PageInfo<>(mapper.select(t));
        return pageInfo;
    }
}
