package hibernate.dao;

import hibernate.model.PagoMes;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * PagoMes entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see hibernate.model.PagoMes
 * @author MyEclipse Persistence Tools
 */
public class PagoMesDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(PagoMesDAO.class);
	// property constants
	public static final String TOTAL_DIAS = "totalDias";
	public static final String HORAS_NORMALES = "horasNormales";
	public static final String TOTAL_HORAS_NORMALES = "totalHorasNormales";
	public static final String TOTAL_HORAS_EXTRAS = "totalHorasExtras";
	public static final String TOTAL_HORAS_SUPLEMENTARIAS = "totalHorasSuplementarias";
	public static final String TOTAL_HORAS_ADICIONALES = "totalHorasAdicionales";
	public static final String MONTO_BONO = "montoBono";
	public static final String MONTO_TRANSPORTE = "montoTransporte";
	public static final String TOTAL_MONTO_ADICIONALES = "totalMontoAdicionales";
	public static final String SUBTOTAL = "subtotal";
	public static final String TOTAL_DECIMO_TERCERO = "totalDecimoTercero";
	public static final String TOTAL_DECIMO_CUARTO = "totalDecimoCuarto";
	public static final String MONTO_JUBILACION_PATRONAL = "montoJubilacionPatronal";
	public static final String MONTO_APORTE_PATRONAL = "montoAportePatronal";
	public static final String MONTO_SEGUROS = "montoSeguros";
	public static final String MONTO_UNIFORMES = "montoUniformes";
	public static final String MONTO_TOTAL_INGRESO = "montoTotalIngreso";

	public void save(PagoMes transientInstance) {
		log.debug("saving PagoMes instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PagoMes persistentInstance) {
		log.debug("deleting PagoMes instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PagoMes findById(java.lang.Integer id) {
		log.debug("getting PagoMes instance with id: " + id);
		try {
			PagoMes instance = (PagoMes) getSession().get(
					"hibernate.model.PagoMes", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PagoMes instance) {
		log.debug("finding PagoMes instance by example");
		try {
			List results = getSession()
					.createCriteria("hibernate.model.PagoMes")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PagoMes instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PagoMes as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTotalDias(Object totalDias) {
		return findByProperty(TOTAL_DIAS, totalDias);
	}

	public List findByHorasNormales(Object horasNormales) {
		return findByProperty(HORAS_NORMALES, horasNormales);
	}

	public List findByTotalHorasNormales(Object totalHorasNormales) {
		return findByProperty(TOTAL_HORAS_NORMALES, totalHorasNormales);
	}

	public List findByTotalHorasExtras(Object totalHorasExtras) {
		return findByProperty(TOTAL_HORAS_EXTRAS, totalHorasExtras);
	}

	public List findByTotalHorasSuplementarias(Object totalHorasSuplementarias) {
		return findByProperty(TOTAL_HORAS_SUPLEMENTARIAS,
				totalHorasSuplementarias);
	}

	public List findByTotalHorasAdicionales(Object totalHorasAdicionales) {
		return findByProperty(TOTAL_HORAS_ADICIONALES, totalHorasAdicionales);
	}

	public List findByMontoBono(Object montoBono) {
		return findByProperty(MONTO_BONO, montoBono);
	}

	public List findByMontoTransporte(Object montoTransporte) {
		return findByProperty(MONTO_TRANSPORTE, montoTransporte);
	}

	public List findByTotalMontoAdicionales(Object totalMontoAdicionales) {
		return findByProperty(TOTAL_MONTO_ADICIONALES, totalMontoAdicionales);
	}

	public List findBySubtotal(Object subtotal) {
		return findByProperty(SUBTOTAL, subtotal);
	}

	public List findByTotalDecimoTercero(Object totalDecimoTercero) {
		return findByProperty(TOTAL_DECIMO_TERCERO, totalDecimoTercero);
	}

	public List findByTotalDecimoCuarto(Object totalDecimoCuarto) {
		return findByProperty(TOTAL_DECIMO_CUARTO, totalDecimoCuarto);
	}

	public List findByMontoJubilacionPatronal(Object montoJubilacionPatronal) {
		return findByProperty(MONTO_JUBILACION_PATRONAL,
				montoJubilacionPatronal);
	}

	public List findByMontoAportePatronal(Object montoAportePatronal) {
		return findByProperty(MONTO_APORTE_PATRONAL, montoAportePatronal);
	}

	public List findByMontoSeguros(Object montoSeguros) {
		return findByProperty(MONTO_SEGUROS, montoSeguros);
	}

	public List findByMontoUniformes(Object montoUniformes) {
		return findByProperty(MONTO_UNIFORMES, montoUniformes);
	}

	public List findByMontoTotalIngreso(Object montoTotalIngreso) {
		return findByProperty(MONTO_TOTAL_INGRESO, montoTotalIngreso);
	}

	public List findAll() {
		log.debug("finding all PagoMes instances");
		try {
			String queryString = "from PagoMes";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PagoMes merge(PagoMes detachedInstance) {
		log.debug("merging PagoMes instance");
		try {
			PagoMes result = (PagoMes) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PagoMes instance) {
		log.debug("attaching dirty PagoMes instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PagoMes instance) {
		log.debug("attaching clean PagoMes instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}