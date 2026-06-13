package com.example.entity;

import jakarta.persistence.*;

@Entity
public class Town {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long townId;

    private String townName;

    @ManyToOne
    @JoinColumn(name = "taluka_id")
    private Taluka taluka;

	/**
	 * @return the townId
	 */
	public Long getTownId() {
		return townId;
	}

	/**
	 * @param townId the townId to set
	 */
	public void setTownId(Long townId) {
		this.townId = townId;
	}

	/**
	 * @return the townName
	 */
	public String getTownName() {
		return townName;
	}

	/**
	 * @param townName the townName to set
	 */
	public void setTownName(String townName) {
		this.townName = townName;
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

	@Override
	public String toString() {
		return "Town [townId=" + townId + ", townName=" + townName + ", taluka=" + taluka + "]";
	}

	/**
	 * @param townId
	 * @param townName
	 * @param taluka
	 */
	public Town(Long townId, String townName, Taluka taluka) {
		super();
		this.townId = townId;
		this.townName = townName;
		this.taluka = taluka;
	}

	/**
	 * 
	 */
	public Town() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
