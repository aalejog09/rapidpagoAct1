package com.rapidpago.proyec1.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {

	
	
	public Person(Integer id, String name, String lastname, Integer identificationNum, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.identificationNum = identificationNum;
		this.gender = gender;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Column
	String name;
	
	@Column
	String lastname;
	
	@Column
	Integer identificationNum;
	
	@Column
	String gender;

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

	public Integer getIdentificationNum() {
		return identificationNum;
	}

	public void setIdentificationNum(Integer identificationNum) {
		this.identificationNum = identificationNum;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", lastname=" + lastname + ", identificationNum="
				+ identificationNum + ", gender=" + gender + "]";
	}
	
	

}
