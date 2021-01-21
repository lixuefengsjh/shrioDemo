package com.lxf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: lxf
 * @create: 2021-01-20 11:12
 * @description:
 */
@SpringBootApplication
@MapperScan("com.lxf.mapper")
public class ShrioAoolication {
    public static void main(String[] args) {
        SpringApplication.run(ShrioAoolication.class,args);
    }
}
