package com.earroyoron.opensicres.dao;

import java.util.List;
/**
 * Implementación genérica que debe extenderse
 * @author earroyoron
 *
 * @param <E>
 */
public abstract class AbstractDAO<E> implements GenericDAO<E> {
	
	@Override
	public List<E> getAll() {
		throw new RuntimeException ("El DAO no implementa el método");
	}

	@Override
	public E getById(Long id) {
		throw new RuntimeException ("El DAO no implementa el método");
	}

	@Override
	public E save(E entity) {
		throw new RuntimeException ("El DAO no implementa el método");
	}

	@Override
	public E update(E entity) {
		throw new RuntimeException ("El DAO no implementa el método");
	}
	
	
}
