package com.earroyoron.opensicres.dao;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import java.util.List;

import org.apache.tapestry5.ioc.test.TestUtils;
import org.testng.AssertJUnit;
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
	public void listo_todas_las_unidades_tramitadoras() throws Exception
	{
		List<UnidadTramitadora> lista = unidadTramitadoraDao.getAll();
		AssertJUnit.assertEquals( 2, lista.size() );
	}
	
}
