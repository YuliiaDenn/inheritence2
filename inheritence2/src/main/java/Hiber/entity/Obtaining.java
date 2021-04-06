package Hiber.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Obtaining {

	private String recipent;
	@Column(name = "phoneF_number")
	private String phoneNumber;

	public Obtaining() {

	}

	public String getRecipent() {
		return recipent;
	}

	public void setRecipent(String recipent) {
		this.recipent = recipent;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Obtaining [recipent=" + recipent + ", phoneNumber=" + phoneNumber + "]";
	}

}
