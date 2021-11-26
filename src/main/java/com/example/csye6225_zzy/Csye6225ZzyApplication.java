package com.example.csye6225_zzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Csye6225ZzyApplication {

    public static void main(String[] args) {
        SpringApplication.run(Csye6225ZzyApplication.class, args);
    }

}
