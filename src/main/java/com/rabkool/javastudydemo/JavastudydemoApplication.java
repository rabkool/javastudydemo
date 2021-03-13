package com.rabkool.javastudydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author RabKool
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JavastudydemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavastudydemoApplication.class, args);
    }
}
