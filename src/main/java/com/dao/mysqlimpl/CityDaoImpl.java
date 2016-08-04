package com.dao.mysqlimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CityDao;
import com.entity.City;
import com.entity.Region;

@Repository
@Transactional
public class CityDaoImpl extends Dao implements CityDao {

	public void add(City city) {
		getSession().save(city);
	}

	public void delete(City city) {
		getSession().delete(city);
	}

	public City get(int id) {
		return getSession().get(City.class, id);
	}

	public void update(City city) {
		getSession().update(city);
	}

	@SuppressWarnings("unchecked")
	public List<City> getAll() {
		return getSession().createQuery("from City").list();
	}

	@SuppressWarnings("unchecked")
	public List<City> getAllByRegion(Region region) {
		return (List<City>) getSession().createQuery("from City c where c.region = :region").setEntity("region", region)
				.list();
	}

}
