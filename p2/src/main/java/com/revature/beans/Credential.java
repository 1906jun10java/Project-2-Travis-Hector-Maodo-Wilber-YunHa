package com.revature.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CREDENTIAL")
public class Credential implements Serializable{

	private static final long serialVersionUID = -4902867333534632163L;


	@Id
	@OneToOne
	@JoinColumn(name = "USER_NAME")
	private User userName;

	
	@Column(name = "CREDENTIAL_PASSWORD")
	private String password;
	

	public Credential() {
		super();
	}


	public Credential(User userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}


	public Credential(String password) {
		super();
		this.password = password;
	}


	public User getUserName() {
		return userName;
	}


	public void setUserName(User userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Credential [userName=" + userName + ", password=" + password + "]";
	}
	
}
