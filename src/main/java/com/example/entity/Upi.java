package com.example.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Upi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long upiId;

    private String upiNumber;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

	/**
	 * @return the upiId
	 */
	public Long getUpiId() {
		return upiId;
	}

	/**
	 * @param upiId the upiId to set
	 */
	public void setUpiId(Long upiId) {
		this.upiId = upiId;
	}

	/**
	 * @return the upiNumber
	 */
	public String getUpiNumber() {
		return upiNumber;
	}

	/**
	 * @param upiNumber the upiNumber to set
	 */
	public void setUpiNumber(String upiNumber) {
		this.upiNumber = upiNumber;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Upi [upiId=" + upiId + ", upiNumber=" + upiNumber + ", order=" + order + "]";
	}

	/**
	 * @param upiId
	 * @param upiNumber
	 * @param order
	 */
	public Upi(Long upiId, String upiNumber, Order order) {
		super();
		this.upiId = upiId;
		this.upiNumber = upiNumber;
		this.order = order;
	}

	/**
	 *
	 */
	public Upi() {
		super();
		// TODO Auto-generated constructor stub
	}


}
