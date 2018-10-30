package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ImportResource(value = {"classpath:spring-dubbo-consumer.xml"})
public class ChashApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChashApplication.class, args);
    }
}
