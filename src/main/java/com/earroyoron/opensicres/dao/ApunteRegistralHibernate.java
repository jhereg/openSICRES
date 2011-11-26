package com.earroyoron.opensicres.dao;

import java.util.List;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Criteria;
import org.hibernate.Session;

import com.earroyoron.opensicres.entities.ApunteRegistral;
import com.earroyoron.opensicres.entities.Libro;
import com.earroyoron.opensicres.entities.UnidadTramitadora;

public class ApunteRegistralHibernate  extends AbstractDAO<ApunteRegistral> implements ApunteRegistralDAO {

	@Inject
	private Session session;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ApunteRegistral> getAll() {
		Criteria criterio = session.createCriteria(ApunteRegistral.class);
		return criterio.list();
	}

	@Override
	public List<ApunteRegistral> getByLibro(Libro libro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ApunteRegistral> getByUnidadTramitadora(UnidadTramitadora unidad) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
