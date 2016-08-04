package com.dao;

import com.entity.Type;

import java.util.List;

public interface TypeDao {

	public void add(Type type);

	public void delete(Type type);

	public Type get(int id);

	public void update(Type type);

	public List<Type> getAll();
	
	public Type getTypeByName(String name);

}
