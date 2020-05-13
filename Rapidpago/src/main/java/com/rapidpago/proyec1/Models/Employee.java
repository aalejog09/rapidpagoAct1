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



	public Employee(Integer id, String name, String lastname, String gender, Integer identificationNum,
			Department department, Experience experience, String address, String admissionDate, Boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.identificationNum = identificationNum;
		this.department = department;
		this.experience = experience;
		this.address = address;
		this.admissionDate = admissionDate;
		Available = available;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String lastname;
	
	@Column
	private String gender;
	
	@Column
	private Integer identificationNum;
	
	@OneToOne   
	@JoinColumn(name = "department_id")
	private Department department;
	
	@OneToOne   
	@JoinColumn(name = "experience_id")
	private Experience experience;
	
	@Column
	private String address;
	
	@Column
	private String admissionDate;
	
	@Column
	private Boolean Available;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getIdentificationNum() {
		return identificationNum;
	}

	public void setIdentificationNum(Integer identificationNum) {
		this.identificationNum = identificationNum;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}


	public Boolean getAvailable() {
		return Available;
	}


	public void setAvailable(Boolean available) {
		Available = available;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastname=" + lastname + ", gender=" + gender
				+ ", identificationNum=" + identificationNum + ", department=" + department + ", experience="
				+ experience + ", address=" + address + ", admissionDate=" + admissionDate + ", available=" + Available + "]";
	}


	
}
