package com.wzh.back_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wzh
 * @date 2020/1/7 - 15:25
 */
@SpringBootApplication(scanBasePackages = "com.wzh.back_template")
@MapperScan("com.wzh.back_template.mapper")
public class WebAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminApplication.class,args);
    }
}
