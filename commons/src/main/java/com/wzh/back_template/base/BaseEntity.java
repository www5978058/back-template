package com.wzh.back_template.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @auther wzh
 * @date 2020/5/3 - 12:43
 **/
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = -7473229093381721864L;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime ctime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime mtime;
}
