package com.example.contractproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ContractProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContractProducerApplication.class, args);
	}

}

@RestController
class RepairController {

	@GetMapping("/repairs")
	ResponseEntity<List<String>> repair(){
		return ResponseEntity
				.status(200)
				.body(Arrays.asList("oil", "brake"));
	}


}
