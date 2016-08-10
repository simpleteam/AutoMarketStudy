package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MarkDao;
import com.dao.ModelDao;
import com.entity.Model;
import com.view.ModelView;


@Service
public class ModelService {

	@Autowired
	private ModelDao modelDao;

	@Autowired
	private MarkDao markDao;

	public void add(ModelView model) {
		modelDao.add(viewToEntity(model));
	}

	public ModelView get(int id) {
		return new ModelView(modelDao.get(id));
	}

	public void update(ModelView model) {
		modelDao.update(viewToEntity(model));
	}

	public void delete(ModelView model) {
		modelDao.delete(viewToEntity(model));
	}

	private Model viewToEntity(ModelView model) {
		Model entityModel = new Model();
		entityModel.setId(model.getId());
		entityModel.setModel(model.getModel());
		entityModel.setMark(markDao.get(model.getMark().getId()));
		return entityModel;
	}

}
