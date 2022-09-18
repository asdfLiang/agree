package com.ctm.deploy;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@MapperScan({"com.ctm.dal.mapper"})
@SpringBootApplication(scanBasePackages = {"com.ctm"})
public class ContractTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContractTemplateApplication.class, args);
    }
}
