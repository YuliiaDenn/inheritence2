package Hiber.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SELF_PICKUP")
public class SelfPickup extends Obtaining {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name = "store_branch_number")
	private String storeBranchNumber;
	private String date;
	
	public SelfPickup() {
		
	}

	public String getStoreBranchNumber() {
		return storeBranchNumber;
	}

	public void setStoreBranchNumber(String storeBranchNumber) {
		this.storeBranchNumber = storeBranchNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "SelfPickup [id=" + id + ", storeBranchNumber=" + storeBranchNumber + ", date=" + date + "]";
	}
}
