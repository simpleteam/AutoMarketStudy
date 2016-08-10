package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CityDao;
import com.dao.UserDao;
import com.entity.User;
import com.view.UserView;



@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private CityDao cityDao;
	
	public void addUser(UserView user){
		userDao.add(viewToEntity(user));
	}
	
	public UserView getUser(int id){
		return new UserView(userDao.get(id));
	}
	
	public void updateUser(UserView user){
		userDao.update(viewToEntity(user));
	}
	
	public void deleteUser(UserView user){
		userDao.delete(viewToEntity(user));
	}
	
	private User viewToEntity(UserView user){
		User entityUser = new User();
		entityUser.setId(user.getId());
		entityUser.setName(user.getName());
		entityUser.setPassword(user.getPassword());
		entityUser.setPhone(user.getPhone());
		entityUser.setCity(cityDao.get(user.getCity().getId()));
		return entityUser;
	}
	
}
