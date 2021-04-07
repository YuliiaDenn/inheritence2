package Hiber.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name = "D")
public class Delivery extends Obtaining {

	private String region;
	private String district;
	private String city;
	private String street;
	@Column(name = "house_number")
	private String houseNumber;

	public Delivery() {

	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	@Override
	public String toString() {
		return "Delivery [region=" + region + ", district=" + district + ", city=" + city + ", street=" + street
				+ ", houseNumber=" + houseNumber + "]";
	}

}
