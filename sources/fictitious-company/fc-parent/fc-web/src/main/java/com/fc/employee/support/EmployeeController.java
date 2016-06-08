/**
 * 
 */
package com.fc.employee.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fc.hr.employee.Employee;
import com.fc.hr.employee.EmployeeLogins;
import com.fc.hr.employee.support.EmployeeService;
import com.fc.support.PremitivesAndObjectsIds;

/**
 * @author Bishoy
 *
 */

@RestController 
@RequestMapping("/{username}/")
public class EmployeeController {
	
	private final EmployeeService employeeService;
	private final PremitivesAndObjectsIds premitivesAndObjectsIds;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService,
			PremitivesAndObjectsIds premitivesAndObjectsIds){
		this.employeeService = employeeService;
		this.premitivesAndObjectsIds = premitivesAndObjectsIds;
		
	}
	
	@RequestMapping(path="/login/{password}",method=RequestMethod.GET)
	public Employee login(@PathVariable String username, @PathVariable String password){
		Employee employee = null;
		try {
			employee = employeeService.login(new EmployeeLogins(username, password));
		}
		catch(Exception e){
			e.printStackTrace();
		}
//		try {
//			return new ObjectMapper().writer(premitivesAndObjectsIds.filters).writeValueAsString(employee);
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return employee;
	}
}
