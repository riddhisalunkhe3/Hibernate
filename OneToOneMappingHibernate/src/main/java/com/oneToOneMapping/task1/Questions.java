package com.oneToOneMapping.task1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Questions {
	@Id
	@Column(name="question_id")
	private int questionId;
	private String question;
	@OneToOne
	@JoinColumn(name = "a_id")
	private Answers answer;
	
	public Questions(int questionId, String question) {
		super();
		this.questionId = questionId;
		this.question = question;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answers getAnswer() {
		return answer;
	}

	public void setAnswer(Answers answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question + "]";
	}
	
}
