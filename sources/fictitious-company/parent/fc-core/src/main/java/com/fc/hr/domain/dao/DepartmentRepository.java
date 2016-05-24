/**
 * 
 */
package com.fc.hr.domain.dao;

import org.springframework.data.repository.CrudRepository;

import com.fc.hr.domain.model.Department;

/**
 * @author Bishoy.Shaheer
 *
 */
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
