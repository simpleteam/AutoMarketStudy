package com.dao;

import java.util.List;

import com.entity.User;

public interface UserDao {

	public void add(User user);
	
	public void delete(User user);
	
	public User get(int id);
	
	public void update(User user);
	
	public List<User> getAll();
	
}
