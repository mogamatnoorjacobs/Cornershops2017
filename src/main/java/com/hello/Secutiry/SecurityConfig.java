package com.hello.Secutiry;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by fatimam on 07/09/2017.
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(AuthenticationManagerBuilder amb) throws Exception {
        amb.inMemoryAuthentication().withUser("user").password("user")
                .roles("USER").and().withUser("admin").password("admin").roles("ADMIN");
    }

    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.httpBasic().and().authorizeRequests().antMatchers("/hello/addAddress/**","/hello/updateAddress/**","/hello/deleteAddress/**")
                .hasRole("ADMIN").and().csrf().disable().headers().frameOptions().disable();
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests().and().antMatcher("/hello/addAddress/").hasRole("ADMIN").anyRequest().authenticated();
//             //   .antMatchers("/", "/hello/**","/hello/updateAddress/**","/hello/addAddress/**","/hello/deleteAddress/**");
//               // .antMatchers("/","/hello").permitAll()
//             //   .antMatchers("/hello/addAddress/").hasRole("ADMIN").anyRequest().authenticated();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password("user").roles("USER").and().withUser("admin").password("admin").roles("ADMIN");;
//    }


}
