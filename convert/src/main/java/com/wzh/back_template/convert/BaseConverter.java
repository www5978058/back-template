package com.wzh.back_template.convert;

import com.google.common.base.Converter;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.ParameterizedType;

/**
 * 基础的转换实现
 * A,B对象必须有无参构造器
 * @author wzh
 * @date 2020/1/7 - 16:46
 */
public class BaseConverter<A,B> extends Converter<A,B> {

    @Override
    public B doForward(A a) {
        B b = getB();
        BeanUtils.copyProperties(a,b);
        return b;
    }

    @Override
    public A doBackward(B b) {
        A a = getA();
        BeanUtils.copyProperties(b,a);
        return a;
    }

    private A getA(){
        ParameterizedType ptype = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class clazz = (Class<A>) ptype.getActualTypeArguments()[0];
        try {
            A a = (A) clazz.newInstance();
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private B getB(){
        ParameterizedType ptype = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class clazz = (Class<B>) ptype.getActualTypeArguments()[1];
        try {
            B b = (B) clazz.newInstance();
            return b;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
