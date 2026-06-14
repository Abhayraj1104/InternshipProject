package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Manager {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long managerId;

	    @OneToMany(mappedBy = "manager")
	    private List<Employee> employees;

	/**
	 * @return the managerId
	 */
	public Long getManagerId() {
		return managerId;
	}

	/**
	 * @param managerId the managerId to set
	 */
	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return null;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employees = employees;
	}

	/**
	 * @param managerId
	 * @param employee
	 */
	public Manager(Long managerId, Employee employee) {
		super();
		this.managerId = managerId;
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", employee=" + employees + "]";
	}

	/**
	 * 
	 */
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
