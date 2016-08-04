package com.dao.mysqlimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MarkDao;
import com.entity.Mark;

@Repository
@Transactional
public class MarkDaoImpl extends Dao implements MarkDao {

	public void add(Mark mark) {
		getSession().save(mark);
	}

	public void delete(Mark mark) {
		getSession().delete(mark);
	}

	public Mark get(int id) {
		return getSession().get(Mark.class, id);
	}

	public void update(Mark mark) {
		getSession().update(mark);
	}

	@SuppressWarnings("unchecked")
	public List<Mark> getAll() {
		return getSession().createQuery("from Mark").list();
	}
}
