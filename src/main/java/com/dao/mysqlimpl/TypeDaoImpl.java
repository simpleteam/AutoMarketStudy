package com.dao.mysqlimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.TypeDao;
import com.entity.Type;

@Repository
@Transactional
public class TypeDaoImpl extends Dao implements TypeDao {

	public void add(Type type) {
		getSession().save(type);
	}

	public void delete(Type type) {
		getSession().delete(type);
	}

	public Type get(int id) {
		return getSession().get(Type.class, id);
	}

	public void update(Type type) {
		getSession().update(type);
	}

	@SuppressWarnings("unchecked")

	public List<Type> getAll() {
		return getSession().createQuery("from Type").list();
	}

	public Type getTypeByName(String name) {
		return (Type) getSession().createQuery("FROM Type t WHERE t.type = :typeName").setParameter("typeName", name)
				.uniqueResult();
	}

}
