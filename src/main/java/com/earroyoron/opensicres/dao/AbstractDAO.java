package com.earroyoron.opensicres.dao;

import java.util.List;

public abstract class AbstractDAO<E> implements GenericDAO<E> {
	

	
	@Override
	public List<E> getAll() {
		throw new RuntimeException ("El DAO no implementa el método");
	}
	
}
