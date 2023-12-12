package com.example.mapeamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapeamento.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
