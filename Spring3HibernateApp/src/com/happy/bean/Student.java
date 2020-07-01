package com.happy.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stuid")
	private Integer stuId;
	@Column(name = "stuname")
	private String stuName;
	@Column(name = "stuAge")
	private Integer stuAge;
	@Column(name = "stuclass")
	private int stuClass;

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getStuAge() {
		return stuAge;
	}

	public void setStuAge(Integer age) {
		this.stuAge = age;
	}

	public int getStuClass() {
		return stuClass;
	}

	public void setStuClass(int stuClass) {
		this.stuClass = stuClass;
	}

}
