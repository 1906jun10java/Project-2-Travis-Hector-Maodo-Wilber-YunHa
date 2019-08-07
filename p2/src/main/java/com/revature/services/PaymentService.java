package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.*;
import com.revature.daos.*;

@Service
public class PaymentService {

	private PaymentDAO paymentDAO;
	
	@Autowired
	public PaymentService(PaymentDAO paymentDAO) {
		this.paymentDAO = paymentDAO;
	}
	
	public List<Payment> getAllPayments() {
		return this.paymentDAO.getAllPayments();
	}
	
	public void createPayment(Payment payment) {
		this.paymentDAO.addPayment(payment);
	}
}
