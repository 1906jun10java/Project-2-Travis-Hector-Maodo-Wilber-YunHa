package com.revature.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="WEB_USER")
public class User implements Serializable{
	
	private static final long serialVersionUID = 8986361189713449292L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="webUserSequence")
	@SequenceGenerator(allocationSize=1, name="webUserSequence", sequenceName="SQ_WEBUSER_PK")
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="USER_FIRSTNAME")
	private String firstName;
	
	@Column(name="USER_LASTNAME")
	private String lastName;
	
	@Column(name="USER_EMAIL")
	private String email;
	
	@Column(name="USER_TYPE")
	private String userType;

	public User() {
		super();
	}

	
	
	public User(int userId, String firstName, String lastName, String email, String userType) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userType = userType;
	}



	public User(String firstName, String lastName, String email, String userType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userType = userType;
	}
	
	public User(String email, String firstName, String lastName, int userId, String userType) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userType = userType;
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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", userType=" + userType + "]";
	}
}
