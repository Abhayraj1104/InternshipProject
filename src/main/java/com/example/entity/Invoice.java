package com.example.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceId;

    private LocalDate invoiceDate;
    private Double amount;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

	/**
	 * @return the invoiceId
	 */
	public Long getInvoiceId() {
		return invoiceId;
	}

	/**
	 * @param invoiceId the invoiceId to set
	 */
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	/**
	 * @return the invoiceDate
	 */
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param invoiceDate the invoiceDate to set
	 */
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
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
		return "Invoice [invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", amount=" + amount + ", order="
				+ order + "]";
	}

	/**
	 * @param invoiceId
	 * @param invoiceDate
	 * @param amount
	 * @param order
	 */
	public Invoice(Long invoiceId, LocalDate invoiceDate, Double amount, Order order) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceDate = invoiceDate;
		this.amount = amount;
		this.order = order;
	}

	/**
	 * 
	 */
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
