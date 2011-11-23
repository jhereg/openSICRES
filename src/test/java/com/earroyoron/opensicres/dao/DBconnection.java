package com.earroyoron.opensicres.dao;

import java.io.InputStream;

import org.apache.log4j.Logger;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.AfterClass;

import com.earroyoron.opensicres.entities.UnidadTramitadora;



public abstract class DBconnection {

	protected Session sessionForTesting;
	private static Logger log = Logger.getLogger(DBconnection.class.getName());
	
	 private IDatabaseConnection conn;
	private IDataSet dataset;

public  DBconnection () {
	 log.debug("Comienza inicio HB");
	 Configuration config = new Configuration();
	 config.addAnnotatedClass(UnidadTramitadora.class);
	 config.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
	 config.setProperty("hibernate.connection.driver_class", "org.apache.derby.jdbc.EmbeddedDriver");
	 config.setProperty("hibernate.connection.url", "jdbc:derby:memory:testing;create=true");
	 config.setProperty("hibernate.connection.username", "");
	 config.setProperty("hibernate.connection.password", "");
	 config.setProperty("hibernate.connection.pool_size", "1");
	 config.setProperty("hibernate.connection.autocommit", "true");
	 config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.HashtableCacheProvider");
	 config.setProperty("hibernate.hbm2ddl.auto", "create-drop");
	 config.setProperty("hibernate.show_sql", "true");
	 log.debug("Finalizado inicio HB");
	 
	 HibernateUtil.setSessionFactory(config.buildSessionFactory());
	 this.sessionForTesting = HibernateUtil.getSession();
}

	@SuppressWarnings("deprecation")
	public void cleanAndPopulate (String nameXML) throws Exception {
		 conn = new DatabaseConnection (sessionForTesting.connection());
		 InputStream is = DBconnection.class.getClassLoader().getResourceAsStream(nameXML + ".xml");  
		 dataset = new FlatXmlDataSet(is);	
		 DatabaseOperation.CLEAN_INSERT.execute(conn,dataset); 
	}

@SuppressWarnings("deprecation")
public void clean (String nameXML) throws Exception {
	conn = new DatabaseConnection (sessionForTesting.connection());
	 InputStream is = DBconnection.class.getClassLoader().getResourceAsStream(nameXML + ".xml");  
	 dataset = new FlatXmlDataSet(is);	
	 DatabaseOperation.DELETE_ALL.execute(conn,dataset);
}



@AfterClass
public void removeAll() throws Exception {
	 DatabaseOperation.DELETE_ALL.execute(conn,dataset); 
	conn.close();
	//DatabaseOperation.DELETE_ALL.execute(conn,dataset);
}
}
