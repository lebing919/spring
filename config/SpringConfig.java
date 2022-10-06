package com.hbwl.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.hbwl")
@Import({JdbcConfig.class,MybatisConfig.class})
@PropertySource("jdbc.properties")
public class SpringConfig {
}
