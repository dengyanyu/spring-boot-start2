package com.baidu;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
       /* ApplicationContext ctx = */
    	SpringApplication.run(Application.class, args);
        System.out.println("项目启动成功!");
        /*System.out.println("让我们了解一下springboot提供的beans:");
        
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }*/
    }

}
