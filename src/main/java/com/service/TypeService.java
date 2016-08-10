package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TypeDao;
import com.entity.Type;
import com.view.TypeView;



@Service
public class TypeService {

	@Autowired
	private TypeDao typeDao;
	
	public void add(TypeView type){
		typeDao.add(viewToEntity(type));
	}
	
	public TypeView get(int id){
		return new TypeView(typeDao.get(id));
	}
	
	public void update(TypeView type){
		typeDao.update(viewToEntity(type));
	}
	
	public void delete(TypeView type){
		typeDao.delete(viewToEntity(type));
	}
	
	private Type viewToEntity(TypeView type){
		Type entityType = new Type();
		entityType.setId(type.getId());
		entityType.setType(type.getType());
		return entityType;
	}
	
}
