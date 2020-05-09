package com.rapidpago.proyec1.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	


	public Employee(Integer id, Person person, Department department, Experience experience, String address,
			String admissionDate, Boolean status) {
		super();
		this.id = id;
		this.person = person;
		this.department= department;
		this.experience = experience;
		this.address = address;
		this.admissionDate = admissionDate;
		Status = status;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@OneToOne   
	@JoinColumn(name = "person_id")
	private Person person;
//	@Column
//	private Integer personId;
	
	@OneToOne   
	@JoinColumn(name = "department_id")
	private Department department;
//	@Column
//	private Integer departmentId;
	
	@OneToOne   
	@JoinColumn(name = "experience_id")
	private Experience experience;
//	@Column
//	private Integer experienceId;
//	
	
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
		return "Employee [id=" + id + ", person=" + person + ", Department=" + department + ", Experience="
				+ experience + ", address=" + address + ", admissionDate=" + admissionDate + ", Status=" + Status
				+ "]";
	}

	
}
