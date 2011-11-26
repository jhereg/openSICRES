package com.earroyoron.opensicres.dao;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.apache.tapestry5.ioc.test.TestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.earroyoron.opensicres.entities.Libro;

public class LibroDAOTest extends DBconnection
{
	private LibroDAO libroDao;


	@BeforeSuite
	public void getHibernateSession() throws Exception
	{
		libroDao = TestUtils.create( LibroHibernate.class, "session", super.sessionForTesting );
	}

	@BeforeMethod
	public void prepareData() throws Exception
	{
		super.cleanAndPopulate( "database" );
	}

	@Test( enabled = true )
	public void getAll_devuelveTodas() throws Exception
	{
		List<Libro> lista = libroDao.getAll();
		assertThat(lista.size(), is(5) );
	}
	
	@Test( enabled = true )
	public void getAll_contenidoCorrecto() throws Exception
	{
		List<Libro> lista = libroDao.getAll();
		Libro libro = lista.get(0);
		assertThat(libro.getNombre(), is("LibroA"));
		assertThat(libro.getUnidad().getCodigo(),is("0456"));
	}
}
