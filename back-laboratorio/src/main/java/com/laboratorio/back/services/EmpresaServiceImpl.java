package com.laboratorio.back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratorio.back.entities.Empresa;
import com.laboratorio.back.repositories.BaseRepository;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa, Long> implements EmpresaService {

	@Autowired
	private EmpresaServiceImpl empresaServiceImpl;
	
	public EmpresaServiceImpl(BaseRepository<Empresa, Long> baseRepository) {
		super(baseRepository);
	}

}
