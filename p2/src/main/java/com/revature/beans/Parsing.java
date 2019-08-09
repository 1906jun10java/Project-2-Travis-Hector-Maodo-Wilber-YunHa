package com.revature.beans;

import java.util.Date;

public class Parsing {

	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int integer;
	private double decimal;
	private Date date;
	private String string;
	
	
	public Parsing(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}


	public Parsing(int userId, String firstName, String lastName, String email, String password, int integer,
			double decimal, Date date, String string) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.integer = integer;
		this.decimal = decimal;
		this.date = date;
		this.string = string;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getInteger() {
		return integer;
	}


	public void setInteger(int integer) {
		this.integer = integer;
	}


	public double getDecimal() {
		return decimal;
	}


	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getString() {
		return string;
	}


	public void setString(String string) {
		this.string = string;
	}


	@Override
	public String toString() {
		return "Parsing [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", integer=" + integer + ", decimal=" + decimal + ", date=" + date
				+ ", string=" + string + "]";
	}
	
}
