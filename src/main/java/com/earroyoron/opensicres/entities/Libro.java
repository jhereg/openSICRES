package com.earroyoron.opensicres.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="FKUNIDAD")
	private UnidadTramitadora unidad;
	
	@OneToMany(mappedBy="libro")
	private List<ApunteRegistral> apuntes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public UnidadTramitadora getUnidad() {
		return unidad;
	}

	public void setUnidad(UnidadTramitadora unidad) {
		this.unidad = unidad;
	}

	public List<ApunteRegistral> getApuntes() {
		return apuntes;
	}

	public void setApuntes(List<ApunteRegistral> apuntes) {
		this.apuntes = apuntes;
	}
	
	
	
}
