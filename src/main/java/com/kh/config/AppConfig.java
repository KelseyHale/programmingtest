package com.kh.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.context.annotation.Bean;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.kh.service", "com.kh.controller"})
public class AppConfig {
	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setViewClass(JstlView.class);
	    resolver.setPrefix("/WEB-INF/jsp/");
	    resolver.setSuffix(".jsp");
	    return resolver;
	}
}
