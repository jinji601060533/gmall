package com.atguigu.gmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.整合mybatis-plus 在common中已依赖，此项目依赖common
 * 2.在application.yml中配置数据源
 * 3.使用注解mapperscan告诉mybatisplus mapper接口在哪
 *      在yml文件中配置mapper-locations，告知mubatis plus 映射文件在哪
 */
@MapperScan("com.atguigu.gmall.product.dao")
@SpringBootApplication
public class GmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallProductApplication.class, args);
    }

}
