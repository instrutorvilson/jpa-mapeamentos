package com.example.mapeamento.controllers;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapeamento.entities.Contato;
import com.example.mapeamento.repository.ContatoRepository;

@RestController
@RequestMapping("/contatos")
public class ContatoController {
    @Autowired
	ContatoRepository repo;
	
	@GetMapping
	public ResponseEntity<List<?>> getAll(){
		return ResponseEntity.ok(repo.findAll());
	}
	
	@GetMapping("/filter")
	public ResponseEntity<List<?>> getByNome(@RequestParam("nome") String nome){
		return ResponseEntity.ok(repo.findAllByNome(nome));
	}
	
	@GetMapping("/datas")
	public ResponseEntity<List<?>> getByData(@RequestParam("data") @DateTimeFormat(pattern = "yyyy-MM-dd") Date data){
		return ResponseEntity.ok(repo.findAllByDataNascimento(data));
	}
		
	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody Contato contato){
		return ResponseEntity.ok(repo.save(contato));
	}	
	
}
