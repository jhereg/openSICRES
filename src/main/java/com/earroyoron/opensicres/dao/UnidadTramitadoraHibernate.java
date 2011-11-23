package com.earroyoron.opensicres.dao;

import java.util.Collections;
import java.util.List;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import com.earroyoron.opensicres.entities.UnidadTramitadora;

public class UnidadTramitadoraHibernate implements UnidadTramitadoraDAO {

	@Inject
	private Session session;
	
	@Override
	public List<UnidadTramitadora> getAll() {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

}
