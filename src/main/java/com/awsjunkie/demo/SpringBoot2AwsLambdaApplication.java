package com.awsjunkie.demo;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.awsjunkie.demo.model.User;

@SpringBootApplication
public class SpringBoot2AwsLambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2AwsLambdaApplication.class, args);
	}
	
	// org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest
	@Bean
	public Function<User, String> uppercase() {
		return user -> {
				return String.format("Hello %s!", user.getName());
		};
	}

}
