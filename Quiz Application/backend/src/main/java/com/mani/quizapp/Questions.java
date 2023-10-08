package com.mani.quizapp;
import org.springframework.stereotype.Component;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table

public class Questions {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int quesId;
private String question;
private String option1;
private String option2;
private String option3;
private int answer;
public int getQuesId() {
	return quesId;
}
public void setQuesId(int quesId) {
	this.quesId = quesId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getOption1() {
	return option1;
}
public void setOption1(String option1) {
	this.option1 = option1;
}
public String getOption2() {
	return option2;
}
public void setOption2(String option2) {
	this.option2 = option2;
}
public String getOption3() {
	return option3;
}
public void setOption3(String option3) {
	this.option3 = option3;
}
public int getAnswer() {
	return answer;
}
public void setAnswer(int answer) {
	this.answer = answer;
}
@Override
public String toString() {
	return "Questions [quesId=" + quesId + ", question=" + question + ", option1=" + option1 + ", option2=" + option2
			+ ", option3=" + option3 + ", answer=" + answer + "]";
}
}

