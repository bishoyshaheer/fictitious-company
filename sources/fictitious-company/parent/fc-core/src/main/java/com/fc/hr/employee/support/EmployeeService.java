package com.fc.hr.employee.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.hr.employee.Employee;
import com.fc.hr.employee.EmployeeLogins;
import com.fc.hr.employee.IncorrectUsernamePasswordException;

/**
 * Service providing high-level, selectively cached data access and other {@link Employee}
 * -related operations.
 */
@Service
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public Employee login(EmployeeLogins employeeLogins) throws IncorrectUsernamePasswordException {
		String password = employeeRepository.findPassword(employeeLogins.getUsername());
		if (password.isEmpty()) throw new IncorrectUsernamePasswordException();
		if (!password.equals(employeeLogins.getPassword())) throw new IncorrectUsernamePasswordException();
		return employeeRepository.findByUsername(employeeLogins.getUsername());
	}
}
