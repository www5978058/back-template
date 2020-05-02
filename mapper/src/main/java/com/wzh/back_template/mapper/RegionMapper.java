package com.wzh.back_template.mapper;

import com.wzh.back_template.domain.Region;
import com.wzh.back_template.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

/**
@author wzh
@date 2020/1/7 - 15:18
*/
@CacheNamespace(implementation = RedisCache.class)
public interface RegionMapper extends MyMapper<Region> {
}