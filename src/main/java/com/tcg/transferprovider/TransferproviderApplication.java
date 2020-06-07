package com.tcg.transferprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@EnableDubboConfiguration
@SpringBootApplication
public class TransferproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransferproviderApplication.class, args);
    }

}
