package com.laboratorio.back.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.laboratorio.back.entities.Noticias;

public interface NoticiasService extends BaseService<Noticias, Long>{

	List<Noticias> search(String filtro) throws Exception;
	Page<Noticias> search(String filtro, Pageable pageable) throws Exception;
}
