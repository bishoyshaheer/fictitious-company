/**
 * 
 */
package com.fc.hr.employee.support;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fc.hr.employee.Employee;

/**
 * @author Bishoy.Shaheer
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query(value = "SELECT PASSWORD FROM EMPLOYEES WHERE USERNAME = ?1", nativeQuery = true)
	String findPassword(String username);

	@Query("select u from Employee u where u.username = ?1")
	Employee findByUsername(String username);
	
}
