package com.cm.deploy;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo(scanBasePackages = {"com.cm.service.client"})
@MapperScan({"com.cm.dal.mapper"})
@SpringBootApplication(scanBasePackages = {"com.cm"})
public class ContractManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContractManagerApplication.class, args);
    }
}
