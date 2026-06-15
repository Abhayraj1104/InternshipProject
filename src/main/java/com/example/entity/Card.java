package com.example.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;

    private String cardNumber;
    private String holderName;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

	/**
	 * @return the cardId
	 */
	public Long getCardId() {
		return cardId;
	}

	/**
	 * @param cardId the cardId to set
	 */
	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the holderName
	 */
	public String getHolderName() {
		return holderName;
	}

	/**
	 * @param holderName the holderName to set
	 */
	public void setHolderName(String holderName) {
		this.holderName = holderName;
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
		return "Card [cardId=" + cardId + ", cardNumber=" + cardNumber + ", holderName=" + holderName + ", order="
				+ order + "]";
	}

	/**
	 * @param cardId
	 * @param cardNumber
	 * @param holderName
	 * @param order
	 */
	public Card(Long cardId, String cardNumber, String holderName, Order order) {
		super();
		this.cardId = cardId;
		this.cardNumber = cardNumber;
		this.holderName = holderName;
		this.order = order;
	}

	/**
	 *
	 */
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}


}
