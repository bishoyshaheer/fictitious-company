/**
 * 
 */
package com.fc.hr.location.support;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fc.hr.department.Department;

/**
 * @author Bishoy.Shaheer
 *
 */
public interface CountryRepository extends JpaRepository<Department, Long> {

}
