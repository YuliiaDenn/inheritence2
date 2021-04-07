package Hiber.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Obtaining {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int id;
	
	private String recipent;
	@Column(name = "phoneF_number")
	private String phoneNumber;

	public Obtaining() {

	}

	public int getId() {
		return id;
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
		return "Obtaining [id=" + id + ", recipent=" + recipent + ", phoneNumber=" + phoneNumber + "]";
	}
}
