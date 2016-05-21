package com.fc.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.SocketUtils;

@SpringBootApplication
public class HrCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrCoreApplication.class, args);
		System.out.println("hello world");
	}
}
