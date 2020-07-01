package com.lcipl.bean;

public class Employee {

	private int empid;
	private String empName;
	private int empAge;
	private String empAddress;
	private long salary;

	public Employee() {
		super();
	}

	public Employee(int empid, String empName, int empAge, String empAddress, long salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empAge = empAge;
		this.empAddress = empAddress;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}
