package com.dao.mysqlimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.PhotoDao;
import com.entity.Photo;

@Repository
@Transactional
public class PhotoDaoImpl extends Dao implements PhotoDao {

	public void add(Photo photo) {
		getSession().save(photo);
	}

	public void delete(Photo photo) {
		getSession().delete(photo);
	}

	public Photo get(int id) {
		return getSession().get(Photo.class, id);
	}

	public void update(Photo photo) {
		getSession().update(photo);
	}

	@SuppressWarnings("unchecked")

	public List<Photo> getAllPhoto() {
		return getSession().createQuery("from Photo").list();
	}

}
