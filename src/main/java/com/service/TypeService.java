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
	
	public void addType(TypeView type){
		typeDao.add(viewToEntity(type));
	}
	
	public TypeView getTypeById(int id){
		return new TypeView(typeDao.get(id));
	}
	
	public void updateType(TypeView type){
		typeDao.update(viewToEntity(type));
	}
	
	public void deleteType(TypeView type){
		typeDao.delete(viewToEntity(type));
	}
	
	private Type viewToEntity(TypeView type){
		Type entityType = new Type();
		entityType.setId(type.getId());
		entityType.setType(type.getType());
		return entityType;
	}
	
}
