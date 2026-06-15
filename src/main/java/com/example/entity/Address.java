package com.example.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String area;
    private String street;
    private String pincode;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="country_id")
    private Country country;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="state_id")
    private State state;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="district_id")
    private District district;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="taluka_id")
    private Taluka taluka;

    @ManyToOne
    @JoinColumn(name="town_id")
    private Town town;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
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
		return "Address [id=" + id + ", area=" + area + ", street=" + street + ", pincode=" + pincode + ", country="
				+ country + ", state=" + state + ", district=" + district + ", taluka=" + taluka + ", town=" + town
				+ "]";
	}

	/**
	 * @param id
	 * @param area
	 * @param street
	 * @param pincode
	 * @param country
	 * @param state
	 * @param district
	 * @param taluka
	 * @param town
	 */
	public Address(int id, String area, String street, String pincode, Country country, State state, District district,
			Taluka taluka, Town town) {
		super();
		this.id = id;
		this.area = area;
		this.street = street;
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
