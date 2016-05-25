/**
 * 
 */
package com.fc.hr.employee;


/**
 * @author Bishoy.Shaheer
 *
 */
public class EmployeeLogins {
	
	private final String username;
	private final String password;

	public EmployeeLogins(String username, String Password) {
		this.username = username;
		this.password = Password;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
