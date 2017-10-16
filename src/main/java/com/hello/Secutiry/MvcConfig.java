package com.hello.Secutiry;

/**
 * Created by fatimam on 07/09/2017.
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hello").setViewName("helloView1");
        registry.addViewController("/").setViewName("helloView2");
        registry.addViewController("/hello/deleteAddress").setViewName("deleteAddress1");
        registry.addViewController("/hello/addAddress").setViewName("addAddress1");
        registry.addViewController("/hello/updateAddress").setViewName("updateAddress");
    }

}