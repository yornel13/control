package hibernate.dao;

import hibernate.model.Bono;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Bono
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see hibernate.model.Bono
 * @author MyEclipse Persistence Tools
 */
public class BonoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(BonoDAO.class);
	// property constants
	public static final String CONCEPTO = "concepto";
	public static final String DETALLES = "detalles";
	public static final String MONTO = "monto";
	public static final String ACTIVO = "activo";

	public void save(Bono transientInstance) {
		log.debug("saving Bono instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Bono persistentInstance) {
		log.debug("deleting Bono instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Bono findById(java.lang.Integer id) {
		log.debug("getting Bono instance with id: " + id);
		try {
			Bono instance = (Bono) getSession().get("hibernate.model.Bono", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Bono instance) {
		log.debug("finding Bono instance by example");
		try {
			List results = getSession().createCriteria("hibernate.model.Bono")
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
		log.debug("finding Bono instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Bono as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByConcepto(Object concepto) {
		return findByProperty(CONCEPTO, concepto);
	}

	public List findByDetalles(Object detalles) {
		return findByProperty(DETALLES, detalles);
	}

	public List findByMonto(Object monto) {
		return findByProperty(MONTO, monto);
	}

	public List findByActivo(Object activo) {
		return findByProperty(ACTIVO, activo);
	}

	public List findAll() {
		log.debug("finding all Bono instances");
		try {
			String queryString = "from Bono";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Bono merge(Bono detachedInstance) {
		log.debug("merging Bono instance");
		try {
			Bono result = (Bono) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Bono instance) {
		log.debug("attaching dirty Bono instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Bono instance) {
		log.debug("attaching clean Bono instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}