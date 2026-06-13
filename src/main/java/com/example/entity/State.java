package com.example.entity;

import jakarta.persistence.*;

@Entity
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stateId;

    private String stateName;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

	/**
	 * @return the stateId
	 */
	public Long getStateId() {
		return stateId;
	}

	/**
	 * @param stateId the stateId to set
	 */
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", country=" + country + "]";
	}

	/**
	 * @param stateId
	 * @param stateName
	 * @param country
	 */
	public State(Long stateId, String stateName, Country country) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.country = country;
	}

	/**
	 * 
	 */
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
