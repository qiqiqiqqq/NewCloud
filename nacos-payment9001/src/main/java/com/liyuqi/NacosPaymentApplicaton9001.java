package com.liyuqi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentApplicaton9001 {

    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentApplicaton9001.class,args);
    }
}
