package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Payment;
import com.revature.services.PaymentService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/payment")
public class PaymentController {

	private PaymentService paymentService;
	
	@Autowired
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@RequestMapping(value="/allpaymentss", method=RequestMethod.GET)
	public ResponseEntity<List<Payment>> getAllPayments() {
		return new ResponseEntity<>(paymentService.getAllPayments(), HttpStatus.OK);
	}
	
	@PostMapping // we could also do RequestMapping with RequestMethod.POST
	public ResponseEntity<String> addPayment(@RequestBody Payment payment) {
		ResponseEntity<String> resp = null;
		try {
			paymentService.createPayment(payment);
			resp = new ResponseEntity<>("PAYMENT CREATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE PAYMENT", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
}
