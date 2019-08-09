package com.revature.daos;

import java.util.List;

import com.revature.beans.*;

public interface PaymentDAO {

	public void addPayment(Payment payment);
	
	public void updatePayment(Payment payment);
	
	public void deletePayment(Payment payment);
	
	public Payment getPaymentById(int paymentId);
	
	public List<Payment> getPaymentsForUser(int userId);
	
	public void addOrUpdatePayment(Payment payment);
}
