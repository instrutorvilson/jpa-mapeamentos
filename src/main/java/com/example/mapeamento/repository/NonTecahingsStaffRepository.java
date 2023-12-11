package com.example.mapeamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapeamento.entities.NonTeachingStaff;

@Repository
public interface NonTecahingsStaffRepository extends JpaRepository<NonTeachingStaff, Long> {

}
