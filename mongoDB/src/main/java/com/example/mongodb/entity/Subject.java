package com.example.mongodb.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Subject {
	@Field(name = "subject_name")
	private String subjectName;
	private Integer marks;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}
}
