package com.example.test_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringbootApplication.class, args);
    }

    public int test(int number) {
        return number * 10;
    }

}
