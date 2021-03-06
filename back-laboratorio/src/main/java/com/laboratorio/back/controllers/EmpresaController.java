package com.laboratorio.back.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laboratorio.back.entities.Empresa;
import com.laboratorio.back.services.EmpresaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaServiceImpl>{
	
	}
