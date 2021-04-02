package com.laboratorio.back.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "noticias")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Noticias extends Base{
	
	private static final long serialVersionUID = 1L;
	
	private String titulo;
	private String resumen; 
	private String imagen; 
	private String contenidoHTML;
	private char publicada;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha; 
	
	@PrePersist
	public void prePersist() {
		this.fecha = new Date();
	}
	

}
