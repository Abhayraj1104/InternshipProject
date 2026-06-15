package com.example.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CustomerQuery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long queryId;

    private String queryText;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "user_id")
    private User user;

	/**
	 * @return the queryId
	 */
	public Long getQueryId() {
		return queryId;
	}

	/**
	 * @param queryId the queryId to set
	 */
	public void setQueryId(Long queryId) {
		this.queryId = queryId;
	}

	/**
	 * @return the queryText
	 */
	public String getQueryText() {
		return queryText;
	}

	/**
	 * @param queryText the queryText to set
	 */
	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "CustomerQuery [queryId=" + queryId + ", queryText=" + queryText + ", user=" + user + "]";
	}


	public CustomerQuery(Long queryId, String queryText, User user) {
		super();
		this.queryId = queryId;
		this.queryText = queryText;
		this.user = user;
	}

	/**
	 *
	 */
	public CustomerQuery() {
		super();
		// TODO Auto-generated constructor stub
	}




}
