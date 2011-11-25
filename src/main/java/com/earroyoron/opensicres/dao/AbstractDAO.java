package com.earroyoron.opensicres.dao;

import java.util.List;
/**
 * Implementaci�n gen�rica que debe extenderse
 * @author earroyoron
 *
 * @param <E>
 */
public abstract class AbstractDAO<E> implements GenericDAO<E> {
	
	@Override
	public List<E> getAll() {
		throw new RuntimeException ("El DAO no implementa el m�todo");
	}

	@Override
	public E getById(Long id) {
		throw new RuntimeException ("El DAO no implementa el m�todo");
	}

	@Override
	public E save(E entity) {
		throw new RuntimeException ("El DAO no implementa el m�todo");
	}

	@Override
	public E update(E entity) {
		throw new RuntimeException ("El DAO no implementa el m�todo");
	}
	
	
}
