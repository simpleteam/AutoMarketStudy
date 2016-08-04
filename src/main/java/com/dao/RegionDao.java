package com.dao;

import java.util.List;

import com.entity.Region;

public interface RegionDao {

	public void add(Region region);
	
	public Region get(int id);
	
	public void update(Region region);
	
	public void delete(Region region);
	
	public List<Region> getAll();
	
	public Region getByName(String name);
	
}
