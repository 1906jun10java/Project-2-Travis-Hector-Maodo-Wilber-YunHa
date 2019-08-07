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
@RequestMapping(value="/meme")
public class MemeController {

	private MemeService memeService;
	
	@Autowired
	public void setMemeService(MemeService memeService) {
		this.memeService = memeService;
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<Meme>> getAllMemes() {
		return new ResponseEntity<>(memeService.getAllMemes(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/addMeme", method=RequestMethod.POST)
	public ResponseEntity<String> addMeme(@RequestBody Meme meme) {
		ResponseEntity<String> resp = null;
		
		try {
			memeService.addMeme(meme);
			resp = new ResponseEntity<>("MEME CREATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE MEME", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
}
