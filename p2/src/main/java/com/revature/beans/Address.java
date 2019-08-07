package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="addressSequence")
	@SequenceGenerator(allocationSize=1, name="addressSequence", sequenceName="SQ_ADDRESS_PK")
	@Column(name="ADDRESS_ID")
	private int addressId;
	
	@Column(name="ADDRESS_LINE_1")
	private String addressLine1;
	
	@Column(name="ADDRESS_ZIP_CODE")
	private String zipCode;
	
	@OneToOne
	@JoinColumn(name="USER_ID", referencedColumnName = "USER_ID")
	private User user;

	public Address() {
		super();
	}

	public Address(int addressId, String addressLine1, String zipCode, User user) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.zipCode = zipCode;
		this.user = user;
	}

	public Address(String addressLine1, String zipCode, User user) {
		super();
		this.addressLine1 = addressLine1;
		this.zipCode = zipCode;
		this.user = user;
	}
	
	public Address(String addressLine1, String zipCode) {
		super();
		this.addressLine1 = addressLine1;
		this.zipCode = zipCode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", zipCode=" + zipCode + ", user="
				+ user + "]";
	}
	
}
