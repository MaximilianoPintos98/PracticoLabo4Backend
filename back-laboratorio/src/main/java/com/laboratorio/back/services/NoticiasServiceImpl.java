package com.laboratorio.back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratorio.back.entities.Noticias;
import com.laboratorio.back.repositories.BaseRepository;
import com.laboratorio.back.repositories.NoticiasRepository;

@Service
public class NoticiasServiceImpl extends BaseServiceImpl<Noticias, Long> implements NoticiasService {

	@Autowired
	private NoticiasRepository noticiasRepository;
	
	public NoticiasServiceImpl(BaseRepository<Noticias, Long> baseRepository) {
		super(baseRepository);
	}

	@Override
	public List<Noticias> search(String filtro) throws Exception {
		try {
			List<Noticias> noticias = noticiasRepository.search(filtro);
			return noticias;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
