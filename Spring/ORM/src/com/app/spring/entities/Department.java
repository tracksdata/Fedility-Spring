package com.app.spring.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Department {

	@Id
	private int deptId;
	private String deptName;

	//@Transient
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name = "deptDetails", joinColumns = { @JoinColumn(name = "deptId") }, inverseJoinColumns = {
			@JoinColumn(name = "empId") })
	private List<Employee> emps;

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
