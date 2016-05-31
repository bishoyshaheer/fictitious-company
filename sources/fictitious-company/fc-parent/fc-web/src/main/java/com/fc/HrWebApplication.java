package com.fc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fc.hr.employee.Employee;
import com.fc.hr.employee.EmployeeLogins;
import com.fc.hr.employee.support.EmployeeRepository;
import com.fc.hr.employee.support.EmployeeService;

@RestController
@SpringBootApplication
public class HrWebApplication {

	@Autowired
	EmployeeRepository er;
	
	@Autowired
	EmployeeService es;
	
	@Autowired
	ResourceProperties rp;
//	
	@RequestMapping("/bisho")
	public String home(){
		Employee e = er.findOne(Long.valueOf(199));
		//test service
		e = es.login(new EmployeeLogins("100", "password"));
		
		rp.getStaticLocations();
		
		return "hello world\nbishoy is here   " + e.getFirstName()+e.getEmail();
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(HrWebApplication.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
		System.out.println("hello world\nbishoy is here");
	}
	
}
