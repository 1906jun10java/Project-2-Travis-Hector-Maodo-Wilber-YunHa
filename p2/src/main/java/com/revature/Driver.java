package com.revature;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.beans.User;
import com.revature.utils.ConnectionUtil;

public class Driver {
	public static void main(String[] args) {
		// use this to get Sessions, which will do most of the work
		SessionFactory sf = ConnectionUtil.getSessionFactory();
		
		Session s = sf.openSession();
		System.out.println(s.getStatistics());
		Transaction tx = s.beginTransaction();
		s.save(new User(1,"wb","Wilber","Barquero","wb@gmail.com","MEMBER"));
		s.save(new User(2,"tw","Travis","Williamson","tw@gmail.com","MEMBER"));
		s.save(new User(3,"hl","Hector","Lugo","hl@hotmail.com","GUEST"));
		s.save(new User(4,"ms","Maodo","Sow","ms@gmail.com","GUEST"));
		s.save(new User(4,"yj","Yunha","Jung","yj@gmail.com","ADMIN"));
		tx.commit();
		s.close();
	
		/*BookDao bd = new BookDaoImpl();
		System.out.println(bd.getBookId(2));
		List<Book> bookList = bd.getAllBooks();
		for(Book b : bookList) {
			System.out.println(b);
		}*/
	}
}
