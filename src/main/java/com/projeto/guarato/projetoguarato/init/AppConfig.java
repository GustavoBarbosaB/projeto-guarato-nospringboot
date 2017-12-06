package com.projeto.guarato.projetoguarato.init;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.projeto.guarato.projetoguarato"})
public class AppConfig extends WebMvcConfigurerAdapter {
}
