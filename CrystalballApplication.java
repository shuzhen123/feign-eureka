package com.shulian.slt.crystalball;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.shulian.slt.crystalball.dao")
@EnableScheduling
public class CrystalballApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrystalballApplication.class, args);
    }
}
