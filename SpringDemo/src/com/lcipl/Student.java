package com.lcipl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Student {

	private int id;
	private String name;
	private long registerNumber;

	public Student(int id, String name, long registerNumber) {
		super();
		this.id = id;
		this.name = name;
		this.registerNumber = registerNumber;
	}

//	public Student() {
//		super();
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(long registerNumber) {
		this.registerNumber = registerNumber;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", registerNumber=" + registerNumber + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student s1 = new Student();
		//System.out.println("s1 :" + s1);

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Student s2 = (Student) factory.getBean("s2");

		System.out.println("s2 :" + s2);
	}

}
