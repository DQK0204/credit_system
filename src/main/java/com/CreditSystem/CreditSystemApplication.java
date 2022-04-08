package com.CreditSystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.CreditSystem.Mapper")
@SpringBootApplication
public class CreditSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditSystemApplication.class, args);
    }

}
