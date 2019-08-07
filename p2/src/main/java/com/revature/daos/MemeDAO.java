package com.revature.daos;

import java.util.List;

import com.revature.beans.*;

public interface MemeDAO {

	public void addMeme(Meme meme);
	
	public List<Meme> getAllMemes();
}
