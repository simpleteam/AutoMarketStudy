package com.dao;

import java.util.List;

import com.entity.City;
import com.entity.Region;

public interface CityDao {

	public void add(City city);
	
	public void delete(City city);
	
	public City get(int id);
	
	public void update(City city);
	
	public List<City> getAll();
	
	public List<City> getAllByRegion(Region region);
	
}
