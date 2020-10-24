package com.zzz;

import com.zzz.domain.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigBean.class)
public class Part2Application {

    public static void main(String[] args) {
        SpringApplication.run(Part2Application.class, args);
    }

}
