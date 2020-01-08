package com.wzh.back_template.web;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @author wzh
 * @date 2020/1/8 - 9:06
 */
@Data
@Accessors(chain = true)
public class PageInfo<T> implements Serializable {
    private static final long serialVersionUID = -8319941281768481797L;
    private int draw;
    private int recordsTotal;
    private int recordsFiltered;
    private List<T> data;
    private String error;
}
