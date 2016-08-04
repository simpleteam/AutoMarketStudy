package com.dao.mysqlimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.RegionDao;
import com.entity.Region;

@Repository
@Transactional
public class RegionDaoImpl extends Dao implements RegionDao {

	public void add(Region region) {
		getSession().save(region);
	}

	public void delete(Region region) {
		getSession().delete(region);
	}

	public Region get(int id) {
		return getSession().get(Region.class, id);
	}

	public void update(Region region) {
		getSession().update(region);
	}

	@SuppressWarnings("unchecked")

	public List<Region> getAll() {
		return getSession().createQuery("from Region ").list();
	}

	public Region getByName(String name) {
		return (Region) getSession().createQuery("from Region r where r.region = :name").setParameter("name", name)
				.uniqueResult();
	}
}
