package com.fc.hr;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HrCoreApplication {

	@RequestMapping("/bisho")
	public String home(){
		return "hello world\nbishoy is here8";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(HrCoreApplication.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
		System.out.println("hello world\nbishoy is here");
	}
	
}
