package com.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc

public class WebMvcConfig implements WebMvcConfigurer {

   // Static Resource Config
	
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
   
       // Css/images resource.
       registry.addResourceHandler("/resources/**") //
                 .addResourceLocations("/resources/").setCachePeriod(31556926);
       
   }

   
  /* @Override
   public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
       configurer.enable();
   }*/

}