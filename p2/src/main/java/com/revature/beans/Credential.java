package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CREDENTIAL")
public class Credential {
	
	@Id
	@Column(name="CREDENTIAL_ID")
	private String username;
	@Column(name="CREDENTIAL_PASSWORD")
	private String password;
	@OneToOne
	@JoinColumn(name="USER_NAME")
	private User user;
	
	public Credential() {
		super();
	}
	
	public Credential(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Credentials [username=" + username + ", password=" + password + "]";
	}
}
