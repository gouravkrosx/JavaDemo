package com.example.jdk20demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Jdk20DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Jdk20DemoApplication.class, args);
    }

}
