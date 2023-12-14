package com.example.mapeamento.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.mapeamento.entities.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
   List<Contato> findAllByNome(String nome);
   
   List<Contato> findAllByNascimento(Date data);
   
   @Query("SELECT u FROM Contato u WHERE u.nascimento = :data")
   List<Contato> findAllByDataNascimento(Date data);
}
