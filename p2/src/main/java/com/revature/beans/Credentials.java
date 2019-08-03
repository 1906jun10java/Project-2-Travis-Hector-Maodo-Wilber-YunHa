package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CREDENTIAL")
public class Credentials {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="credentialSequence")
	@SequenceGenerator(allocationSize=1, name="credentialSequence", sequenceName="SQ_CREDENTIAL_PK")
	@Column(name="CREDENTIAL_USERNAME")
	private String username;
	@Column(name="CREDENTIAL_PASSWORD")
	private String password;
	
	public Credentials() {
		super();
	}
	
	public Credentials(String username, String password) {
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
