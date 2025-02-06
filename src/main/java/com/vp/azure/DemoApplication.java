package com.vp.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/message/{id}")
	public ResponseEntity message(@PathVariable String id) {

		if("200".equals(id)) {
			return new ResponseEntity<>("App deploy successfully on Azure!", HttpStatus.OK);
		} else {
			return new ResponseEntity("Not found!", HttpStatus.NOT_FOUND);
		}
	}

}
