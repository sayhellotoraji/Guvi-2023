package com.app.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name="Student")
public class Students implements Serializable {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_generator")
	@SequenceGenerator(initialValue = 1000, name="student_generator", sequenceName = "student_seq1")
	private Integer id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="ADDRESS")
	private String address;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
