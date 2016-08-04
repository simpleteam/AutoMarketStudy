package com.dao;

import java.util.List;

import com.entity.Model;

public interface ModelDao {

	public void add(Model model);

	public void delete(Model model);

	public Model get(int id);

	public void update(Model model);

	public List<Model> getAll();

}
