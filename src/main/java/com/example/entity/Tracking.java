package com.example.entity;

import jakarta.persistence.*;

@Entity
public class Tracking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trackingId;

    private String trackingNumber;
    private String status;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

	/**
	 * @return the trackingId
	 */
	public Long getTrackingId() {
		return trackingId;
	}

	/**
	 * @param trackingId the trackingId to set
	 */
	public void setTrackingId(Long trackingId) {
		this.trackingId = trackingId;
	}

	/**
	 * @return the trackingNumber
	 */
	public String getTrackingNumber() {
		return trackingNumber;
	}

	/**
	 * @param trackingNumber the trackingNumber to set
	 */
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
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
		return "Tracking [trackingId=" + trackingId + ", trackingNumber=" + trackingNumber + ", status=" + status
				+ ", order=" + order + "]";
	}

	/**
	 * @param trackingId
	 * @param trackingNumber
	 * @param status
	 * @param order
	 */
	public Tracking(Long trackingId, String trackingNumber, String status, Order order) {
		super();
		this.trackingId = trackingId;
		this.trackingNumber = trackingNumber;
		this.status = status;
		this.order = order;
	}

	/**
	 * 
	 */
	public Tracking() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
