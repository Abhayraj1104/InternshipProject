package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ownerId;

    private String name;
    private String email;
    private String mobile;
	/**
	 * @return the ownerId
	 */
	public Long getOwnerId() {
		return ownerId;
	}
	/**
	 * @param ownerId the ownerId to set
	 */
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Owner [ownerId=" + ownerId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	/**
	 * @param ownerId
	 * @param name
	 * @param email
	 * @param mobile
	 */
	public Owner(Long ownerId, String name, String email, String mobile) {
		super();
		this.ownerId = ownerId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	/**
	 * 
	 */
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
