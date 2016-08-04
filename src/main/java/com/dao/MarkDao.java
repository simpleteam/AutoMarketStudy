package com.dao;

import java.util.List;

import com.entity.Mark;

public interface MarkDao {

	public void add(Mark mark);

	public void delete(Mark mark);

	public Mark get(int id);

	public void update(Mark mark);

	public List<Mark> getAll();

}
