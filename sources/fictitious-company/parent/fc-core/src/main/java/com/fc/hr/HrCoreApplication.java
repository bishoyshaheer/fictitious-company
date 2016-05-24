package com.fc.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fc.hr.domain.dao.EmployeeRepository;
import com.fc.hr.domain.model.Employee;

@RestController
@SpringBootApplication
public class HrCoreApplication {

	@Autowired
	EmployeeRepository er;
	@RequestMapping("/bisho")
	public String home(){
		Employee e = er.findOne(Long.valueOf(199));
		return "hello world\nbishoy is here8 " + e.getFirstName();
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(HrCoreApplication.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
		System.out.println("hello world\nbishoy is here");
	}
	
}
