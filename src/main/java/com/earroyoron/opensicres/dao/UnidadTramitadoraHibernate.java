package com.earroyoron.opensicres.dao;

import java.util.List;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Criteria;
import org.hibernate.Session;

import com.earroyoron.opensicres.entities.UnidadTramitadora;

public class UnidadTramitadoraHibernate  extends AbstractDAO<UnidadTramitadora> implements UnidadTramitadoraDAO {

	@Inject
	private Session session;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UnidadTramitadora> getAll() {
		Criteria criterio = session.createCriteria(UnidadTramitadora.class);
		return criterio.list();
	}

}
