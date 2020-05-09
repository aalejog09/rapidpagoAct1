package com.rapidpago.proyec1.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	


	public Employee(Integer id, Integer personId, Integer departmentId, Integer experienceId, String address,
			String admissionDate, Boolean status) {
		super();
		this.id = id;
		this.personId = personId;
		this.departmentId = departmentId;
		this.experienceId = experienceId;
		this.address = address;
		this.admissionDate = admissionDate;
		Status = status;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private Integer personId;
	
	
	@Column
	private Integer departmentId;
	
	
	@Column
	private Integer experienceId;
	
	
	@Column
	private String address;
	
	@Column
	private String admissionDate;
	
	@Column
	private Boolean Status;

	public Integer getId() {
		return id;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", personId=" + personId + ", departmentId=" + departmentId + ", experienceId="
				+ experienceId + ", address=" + address + ", admissionDate=" + admissionDate + ", Status=" + Status
				+ "]";
	}



	
	
	
	
}
