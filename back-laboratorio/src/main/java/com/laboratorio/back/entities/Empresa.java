package com.laboratorio.back.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "empresas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Empresa extends Base{
	private static final long serialVersionUID = 1L;
	
	
	private String denominacion;
	private String telefono;
	private String email;
	private String domicilio; 
	private String horario;
	private String info;
	private Double latitud;
	private Double longitud; 
	
}
