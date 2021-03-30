
package com.laboratorio.back.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratorio.back.entities.Empresa;
import com.laboratorio.back.repositories.EmpresaRepository;

@Service
public class EmpresaService implements BaseService<Empresa> {

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	@Transactional
	public List<Empresa> findAll() throws Exception {
		try {
			List<Empresa> entities = empresaRepository.findAll();
			return entities;
 		} catch (Exception e) {
 			throw new Exception(e.getMessage());
		}

	}

	@Override
	@Transactional
	public Empresa findById(Long id) throws Exception {
		try {
			Optional<Empresa> entityOptional = empresaRepository.findById(id);
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Empresa save(Empresa entity) throws Exception {
		try {
			entity = empresaRepository.save(entity);
			return entity;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Empresa update(Long id, Empresa entity) throws Exception {
		try {
			Optional<Empresa> entityOptional = empresaRepository.findById(id);
			Empresa empresa = entityOptional.get();
			empresa = empresaRepository.save(empresa);
			return empresa; 
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {
		try {
			if(empresaRepository.existsById(id)) {
				empresaRepository.deleteById(id);
				return true; 
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
