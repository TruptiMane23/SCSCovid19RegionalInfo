package com.example.scs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringConfig implements WebMvcConfigurer {

	@Autowired
	RequestResponseValidator requestResponseValidator;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("In SpringConfig");
		//registry.addInterceptor(requestResponseValidator).excludePathPatterns("/CovidSession.html");
		registry.addInterceptor(requestResponseValidator).excludePathPatterns("/home");
	}

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){ 
            registry.addResourceHandler("/**")
                 .addResourceLocations("classpath:/static/");
    }
}
