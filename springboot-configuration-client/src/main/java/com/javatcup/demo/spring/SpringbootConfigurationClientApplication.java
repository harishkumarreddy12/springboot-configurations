package com.javatcup.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootConfigurationClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConfigurationClientApplication.class, args);
	}

	@Autowired
	void setEnvironment(Environment e){
		System.out.println(e.getProperty("configuration.projectName"));
	}
}