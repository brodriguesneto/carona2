package br.com.fiap.carona2.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import br.com.fiap.carona2.dao.GenericDAO;
import br.com.fiap.carona2.singleton.EntityManagerFactorySingleton;

public class GenericDAOImpl<T,K> implements GenericDAO<T, K> {
	
	protected EntityManager em;
	
	private Class<T> clazz;
	
	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		this.em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];   
	}
	
	@Override
	public void register(T entity) {
		em.persist(entity);
		
	}

	@Override
	public void update(T entity) {
		em.merge(entity);
		
	}

	@Override
	public T search(K key) {
		return em.find(clazz, key);
	}

	@Override
	public void delete(K key) throws Exception {
		T entity = search(key);
		if (entity == null) {
			throw new Exception("Entity not find");
		}
		em.remove(entity);
		
	}

	@Override
	public void commit() throws Exception {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch(Exception e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			throw new Exception("Commit error");
		}
		
	}

}
