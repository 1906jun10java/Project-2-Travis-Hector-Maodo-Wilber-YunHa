package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.*;
import com.revature.daos.*;

@Service
public class MemeService {
	
	private MemeDAO memeDAO;
	
	@Autowired
	public MemeService(MemeDAO memeDAO) {
		this.memeDAO = memeDAO;
	}
	
	public void addMeme(Meme meme) {
		this.memeDAO.addMeme(meme);
	}
	
	public List<Meme> getAllMemes() {
		return this.memeDAO.getAllMemes();
	}

}
