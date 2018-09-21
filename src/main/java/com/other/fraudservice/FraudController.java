package com.other.fraudservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FraudController {

	@GetMapping("/fraud")
	ResponseEntity<List<String>> fraud(){
		return ResponseEntity.status(200).body(Arrays.asList("marcin","josh"));
	}
	
}
