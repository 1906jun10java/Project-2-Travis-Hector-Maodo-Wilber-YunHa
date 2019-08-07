package com.revature.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CREDENTIALS")
public class Credentials implements Serializable{
	
	private static final long serialVersionUID = -4902867333534632163L;

	@Id
	@OneToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	@Column(name= "CREDENTIALS_EMAIL")
	private String email;
	
	@Column(name = "CREDENTIALS_PASSWORD")
	private String password;
	

	public Credentials() {
		super();
	}

	

	public Credentials(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



	public Credentials(User user, String email, String password) {
		super();
		this.user = user;
		this.email = email;
		this.password = password;
	}


	
	
	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
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



	@Override
	public String toString() {
		return "Credentials [user=" + user + ", email=" + email + ", password=" + password + "]";
	}


	
}
