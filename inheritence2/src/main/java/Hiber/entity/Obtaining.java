package Hiber.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "OBTAINING")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "O_TYPES")
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
