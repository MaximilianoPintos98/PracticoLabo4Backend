package com.laboratorio.back.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laboratorio.back.entities.Empresa;
import com.laboratorio.back.services.EmpresaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/empresas")
public class EmpresaController {
	private EmpresaService empresaService;

	public EmpresaController(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}

	@GetMapping("")
	public ResponseEntity<?> getAll() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(empresaService.findAll());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("{\"error\":\"Error, por favor intente más tarde.\"}");

		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getOne(@PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(empresaService.findById(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("{\"error\":\"Error, por favor intente más tarde.\"}");

		}
	}

	@PostMapping("")
	public ResponseEntity<?> save(@RequestBody Empresa entity) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(empresaService.save(entity));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("{\"error\":\"Error, por favor intente más tarde.\"}");

		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Empresa entity){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(empresaService.update(id, entity));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("{\"error\":\"Error, por favor intente más tarde.\"}");
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(Long id){
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(empresaService.delete(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("{\"error\":\"Error, por favor intente más tarde.\"}");
		}
	}
}
