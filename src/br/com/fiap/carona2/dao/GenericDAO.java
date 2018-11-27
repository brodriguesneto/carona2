package br.com.fiap.carona2.dao;

public interface GenericDAO<T, K> {
	
	void register(T entity);
	
	void update(T entity);
	
	T search(K key);
	
	void delete(K key) throws Exception;
	
	void commit() throws Exception;

}
