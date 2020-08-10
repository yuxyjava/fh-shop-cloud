package com.fh.shop.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.fh.shop.api.product.mapper")
@EnableDiscoveryClient
public class ShopGoodsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopGoodsApiApplication.class, args);
    }

}
