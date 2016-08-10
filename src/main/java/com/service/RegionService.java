package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RegionDao;
import com.entity.Region;
import com.view.RegionView;



@Service
public class RegionService {

	@Autowired
	private RegionDao regionDao;

	public void add(RegionView region) {
		regionDao.add(viewToEntity(region));
	}

	public RegionView get(int id) {
		return new RegionView(regionDao.get(id));
	}

	public void update(RegionView region) {
		regionDao.update(viewToEntity(region));
	}

	public void delete(RegionView region) {
		regionDao.delete(viewToEntity(region));
	}
	
	public RegionView getByName(String name){
		return new RegionView(regionDao.getByName(name));
	}

	private Region viewToEntity(RegionView region) {
		Region entityRegion = new Region();
		entityRegion.setId(region.getId());
		entityRegion.setRegion(region.getRegion());
		return entityRegion;
	}

}
