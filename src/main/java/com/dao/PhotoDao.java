package com.dao;

import java.util.List;

import com.entity.Photo;

public interface PhotoDao {

	public void add(Photo photo);

	public void delete(Photo photo);

	public Photo get(int id);

	public void update(Photo photo);

	public List<Photo> getAllPhoto();

}
