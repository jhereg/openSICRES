package com.earroyoron.opensicres.dao;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.apache.tapestry5.ioc.test.TestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.earroyoron.opensicres.entities.UnidadTramitadora;

public class UnidadTramitadoraDAOTest extends DBconnection
{
	private UnidadTramitadoraDAO unidadTramitadoraDao;


	@BeforeSuite
	public void getHibernateSession() throws Exception
	{
		unidadTramitadoraDao = TestUtils.create( UnidadTramitadoraHibernate.class, "session", super.sessionForTesting );
	}

	@BeforeMethod
	public void prepareData() throws Exception
	{
		super.cleanAndPopulate( "database" );
	}

	@Test( enabled = true )
	public void getAll_devuelveTodas() throws Exception
	{
		List<UnidadTramitadora> lista = unidadTramitadoraDao.getAll();
		assertThat(lista.size(), is(2) );
	}
	
	@Test( enabled = true )
	public void getAll_contenidoCorrecto() throws Exception
	{
		List<UnidadTramitadora> lista = unidadTramitadoraDao.getAll();
		UnidadTramitadora unidad = lista.get(0);
		assertThat(unidad.getCodigo(), is("0456"));
		assertThat(unidad.getNombre(), is("Ministerio del Aire"));
	}
}
