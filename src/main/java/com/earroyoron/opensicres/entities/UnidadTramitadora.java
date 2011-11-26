package com.earroyoron.opensicres.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UnidadTramitadora {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String codigo;
	private String nombre;
	
	@OneToMany(mappedBy="unidad")
	private List<Libro> libros;
	
	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
