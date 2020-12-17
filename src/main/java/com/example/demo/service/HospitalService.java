package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.HospitalModel;
import com.example.demo.repository.HospitalRepository;
import com.github.javafaker.Faker;

@Service
public class HospitalService implements CrudInterface<HospitalModel> {

	Faker faker = new Faker();
	@Autowired
	private HospitalRepository hospitalRepository;
	
	@Override
	public List<HospitalModel> findAll() {
		
		return hospitalRepository.findAll();
	}

	@Override
	public Optional<HospitalModel> save(HospitalModel entity) {
		entity.setLocalizacao(faker.address().longitude() + faker.address().latitude());
		entity.setEndereco(faker.address().streetAddress());
		return Optional.of(hospitalRepository.save(entity));
	}

	@Override
	public Optional<HospitalModel> findById(long id) {
		
		return hospitalRepository.findById(id);
	}

	@Override
	public void delete(HospitalModel entity) {
		
		 hospitalRepository.delete(entity);
	}

	@Override
	public void deleteById(long id) {
		hospitalRepository.deleteById(id);
		
	}

	@Override
	public long count() {
		
		return hospitalRepository.count();
	}

}
