package com.laboratorio.back.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.laboratorio.back.entities.Noticias;

@Repository
public interface NoticiasRepository extends BaseRepository<Noticias, Long> {

	@Query(value = "SELECT n FROM Noticias n WHERE n.titulo LIKE %:filtro% OR n.resumen LIKE %:filtro%")
	List<Noticias> search(@Param("filtro") String filtro);
	
}
