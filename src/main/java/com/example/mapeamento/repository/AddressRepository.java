package com.example.mapeamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapeamento.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
