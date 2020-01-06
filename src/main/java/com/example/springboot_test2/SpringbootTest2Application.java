package com.example.springboot_test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SpringbootTest2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTest2Application.class, args);
    }

}
