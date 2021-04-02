package com.laboratorio.back.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

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
	
	private String titulo;
	private String resumen; 
	private String imagen; 
	private String contenidoHTML;
	private char publicada;
	private Date fecha; 

}
