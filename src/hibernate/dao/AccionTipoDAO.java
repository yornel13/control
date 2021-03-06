package hibernate.dao;

import hibernate.model.AccionTipo;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * AccionTipo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see hibernate.model.AccionTipo
 * @author MyEclipse Persistence Tools
 */
public class AccionTipoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AccionTipoDAO.class);
	// property constants
	public static final String NOMBRE = "nombre";
	public static final String ACTIVO = "activo";

	public void save(AccionTipo transientInstance) {
		log.debug("saving AccionTipo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AccionTipo persistentInstance) {
		log.debug("deleting AccionTipo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AccionTipo findById(java.lang.Integer id) {
		log.debug("getting AccionTipo instance with id: " + id);
		try {
			AccionTipo instance = (AccionTipo) getSession().get(
					"hibernate.model.AccionTipo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AccionTipo instance) {
		log.debug("finding AccionTipo instance by example");
		try {
			List results = getSession()
					.createCriteria("hibernate.model.AccionTipo")
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
		log.debug("finding AccionTipo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AccionTipo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNombre(Object nombre) {
		return findByProperty(NOMBRE, nombre);
	}

	public List findByActivo(Object activo) {
		return findByProperty(ACTIVO, activo);
	}

	public List findAll() {
		log.debug("finding all AccionTipo instances");
		try {
			String queryString = "from AccionTipo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AccionTipo merge(AccionTipo detachedInstance) {
		log.debug("merging AccionTipo instance");
		try {
			AccionTipo result = (AccionTipo) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AccionTipo instance) {
		log.debug("attaching dirty AccionTipo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AccionTipo instance) {
		log.debug("attaching clean AccionTipo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}