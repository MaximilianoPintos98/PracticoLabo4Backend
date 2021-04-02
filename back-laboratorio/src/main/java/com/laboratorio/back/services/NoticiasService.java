package com.laboratorio.back.services;

import java.util.List;

import com.laboratorio.back.entities.Noticias;

public interface NoticiasService extends BaseService<Noticias, Long>{

	List<Noticias> search(String filtro) throws Exception;
}
