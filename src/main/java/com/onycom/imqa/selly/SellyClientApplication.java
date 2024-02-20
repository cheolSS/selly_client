package com.onycom.imqa.selly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = {"imqa.dashboard.runner", "imqa.dashboard.vo"})
@EnableAsync
public class SellyClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellyClientApplication.class, args);
    }

}
