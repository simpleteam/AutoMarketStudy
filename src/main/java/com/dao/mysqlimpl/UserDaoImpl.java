package com.dao.mysqlimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.entity.User;

@Repository
@Transactional
public class UserDaoImpl extends Dao implements UserDao {

	public void add(User user) {
		getSession().save(user);
	}

	public void delete(User user) {
		getSession().delete(user);
	}

	public User get(int id) {
		return getSession().get(User.class, id);
	}

	public void update(User user) {
		getSession().update(user);
	}

	@SuppressWarnings("unchecked")

	public List<User> getAll() {
		return getSession().createQuery("from User").list();
	}
}
