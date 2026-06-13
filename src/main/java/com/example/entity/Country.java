package com.example.entity;

import jakarta.persistence.*;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long countryId;

    private String countryName;

	/**
	 * @return the countryId
	 */
	public Long getCountryId() {
		return countryId;
	}

	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
	}

	/**
	 * @param countryId
	 * @param countryName
	 */
	public Country(Long countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	/**
	 * 
	 */
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
