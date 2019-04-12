package com.srikanth.Model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table
@DynamicUpdate
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	
	@Column
	private String name;
	
	@Column
	private Integer age;
	
	@Column
	private String dept;
	
	//@OneToMany(cascade = CascadeType.ALL , targetEntity = Laptop.class)
	@ManyToMany(cascade = CascadeType.ALL , targetEntity = Laptop.class)
	@JoinTable(name = "Student_Laptop" ,
	joinColumns = { @JoinColumn(name = "Student_id") } , 
	inverseJoinColumns = { @JoinColumn(name = "Laptop_id")}
	)
	private Set<Laptop> lap;
	
	/*
	@OneToOne(cascade = CascadeType.ALL , targetEntity = Laptop.class)
	private Laptop lap;
	
	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	*/

	public Set<Laptop> getLap() {
		return lap;
	}

	public void setLap(Set<Laptop> lap) {
		this.lap = lap;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
	
	

}
