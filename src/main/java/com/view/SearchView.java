package com.view;

public class SearchView {

	private double minPrice;
	private double maxPrice;
	private int minYear;
	private int maxYear;
	private int cityId;
	private int modelId;
	
	public double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}
	public double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}
	public int getMinYear() {
		return minYear;
	}
	public void setMinYear(int minYear) {
		this.minYear = minYear;
	}
	public int getMaxYear() {
		return maxYear;
	}
	public void setMaxYear(int maxYear) {
		this.maxYear = maxYear;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

}
