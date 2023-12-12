package com.example.mapeamento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapeamento.entities.Address;
import com.example.mapeamento.entities.User;
import com.example.mapeamento.repository.AddressRepository;
import com.example.mapeamento.repository.UserRepository;

@RestController
public class Controller {
   @Autowired
   UserRepository userRepo;
	
   @PostMapping("/users")
	public ResponseEntity<User> salvar(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userRepo.save(user));
	}
   
   @GetMapping("/users")
	public ResponseEntity<List<User>> consultar(){
		return ResponseEntity.status(HttpStatus.OK).body(userRepo.findAll());
	}
   
   @Autowired
   AddressRepository addressRepo;
	
   @PostMapping("/addresses")
	public ResponseEntity<Address> salvar(@RequestBody Address address){
		return ResponseEntity.status(HttpStatus.CREATED).body(addressRepo.save(address));
	}
   
   @DeleteMapping("/users/{id}")
   public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
	   addressRepo.deleteById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
