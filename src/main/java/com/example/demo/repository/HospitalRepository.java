package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.HospitalModel;

import antlr.collections.List;

public interface HospitalRepository extends JpaRepository<HospitalModel,Long> {

	List findByNome(String nome);
}
