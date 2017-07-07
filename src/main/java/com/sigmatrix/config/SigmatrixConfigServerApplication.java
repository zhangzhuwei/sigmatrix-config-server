package com.sigmatrix.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableConfigServer
//@SpringBootApplication
public class SigmatrixConfigServerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SigmatrixConfigServerApplication.class, args);
		SpringApplication.run(SigmatrixConfigServerApplication.class, args).getEnvironment();
	}
}
