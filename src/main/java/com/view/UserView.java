package com.view;

import com.entity.User;

public class UserView {

	private int id;
	private String name;
	private String phone;
	private String password;
	private CityView city;

	public UserView() {
		this.city = new CityView();
	}

	public UserView(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.phone = user.getPhone();
		this.password = user.getPassword();
		this.city = new CityView(user.getCity());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CityView getCity() {
		return city;
	}

	public void setCity(CityView city) {
		this.city = city;
	}

}
