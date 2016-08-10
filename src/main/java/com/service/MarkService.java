package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MarkDao;
import com.dao.TypeDao;
import com.entity.Mark;
import com.view.MarkView;



@Service
public class MarkService {

	@Autowired
	private MarkDao markDao;
	
	@Autowired
	private TypeDao typeDao;
	
	public void addMark(MarkView mark){
		markDao.add(viewToEntity(mark));
	}
	
	public MarkView getMark(int id){
		return new MarkView(markDao.get(id));
	}
	
	public void updateMark(MarkView mark){
		markDao.update(viewToEntity(mark));
	}
	
	public void deleteMark(MarkView mark){
		markDao.delete(viewToEntity(mark));
	}
	
	private Mark viewToEntity(MarkView mark){
		Mark entityMark = new Mark();
		entityMark.setId(mark.getId());
		entityMark.setMark(mark.getMark());
		entityMark.setType(typeDao.get(mark.getType().getId()));
		return entityMark;
	}
	
}
