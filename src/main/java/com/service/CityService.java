package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CityDao;
import com.dao.RegionDao;
import com.entity.City;
import com.view.CityView;



@Service
public class CityService {

	@Autowired
	private CityDao cityDao;

	@Autowired
	private RegionDao regionDao;

	public void addCity(CityView city) {
		cityDao.add(viewToEntity(city));
	}

	public CityView getCityById(int id) {
		return new CityView(cityDao.get(id));
	}

	public void updateCity(CityView city) {
		cityDao.update(viewToEntity(city));
	}

	public void deleteCity(CityView city) {
		cityDao.delete(viewToEntity(city));
	}

	private City viewToEntity(CityView city) {
		City entityCity = new City();
		entityCity.setId(city.getId());
		entityCity.setCity(city.getCity());
		entityCity.setRegion(regionDao.get(city.getRegion().getId()));
		return entityCity;
	}
	
//	private CityView entityToView(City city){
//		CityView viewCity = new CityView();
//		return null;
//	}

}
