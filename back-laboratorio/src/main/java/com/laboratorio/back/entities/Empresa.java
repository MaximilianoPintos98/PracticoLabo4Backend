package com.laboratorio.back.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
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
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(
			name = "Empresa_Noticias",
			joinColumns = @JoinColumn(name = "empresa_id"),
			inverseJoinColumns = @JoinColumn(name = "noticia_id")
			)
	private List<Noticias> noticia = new ArrayList<Noticias>();
	
}
