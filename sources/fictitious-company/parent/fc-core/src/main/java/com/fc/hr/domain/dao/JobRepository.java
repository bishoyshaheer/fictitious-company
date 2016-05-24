/**
 * 
 */
package com.fc.hr.domain.dao;

import org.springframework.data.repository.CrudRepository;

import com.fc.hr.domain.model.Job;

/**
 * @author Bishoy.Shaheer
 *
 */
public interface JobRepository extends CrudRepository<Job, String> {

}
