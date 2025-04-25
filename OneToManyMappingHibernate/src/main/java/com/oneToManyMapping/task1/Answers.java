package com.oneToManyMapping.task1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String ans;
	@ManyToOne
	private Questions question;
	
	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answers(int answerId, String ans, Questions question) {
		super();
		this.answerId = answerId;
		this.ans = ans;
		this.question = question;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Questions getQuestion() {
		return question;
	}

	public void setQuestion(Questions question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answers [answerId=" + answerId + ", ans=" + ans + ", question=" + question + "]";
	}
	
}
