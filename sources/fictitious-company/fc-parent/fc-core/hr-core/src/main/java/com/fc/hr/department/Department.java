package com.fc.hr.department;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fc.hr.employee.Employee;
import com.fc.hr.job.JobHistory;
import com.fc.hr.location.Location;

import java.util.List;


/**
 * The persistent class for the DEPARTMENTS database table.
 * 
 */
@Entity
@Table(name="DEPARTMENTS")
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
//@JsonFilter("premitivesAndObjectsIds")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="departmentId")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DEPARTMENT_ID")
	private Long departmentId;

	@Column(name="DEPARTMENT_NAME")
	private String departmentName;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="MANAGER_ID")
	private Employee employee;

	//bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name="LOCATION_ID")
	private Location location;

	//bi-directional many-to-one association to Employee
	@OneToMany(mappedBy="department")
	private List<Employee> employees;

	//bi-directional many-to-one association to JobHistory
	@OneToMany(mappedBy="department")
	private List<JobHistory> jobHistories;

	public Department() {
	}

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setDepartment(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setDepartment(null);

		return employee;
	}

	public List<JobHistory> getJobHistories() {
		return this.jobHistories;
	}

	public void setJobHistories(List<JobHistory> jobHistories) {
		this.jobHistories = jobHistories;
	}

	public JobHistory addJobHistory(JobHistory jobHistory) {
		getJobHistories().add(jobHistory);
		jobHistory.setDepartment(this);

		return jobHistory;
	}

	public JobHistory removeJobHistory(JobHistory jobHistory) {
		getJobHistories().remove(jobHistory);
		jobHistory.setDepartment(null);

		return jobHistory;
	}

}