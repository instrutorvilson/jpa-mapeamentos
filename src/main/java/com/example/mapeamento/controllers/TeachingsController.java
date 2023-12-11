package com.example.mapeamento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapeamento.entities.NonTeachingStaff;
import com.example.mapeamento.entities.TeachingsStaff;
import com.example.mapeamento.repository.NonTecahingsStaffRepository;
import com.example.mapeamento.repository.TeachingStaffRepository;

@RestController
public class TeachingsController {
  
	@Autowired
	TeachingStaffRepository repo;
	
	@PostMapping("/teachings")
	public ResponseEntity<TeachingsStaff> salvar(@RequestBody TeachingsStaff teachingsStaff){
		return ResponseEntity.status(HttpStatus.CREATED).body(repo.save(teachingsStaff));
	}
	
	@Autowired
	NonTecahingsStaffRepository nrepo;
	
	@PostMapping("/nonteachings")
	public ResponseEntity<NonTeachingStaff> salvar(@RequestBody NonTeachingStaff nonTeachingStaff){
		return ResponseEntity.status(HttpStatus.CREATED).body(nrepo.save(nonTeachingStaff));
	}
	
}
