package com.newlecture.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration		//	"구성을 담당하는 애입니다" 라고 알려준다
@EnableWebMvc		//	
@Component("com.newlecture.web.config")	//	패키지의 경로
public class WebApplicationContextConfig extends WebMvcConfigurerAdapter {		// 기존에 쓰던 ServletContext.xml과 같다
	

	
}
