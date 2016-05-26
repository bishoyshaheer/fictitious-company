/**
 * 
 */
package com.fc.hr.department.support;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fc.hr.department.Department;

/**
 * @author Bishoy.Shaheer
 *
 */
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
