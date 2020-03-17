package com.lvtu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * ClassName:MySpringBoot
 * Package:com.lvtu
 * Description:TODO
 *
 * @Date:2020/2/13 0013 16:47
 * Author:2498897200@qq.com
 */
@SpringBootApplication
public class MySpringBoot  extends SpringBootServletInitializer{

    public static void main(String[] args)  {
        SpringApplication.run(MySpringBoot.class, args);

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }

}
