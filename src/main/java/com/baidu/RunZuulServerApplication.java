package com.baidu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 2 *@ClassName RunZuulServerApplication
 * 3 *@Description: TODO
 * 4 *@Author 王振方
 * 5 *@Date 2021/1/4
 *
 * @Version V1.0
 * 7
 **/

@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
public class RunZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunZuulServerApplication.class, new String[0]);
    }
}

