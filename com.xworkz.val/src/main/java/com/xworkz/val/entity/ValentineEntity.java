package com.xworkz.val.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="valentine")

public class ValentineEntity implements Serializable {
	@Id
	@GenericGenerator(name="kavya",strategy="increment")
	@GeneratedValue(generator="kavya")
	@Column(name="v_id")
	
	
	private int vid;
	@Column(name="v_name")
	private String name;
	@Column(name="v_gift")
	private String gift;
	@Column(name="v_amountpaid")
	private double amountpaid;
	@Column(name="v_status")
	private String status;
	
	public ValentineEntity() {
		System.out.println("created");
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}

	public double getAmountpaid() {
		return amountpaid;
	}

	public void setAmountpaid(double amountpaid) {
		this.amountpaid = amountpaid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ValentineEntity [vid=" + vid + ", name=" + name + ", gift=" + gift + ", amountpaid=" + amountpaid
				+ ", status=" + status + "]";
	}
	

}
