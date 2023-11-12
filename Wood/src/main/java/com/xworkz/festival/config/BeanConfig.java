package com.xworkz.festival.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.festival")
@EnableWebMvc
public class BeanConfig implements WebMvcConfigurer {

	public BeanConfig() {

		System.out.println("Created Bean Config");
	}
@Bean
	public ViewResolver viewResolver() {
		return new InternalResourceViewResolver("/", ".jsp");

	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {

		registry.addRedirectViewController("/", "Sweet.jsp");
	}

}
