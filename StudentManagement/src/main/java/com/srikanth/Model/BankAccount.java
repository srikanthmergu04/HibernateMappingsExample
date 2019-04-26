package com.srikanth.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class BankAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	
	@Column
	private int acNo;
	
	@Column
	private String IFSC;
	
	@Column
	private String branch;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getAcNo() {
		return acNo;
	}

	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
