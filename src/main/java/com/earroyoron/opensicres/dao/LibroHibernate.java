package com.earroyoron.opensicres.dao;

import java.util.List;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Criteria;
import org.hibernate.Session;

import com.earroyoron.opensicres.entities.Libro;

public class LibroHibernate  extends AbstractDAO<Libro> implements LibroDAO {

	@Inject
	private Session session;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Libro> getAll() {
		Criteria criterio = session.createCriteria(Libro.class);
		return criterio.list();
	}

}
