package com.revature.controllers;

import java.io.StringReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import com.revature.beans.*;
import com.revature.services.*;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/payment")
public class PaymentController {

	private PaymentService paymentService;
	
	@Autowired
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/addPayment", method=RequestMethod.POST)
	public ResponseEntity<String> addPayment(@RequestBody Payment payment) {
		ResponseEntity<String> resp = null;
		
		try {
			paymentService.addPayment(payment);
			resp = new ResponseEntity<>("PAYMENT CREATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE PAYMENT", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/updatePayment", method=RequestMethod.POST)
	public ResponseEntity<String> updatePayment(@RequestBody Payment payment) {
		ResponseEntity<String> resp = null;
		
		try {
			paymentService.updatePayment(payment);
			resp = new ResponseEntity<>("PAYMENT UPDATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO UPDATE PAYMENT", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/deletePayment", method=RequestMethod.POST)
	public ResponseEntity<String> deletePayment(@RequestBody Payment payment) {
		ResponseEntity<String> resp = null;
		
		try {
			paymentService.deletePayment(payment);
			resp = new ResponseEntity<>("PAYMENT DELETED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO DELETE PAYMENT", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/getPaymentById/{paymentId}", method=RequestMethod.GET)
	public ResponseEntity<Payment> getPaymentById(@PathVariable int paymentId) {
		Payment p = paymentService.getPaymentById(paymentId);
		if (p == null) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(p, HttpStatus.OK);
		}
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/getPaymentsByUserId/{userId}", method=RequestMethod.GET)
	public ResponseEntity<List<Payment>> getPaymentsForUser(@PathVariable int userId) {
		List<Payment> p = paymentService.getPaymentsForUser(userId);
		if (p == null) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(p, HttpStatus.OK);
		}
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/addOrUpdate", method=RequestMethod.PUT)
	public ResponseEntity<String> addOrUpdatePayment(@RequestBody Payment payment) {
		ResponseEntity<String> resp = null;
		
		try {
			paymentService.addOrUpdatePayment(payment);
			resp = new ResponseEntity<>("PAYMENT CREATED OR UPDATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE OR UPDATE PAYMENT", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
}
