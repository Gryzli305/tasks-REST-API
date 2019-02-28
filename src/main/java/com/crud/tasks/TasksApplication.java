package com.crud.tasks;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import org.springframework.test.context.junit4.SpringRunner;

//public class TasksApplication extends SpringBootServletInitializer {
//@RunWith(SpringRunner.class)
@SpringBootApplication
public class TasksApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(TasksApplication.class, args);
    }


//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(TasksApplication.class);
//    }

}

