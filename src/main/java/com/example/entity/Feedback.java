package com.example.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;

    private String feedbackText;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "user_id")
    private User user;

	/**
	 * @return the feedbackId
	 */
	public Long getFeedbackId() {
		return feedbackId;
	}

	/**
	 * @param feedbackId the feedbackId to set
	 */
	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}

	/**
	 * @return the feedbackText
	 */
	public String getFeedbackText() {
		return feedbackText;
	}

	/**
	 * @param feedbackText the feedbackText to set
	 */
	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
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
		return "Feedback [feedbackId=" + feedbackId + ", feedbackText=" + feedbackText + ", user=" + user + "]";
	}

	/**
	 * @param feedbackId
	 * @param feedbackText
	 * @param user
	 */
	public Feedback(Long feedbackId, String feedbackText, User user) {
		super();
		this.feedbackId = feedbackId;
		this.feedbackText = feedbackText;
		this.user = user;
	}

	/**
	 *
	 */
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}


}
