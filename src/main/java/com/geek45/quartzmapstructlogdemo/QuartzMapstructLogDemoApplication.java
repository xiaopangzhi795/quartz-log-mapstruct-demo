package com.geek45.quartzmapstructlogdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class QuartzMapstructLogDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuartzMapstructLogDemoApplication.class, args);
    }

}
