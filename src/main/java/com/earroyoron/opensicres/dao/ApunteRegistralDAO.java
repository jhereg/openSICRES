package com.earroyoron.opensicres.dao;

import java.util.List;

import com.earroyoron.opensicres.entities.ApunteRegistral;
import com.earroyoron.opensicres.entities.Libro;
import com.earroyoron.opensicres.entities.UnidadTramitadora;

public interface ApunteRegistralDAO extends GenericDAO<ApunteRegistral> {

	/**
	 * Devuelve todos los apuntes anotados en un libro
	 * @param libro
	 * @return
	 */
	List<ApunteRegistral> getByLibro(Libro libro);
	
	/**
	 * Devuelve todos los apuntes anotados en una unidad tramitadora
	 * @param unidad
	 * @return
	 */
	List<ApunteRegistral> getByUnidadTramitadora(UnidadTramitadora unidad);
	
}
