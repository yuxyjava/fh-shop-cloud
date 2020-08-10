package com.fh.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.fh.shop.api.cate.mapper")
@EnableDiscoveryClient
public class ShopCategoryApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopCategoryApiApplication.class, args);
    }

}
