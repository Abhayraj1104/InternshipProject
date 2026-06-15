package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class COD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codId;

    private String status;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

	/**
	 * @return the codId
	 */
	public Long getCodId() {
		return codId;
	}

	/**
	 * @param codId the codId to set
	 */
	public void setCodId(Long codId) {
		this.codId = codId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
		return "COD [codId=" + codId + ", status=" + status + ", order=" + order + "]";
	}

	/**
	 * @param codId
	 * @param status
	 * @param order
	 */
	public COD(Long codId, String status, Order order) {
		super();
		this.codId = codId;
		this.status = status;
		this.order = order;
	}

	/**
	 *
	 */
	public COD() {
		super();
		// TODO Auto-generated constructor stub
	}


}
