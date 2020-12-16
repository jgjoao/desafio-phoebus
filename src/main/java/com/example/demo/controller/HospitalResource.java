package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HospitalModel;
import com.example.demo.service.HospitalService;

@RestController
@RequestMapping("/api")
public class HospitalResource {
	
	 
	
		@Autowired
		private HospitalService hospitalService;
		
		
		@GetMapping("/hospital")
		
		public List<HospitalModel> getHospitalModels() {

			return hospitalService.findAll();
		}

		@PostMapping("/hospital")
		public ResponseEntity<HospitalModel> save(@RequestBody HospitalModel hospital) {

			hospital= hospitalService.save(hospital).get();

			return ResponseEntity.ok().body(hospital);
		}

		@PutMapping("/hospital")
		public ResponseEntity<HospitalModel> update(@RequestBody HospitalModel hospital) {

			hospital= hospitalService.save(hospital).get();

			return ResponseEntity.ok().body(hospital);
		}

		@DeleteMapping("/hospital")
		public ResponseEntity<String> delete(@RequestBody HospitalModel hospital) {

			hospitalService.delete(hospital);
			return ResponseEntity.ok().body("hospital excluido " + hospital.getId());
		}
	

}
