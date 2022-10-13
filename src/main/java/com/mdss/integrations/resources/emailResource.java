package com.mdss.integrations.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdss.integrations.dto.emailDTO;

@RestController
@RequestMapping(value = "/emails")
public class emailResource {

	@PostMapping
	public ResponseEntity<Void> send(@RequestBody emailDTO dto){
		return ResponseEntity.noContent().build();
		
	}
}
