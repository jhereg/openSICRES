package com.earroyoron.opensicres.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UnidadTramitadora {

	@Id
	private long id;
	private String codigo;
	private String nombre;
	
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
