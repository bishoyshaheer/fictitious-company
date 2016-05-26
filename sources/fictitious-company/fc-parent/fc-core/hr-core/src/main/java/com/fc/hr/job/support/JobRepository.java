/**
 * 
 */
package com.fc.hr.job.support;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fc.hr.job.Job;

/**
 * @author Bishoy.Shaheer
 *
 */
public interface JobRepository extends JpaRepository<Job, String> {

}
