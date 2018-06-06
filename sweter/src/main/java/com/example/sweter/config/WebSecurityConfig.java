package com.example.sweter.config;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Autowired
    private DataSource dataSource;
    @Override
    protected void configure (HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMathers("/", "/registration").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }
    @Override
    protected void configure (AuthenticationManagerBuilder auth) throws Exception{
        auth.jdbcAuthentication()
                .dataSourse(dataSource)
                .passwordEncoder(NoOpPasswordEncoder.getInstance());

    }
}
