package com.earroyoron.opensicres.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UnidadTramitadora {

	@Id
	private long id;
	private String codigo;
	private String nombre;
	
	
}
