package com.earroyoron.opensicres.services;

import org.apache.tapestry5.hibernate.HibernateTransactionAdvisor;
import org.apache.tapestry5.ioc.MethodAdviceReceiver;
import org.apache.tapestry5.ioc.ServiceBinder;
import org.apache.tapestry5.ioc.annotations.Match;

import com.earroyoron.opensicres.dao.ApunteRegistralDAO;
import com.earroyoron.opensicres.dao.ApunteRegistralHibernate;
import com.earroyoron.opensicres.dao.LibroDAO;
import com.earroyoron.opensicres.dao.LibroHibernate;
import com.earroyoron.opensicres.dao.UnidadTramitadoraDAO;
import com.earroyoron.opensicres.dao.UnidadTramitadoraHibernate;



/**
 * Módulo de configuración Tapestry que amplia el AppModule por defecto
 * contiene configuraciones de IoC, hibernate, beanvalidators...)
 * @see es.cne.paco.services.AppModule
 */
@SuppressWarnings("PMD")
public class HibernateModule
{
	/**
	 * Enlaza las interfaces con su implementación en la IoC de Tapestry
	 * @param binder
	 */
    public static void bind(ServiceBinder binder)
    {
    	binder.bind(ApunteRegistralDAO.class, ApunteRegistralHibernate.class);
    	binder.bind(LibroDAO.class, LibroHibernate.class);
    	binder.bind(UnidadTramitadoraDAO.class, UnidadTramitadoraHibernate.class);

  }

    @Match("*DAO")
    public static void adviseTransactions(HibernateTransactionAdvisor advisor,
            MethodAdviceReceiver receiver)
    {
        advisor.addTransactionCommitAdvice(receiver);
    }
}
