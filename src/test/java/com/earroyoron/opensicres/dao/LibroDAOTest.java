package com.earroyoron.opensicres.dao;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

import java.util.List;

import org.apache.tapestry5.ioc.test.TestUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.earroyoron.opensicres.entities.Libro;
import java.security.InvalidParameterException;

public class LibroDAOTest extends DBconnection {

    private LibroDAO libroDao;

    @BeforeClass
    public void getHibernateSession() throws Exception {
        libroDao = TestUtils.create(LibroHibernate.class, "session", super.sessionForTesting);
    }

    @BeforeMethod
    public void prepareData() throws Exception {
        super.cleanAndPopulate("database");
    }

    @Test(enabled = true)
    public void getAll_devuelveTodas() throws Exception {
        List<Libro> lista = libroDao.getAll();
        assertThat(lista.size(), is(5));
    }

    @Test(enabled = true)
    public void getAll_contenidoCorrecto() throws Exception {
        List<Libro> lista = libroDao.getAll();
        Libro libro = lista.get(0);
        assertThat(libro.getNombre(), is("LibroA"));
        assertThat(libro.getUnidad().getCodigo(), is("0456"));
    }
    
    @Test(enabled = true, expectedExceptions=InvalidParameterException.class)
    public void getLibroById_Null() throws Exception {
        Libro libro = libroDao.getById(null);
    }
    
    @Test(enabled = true)
    public void getLibroById_Existente() throws Exception {
        Libro libro = libroDao.getById(1L);
        assertThat(libro,notNullValue());
        assertThat(libro.getNombre(),is("LibroA"));
        assertThat(libro.getDescripcion(),is("LibroAdesc"));
        assertThat(libro.getUnidad().getCodigo(),is("0456"));
        assertThat(libro.getApuntes().size(),is(7));
    }
    
    @Test(enabled = true)
    public void getLibroById_NoExistente() throws Exception {
        Libro libro = libroDao.getById(10L);
        assertThat(libro,nullValue());
    }
    

}
