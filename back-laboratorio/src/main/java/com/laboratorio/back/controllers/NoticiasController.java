package com.laboratorio.back.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laboratorio.back.entities.Noticias;
import com.laboratorio.back.services.NoticiasServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/noticias")
public class NoticiasController extends BaseControllerImpl<Noticias, NoticiasServiceImpl> {

}
