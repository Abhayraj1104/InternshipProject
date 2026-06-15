package com.example.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Taluka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long talukaId;

    private String talukaName;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "district_id")
    private District district;

	/**
	 * @return the talukaId
	 */
	public Long getTalukaId() {
		return talukaId;
	}

	/**
	 * @param talukaId the talukaId to set
	 */
	public void setTalukaId(Long talukaId) {
		this.talukaId = talukaId;
	}

	/**
	 * @return the talukaName
	 */
	public String getTalukaName() {
		return talukaName;
	}

	/**
	 * @param talukaName the talukaName to set
	 */
	public void setTalukaName(String talukaName) {
		this.talukaName = talukaName;
	}

	/**
	 * @return the district
	 */
	public District getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(District district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "Taluka [talukaId=" + talukaId + ", talukaName=" + talukaName + ", district=" + district + "]";
	}

	/**
	 * @param talukaId
	 * @param talukaName
	 * @param district
	 */
	public Taluka(Long talukaId, String talukaName, District district) {
		super();
		this.talukaId = talukaId;
		this.talukaName = talukaName;
		this.district = district;
	}

	/**
	 *
	 */
	public Taluka() {
		super();
		// TODO Auto-generated constructor stub
	}


}
