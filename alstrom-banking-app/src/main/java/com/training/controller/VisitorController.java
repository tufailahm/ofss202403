package com.training.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Visitor;

@RestController			//- JSON			
			//	- Views / HTML/JSP
@RequestMapping("visitor")
public class VisitorController {

	List<Visitor> visitors = Arrays.asList(
			new Visitor(111, "Tufail", "8867205331", "Training"),
			new Visitor(112, "Tarun", "9874531298", "Meeting"),
			new Visitor(115, "Jay", "9876543211", "Lunch")
	);
	
	@GetMapping									//localhost:9090/visi tor
	public List<Visitor> getVisitors() {
		return visitors;
	}
	
	@GetMapping("{visitorId}")						//localhost:9090/visitor/112
	public ResponseEntity<Visitor> getVisitorById(@PathVariable("visitorId")int visitorId) {
		
		ResponseEntity<Visitor> responseEntity = null;
		
		//code to search for visitorId
		Optional<Visitor> visitor =  visitors.stream().filter(t -> t.getVisitorId() == (visitorId)).findFirst();
		if(visitor.isPresent())
		{
			responseEntity = new ResponseEntity<Visitor>(visitor.get(), HttpStatus.OK);
		}
		else {
			responseEntity =  new ResponseEntity<Visitor>(new Visitor(), HttpStatus.NO_CONTENT);
		}
		
		return responseEntity;
	}
}





