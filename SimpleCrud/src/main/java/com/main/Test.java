package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages="com.model")
@EnableJpaRepositories(basePackages="com.daoI")
@SpringBootApplication(scanBasePackages="com")
public class Test {
	public static void main(String[] args) {
		System.out.println("In main");
     SpringApplication.run(Test.class);
     System.out.println("Started");
     //hello sss
	}
}