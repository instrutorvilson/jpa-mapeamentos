package com.example.mapeamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapeamento.entities.TeachingsStaff;

@Repository
public interface TeachingStaffRepository extends JpaRepository<TeachingsStaff, Long> {

}
