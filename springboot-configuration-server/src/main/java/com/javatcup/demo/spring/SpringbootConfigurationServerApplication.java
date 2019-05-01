package com.javatcup.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringbootConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConfigurationServerApplication.class, args);
	}

}
