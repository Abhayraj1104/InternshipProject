package com.example.entity;

import jakarta.persistence.*;

@Entity
public class PaymentMode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentModeId;

    private String modeName;

	/**
	 * @return the paymentModeId
	 */
	public Long getPaymentModeId() {
		return paymentModeId;
	}

	/**
	 * @param paymentModeId the paymentModeId to set
	 */
	public void setPaymentModeId(Long paymentModeId) {
		this.paymentModeId = paymentModeId;
	}

	/**
	 * @return the modeName
	 */
	public String getModeName() {
		return modeName;
	}

	/**
	 * @param modeName the modeName to set
	 */
	public void setModeName(String modeName) {
		this.modeName = modeName;
	}

	@Override
	public String toString() {
		return "PaymentMode [paymentModeId=" + paymentModeId + ", modeName=" + modeName + "]";
	}

	/**
	 * @param paymentModeId
	 * @param modeName
	 */
	public PaymentMode(Long paymentModeId, String modeName) {
		super();
		this.paymentModeId = paymentModeId;
		this.modeName = modeName;
	}

	/**
	 * 
	 */
	public PaymentMode() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
