package com.earroyoron.opensicres.entities;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Un apunte registral realizado en nuestra aplicaci—n
 * El contenido de nuestro apunte no tiene que ser, necesariamente, lo mismo que luego intercambiamos!
 * Es decir, podemos intercambiar m‡s o menos cosas, depende del formato de intercambio etc.
 * @author earroyoron
 *
 */
@Entity
public class ApunteRegistral {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String numero;
	
	@Temporal( TemporalType.DATE )
	private Calendar fecha;
	
	@ManyToOne
	@JoinColumn(name="FKLIBRO") 
	private Libro libro;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
}
