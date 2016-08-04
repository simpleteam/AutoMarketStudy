package com.dao.mysqlimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ModelDao;
import com.entity.Model;

@Repository
@Transactional
public class ModelDaoImpl extends Dao implements ModelDao {

	public void add(Model model) {
		getSession().save(model);
	}

	public void delete(Model model) {
		getSession().delete(model);
	}

	public Model get(int id) {
		return getSession().get(Model.class, id);
	}

	public void update(Model model) {
		getSession().update(model);
	}

	@SuppressWarnings("unchecked")
	public List<Model> getAll() {
		return getSession().createQuery("from Model").list();
	}

}
