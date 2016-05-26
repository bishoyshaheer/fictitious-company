/**
 * 
 */
package com.fc.hr.location.support;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fc.hr.location.Location;

/**
 * @author Bishoy.Shaheer
 *
 */
public interface LocationRepository extends JpaRepository<Location, Long> {

}
