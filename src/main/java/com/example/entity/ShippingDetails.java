package com.example.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class ShippingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shippingId;

    private LocalDate shippingDate;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

	/**
	 * @return the shippingId
	 */
	public Long getShippingId() {
		return shippingId;
	}

	/**
	 * @param shippingId the shippingId to set
	 */
	public void setShippingId(Long shippingId) {
		this.shippingId = shippingId;
	}

	/**
	 * @return the shippingDate
	 */
	public LocalDate getShippingDate() {
		return shippingDate;
	}

	/**
	 * @param shippingDate the shippingDate to set
	 */
	public void setShippingDate(LocalDate shippingDate) {
		this.shippingDate = shippingDate;
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

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ShippingDetails [shippingId=" + shippingId + ", shippingDate=" + shippingDate + ", order=" + order
				+ ", address=" + address + "]";
	}

	/**
	 * @param shippingId
	 * @param shippingDate
	 * @param order
	 * @param address
	 */
	public ShippingDetails(Long shippingId, LocalDate shippingDate, Order order, Address address) {
		super();
		this.shippingId = shippingId;
		this.shippingDate = shippingDate;
		this.order = order;
		this.address = address;
	}

	/**
	 * 
	 */
	public ShippingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
