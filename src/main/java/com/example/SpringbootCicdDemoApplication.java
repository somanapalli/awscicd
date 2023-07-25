package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCicdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCicdDemoApplication.class, args);
	}
	
	@GetMapping("/getData")
	public String getData()
	{
		return "welcome to aws cicd process using codepipeline and codebuild";
	}

}
