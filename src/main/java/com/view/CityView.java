package com.view;

import com.entity.City;

public class CityView {

	private int id;
	private String city;
	private RegionView region;

	public CityView() {
	}

	public CityView(City city) {
		this.id = city.getId();
		this.city = city.getCity();
		this.region = new RegionView(city.getRegion());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public RegionView getRegion() {
		return region;
	}

	public void setRegion(RegionView region) {
		this.region = region;
	}

}
