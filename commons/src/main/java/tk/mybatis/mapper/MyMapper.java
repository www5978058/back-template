package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author wzh
 * @date 2020/1/7 - 13:13
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
