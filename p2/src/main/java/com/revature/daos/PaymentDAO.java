package com.revature.daos;

import java.util.List;

import com.revature.beans.Payment;;

public interface PaymentDAO {
	public List<Payment> getAllPayments();
	public void addPayment(Payment payment);
}
