package com.example.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CompanyResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long responseId;

    private String responseText;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "query_id")
    private CustomerQuery customerQuery;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "employee_id")
    private Employee employee;

	/**
	 * @return the responseId
	 */
	public Long getResponseId() {
		return responseId;
	}

	/**
	 * @param responseId the responseId to set
	 */
	public void setResponseId(Long responseId) {
		this.responseId = responseId;
	}

	/**
	 * @return the responseText
	 */
	public String getResponseText() {
		return responseText;
	}

	/**
	 * @param responseText the responseText to set
	 */
	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	/**
	 * @return the customerQuery
	 */
	public CustomerQuery getCustomerQuery() {
		return customerQuery;
	}

	/**
	 * @param customerQuery the customerQuery to set
	 */
	public void setCustomerQuery(CustomerQuery customerQuery) {
		this.customerQuery = customerQuery;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * @param responseId
	 * @param responseText
	 * @param customerQuery
	 * @param employee
	 */
	public CompanyResponse(Long responseId, String responseText, CustomerQuery customerQuery, Employee employee) {
		super();
		this.responseId = responseId;
		this.responseText = responseText;
		this.customerQuery = customerQuery;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "CompanyResponse [responseId=" + responseId + ", responseText=" + responseText + ", customerQuery="
				+ customerQuery + ", employee=" + employee + "]";
	}

	/**
	 *
	 */
	public CompanyResponse() {
		super();
		// TODO Auto-generated constructor stub
	}


}
