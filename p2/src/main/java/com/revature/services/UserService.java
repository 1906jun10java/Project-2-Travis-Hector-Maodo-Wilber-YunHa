package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.User;

public class UserService {

	private List<User> users = new ArrayList<>();
	
	public UserService() {
		users.add(new User(1,"wb","Wilber","Barquero","wb@gmail.com","MEMBER"));
		users.add(new User(2,"tw","Travis","Williamson","tw@gmail.com","MEMBER"));
		users.add(new User(3,"hl","Hector","Lugo","hl@hotmail.com","GUEST"));
		users.add(new User(4,"ms","Maodo","Sow","ms@gmail.com","GUEST"));
		users.add(new User(4,"yj","Yunha","Jung","yj@gmail.com","ADMIN"));
		//user.add(new User(int userId, String userName, String firstName, String lastName, String email, String userType));
		//user.add(new User(int userId, String userName, String firstName, String lastName, String email, String userType));
		//user.add(new User(int userId, String userName, String firstName, String lastName, String email, String userType));
		//user.add(new User(int userId, String userName, String firstName, String lastName, String email, String userType));
		//user.add(new User(int userId, String userName, String firstName, String lastName, String email, String userType));
	}
	
	public List<User> allUsers() {
		return this.users;
	}
	
	public void createUser(User user) {
		users.add(user);
	}

	public User getUserdById(int userId) {
		User user = null;
		for(int i=0; i < users.size(); i++) {
			if(users.get(i).getUserId() == userId) {
				user = users.get(i);
			}
		}
		return user;
	}
	
	public User getUserByUserName(String userName) {
		User user = null;
		List<User> users = new ArrayList<>(allUsers());
		for(User uList : users)
			if(uList.getUserName() == null) {
				return null;
			}else if(uList.getUserName().equals(userName)) {
				return user;
			}
		return null;
		}
				
			
	
	
	/*
	 * public String updateFlashcard(int id, String question) { Flashcard flash =
	 * null; for(int i = 0; i < flashcards.size(); i++) {
	 * if(flashcards.get(i).getId() == id) { flash = flashcards.get(i);
	 * flash.setQuestion(question); return "Flashcard updated"; } } return
	 * "Could not find card with that id"; }
	 */
}
