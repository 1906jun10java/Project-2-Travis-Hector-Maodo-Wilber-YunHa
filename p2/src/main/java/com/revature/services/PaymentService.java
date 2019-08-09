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
	
	public void addPayment(Payment payment) {
		this.paymentDAO.addPayment(payment);
	}
	
	public void updatePayment(Payment payment) {
		this.paymentDAO.updatePayment(payment);
	}
	
	public void deletePayment(Payment payment) {
		this.paymentDAO.deletePayment(payment);
	}
	
	public Payment getPaymentById(int paymentId) {
		return this.paymentDAO.getPaymentById(paymentId);
	}
	
	public List<Payment> getPaymentsForUser(int userId) {
		return this.paymentDAO.getPaymentsForUser(userId);
	}
	
	public void addOrUpdatePayment(Payment payment) {
		this.paymentDAO.addOrUpdatePayment(payment);
	}
}
