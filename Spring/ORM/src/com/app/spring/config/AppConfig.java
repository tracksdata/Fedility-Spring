package com.app.spring.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Import({RepositoryConfig.class})
@Configuration
@EnableTransactionManagement
@ComponentScan(value={"com.app.spring.entities,com.app.spring.dao"})
public class AppConfig {
	public AppConfig() {
	System.out.println("---- app config");
	
	}

	@Bean
	public static PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer() {
		PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
		ppc.setLocation(new ClassPathResource("application.properties"));
		System.out.println("--- properties Obj "+ppc);
		ppc.setIgnoreUnresolvablePlaceholders(true);
		return ppc;
	}

}
