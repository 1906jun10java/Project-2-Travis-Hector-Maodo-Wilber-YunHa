package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Credential;

public class CredentialService {
	
private List<Credential> credentials = new ArrayList<>();
	
	public CredentialService() {
		credentials.add(new Credential("wb","wbpass"));
		credentials.add(new Credential("tw","twpass"));
		credentials.add(new Credential("hl","hlpass"));
		credentials.add(new Credential("ms","mspass"));
		credentials.add(new Credential("yj","yjpass"));
	}
}
