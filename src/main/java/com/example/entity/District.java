package com.example.entity;

import jakarta.persistence.*;

@Entity
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long districtId;

    private String districtName;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

	/**
	 * @return the districtId
	 */
	public Long getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId the districtId to set
	 */
	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @param districtName the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "District [districtId=" + districtId + ", districtName=" + districtName + ", state=" + state + "]";
	}

	/**
	 * @param districtId
	 * @param districtName
	 * @param state
	 */
	public District(Long districtId, String districtName, State state) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
		this.state = state;
	}

	/**
	 * 
	 */
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
