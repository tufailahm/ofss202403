package com.training.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Visitor;


@RestController // - JSON
// - Views / HTML/JSP
@RequestMapping("visitor")
public class VisitorController {

	List<Visitor> visitors = new ArrayList<Visitor>();
	
	{
		visitors.add(new Visitor(111, "MohmmadTufail", "8867205331", "Training"));
		visitors.add(new Visitor(112, "Tarun", "9874531298", "Meeting"));
	}

	/*
	 * , new Visitor(115, "Jay", "9876543211", "Lunch"), new Visitor(220, "Arun",
	 * "9876543211", "Trainee"), new Visitor(123, "Jay", "9876543211", "Lunch"), new
	 * Visitor(2333, "Neha", "1222", "Lunch"));
	 */

	@GetMapping()
	// localhost:9090/visitor
	// localhost:9090/visitor?visitorName=Jay
	public ResponseEntity<List<Visitor>> getVisitors(
			@RequestParam(name = "visitorName", required = false) String visitorName) {

		ResponseEntity<List<Visitor>> responseEntity = null;

		List<Visitor> searchedVisitor = new ArrayList<Visitor>();
		if (visitorName == null) {
			responseEntity = new ResponseEntity<List<Visitor>>(visitors, HttpStatus.OK); // 200 - for all records
		} else {
			for (int i = 0; i < visitors.size(); i++) {
				Visitor v = visitors.get(i);
				if (v.getVisitorName().equals(visitorName))
					searchedVisitor.add(v);
			}
			if (searchedVisitor.size() == 0) {
				// if no record found
				responseEntity = new ResponseEntity<List<Visitor>>(searchedVisitor, HttpStatus.NO_CONTENT); // 204
			} else
				responseEntity = new ResponseEntity<List<Visitor>>(searchedVisitor, HttpStatus.ACCEPTED); // 204

		}
		return responseEntity;
	}

	@GetMapping("{visitorId}") // localhost:9090/visitor/112 localhost:9090/visitor/:visitorId
	public ResponseEntity<Visitor> getVisitorById(@PathVariable("visitorId") int visitorId) {

		ResponseEntity<Visitor> responseEntity = null;

		// code to search for visitorId
		Optional<Visitor> visitor = visitors.stream().filter(t -> t.getVisitorId() == (visitorId)).findFirst();
		if (visitor.isPresent()) {
			responseEntity = new ResponseEntity<Visitor>(visitor.get(), HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<Visitor>(new Visitor(), HttpStatus.NO_CONTENT);
		}

		return responseEntity;
	}

	@PostMapping // localhost:9090/visitor - Object - Visitor
	public ResponseEntity<List<Visitor>> saveVisitor(@RequestBody Visitor visitor) {
		boolean found = false;
		ResponseEntity<List<Visitor>> responseEntity = null;

		for (int i = 0; i < visitors.size(); i++) {
			Visitor v = visitors.get(i);
			if (v.getVisitorId() == visitor.getVisitorId()) // visitor with id already exists
			{
				found = true;
				break;
			}
		}
		if (found) {
			responseEntity = new ResponseEntity<List<Visitor>>(visitors, HttpStatus.CONFLICT); // 409
		} else {
			visitors.add(visitor); 
			responseEntity = new ResponseEntity<List<Visitor>>(visitors, HttpStatus.CREATED); // 201
		}
		return responseEntity;

	}
	
	
	//http://localhost:9090/visitor/111
	@PutMapping("{visitorId}") // localhost:9090/visitor - Object - Visitor
	public ResponseEntity<List<Visitor>> updateVisitor(
			@PathVariable("visitorId")int visitorId, //111 
			@RequestBody Visitor visitor) 
		{
		boolean found = false;
		ResponseEntity<List<Visitor>> responseEntity = null;

		for (int i = 0; i < visitors.size(); i++) {
			Visitor v = visitors.get(i);
			if (v.getVisitorId() == visitorId) // visitor with id already exists
			{
				visitor.setVisitorId(visitorId);
				visitors.set(i, visitor);
				found = true;
				break;
			}
		}
		if (!found) {
			responseEntity = new ResponseEntity<List<Visitor>>(visitors, HttpStatus.NO_CONTENT); // 409
		} else {
			responseEntity = new ResponseEntity<List<Visitor>>(visitors, HttpStatus.OK); // 200
		}
		return responseEntity;

	}
	
	

}
