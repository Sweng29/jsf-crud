package com.sms.dao;

import java.util.List;

public interface GenericDAO<T> {

	public void createOrUpdate(T entity);
	public void delete(Integer id);
	public List<T> findAll();
	public T findById(Integer id);
}
