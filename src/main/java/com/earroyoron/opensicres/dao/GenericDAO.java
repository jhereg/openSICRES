package com.earroyoron.opensicres.dao;

import java.util.List;



public interface GenericDAO<E> {

	/**
	 * Devuelve todos los elementos de la entidad
	 * @return
	 */
	List<E> getAll();
	
	/**
	 * Devuelve el elemento cuyo Id (PK) es el indicado
	 * @param id
	 * @return
	 */
	E getById(Long id);
	
	/**
	 * Guarda la entidad
	 * @param entity
	 * @return
	 */
	E save(E entity);
	
	/**
	 * Actualiza la entidad
	 * @param entity
	 * @return
	 */
	E update(E entity);
}
