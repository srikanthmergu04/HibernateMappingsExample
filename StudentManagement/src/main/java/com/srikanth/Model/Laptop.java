package com.srikanth.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer lid;
	
	@Column
	private String lbrand;
	
	@Column
	private String ram;
	
	@Column
	private Integer cost;
	
	@ManyToMany(mappedBy = "lap" , fetch = FetchType.EAGER)
	private Set<Student> stu;

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getLbrand() {
		return lbrand;
	}

	public void setLbrand(String lbrand) {
		this.lbrand = lbrand;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

}
