/**
 * 
 */
package com.fc.hr.domain.dao;

import org.springframework.data.repository.CrudRepository;

import com.fc.hr.domain.model.Employee;

/**
 * @author Bishoy.Shaheer
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
