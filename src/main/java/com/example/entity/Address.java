package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    private String pincode;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;

    @ManyToOne
    @JoinColumn(name = "taluka_id")
    private Taluka taluka;

    @ManyToOne
    @JoinColumn(name = "town_id")
    private Town town;

	/**
	 * @return the addressId
	 */
	public Long getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
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

	/**
	 * @return the taluka
	 */
	public Taluka getTaluka() {
		return taluka;
	}

	/**
	 * @param taluka the taluka to set
	 */
	public void setTaluka(Taluka taluka) {
		this.taluka = taluka;
	}

	/**
	 * @return the town
	 */
	public Town getTown() {
		return town;
	}

	/**
	 * @param town the town to set
	 */
	public void setTown(Town town) {
		this.town = town;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", pincode=" + pincode + "]";
	}

	/**
	 * @param addressId
	 * @param pincode
	 * @param country
	 * @param state
	 * @param district
	 * @param taluka
	 * @param town
	 */
	public Address(Long addressId, String pincode, Country country, State state, District district, Taluka taluka,
			Town town) {
		super();
		this.addressId = addressId;
		this.pincode = pincode;
		this.country = country;
		this.state = state;
		this.district = district;
		this.taluka = taluka;
		this.town = town;
	}

	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
