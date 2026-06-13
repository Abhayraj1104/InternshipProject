package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeId;

    private String typeName;

	/**
	 * @return the typeId
	 */
	public Long getTypeId() {
		return typeId;
	}

	/**
	 * @param typeId the typeId to set
	 */
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * @param typeName the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "Type [typeId=" + typeId + ", typeName=" + typeName + "]";
	}

	/**
	 * @param typeId
	 * @param typeName
	 */
	public Type(Long typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}

	/**
	 * 
	 */
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
