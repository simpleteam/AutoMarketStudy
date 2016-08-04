package com.dao;

import java.util.List;

import com.entity.Advertisement;

public interface AdvertisementDao {

	public void add(Advertisement advertisement);

	public Advertisement get(int id);

	public void update(Advertisement advertisement);

	public void delete(Advertisement advertisement);

	public List<Advertisement> getAll();

	
	public List<Advertisement> getAllByModel(int modelId);
	
	public List<Advertisement> getAllByModelAndPrice(int modelId, double minPrice, double maxPrice);

	public List<Advertisement> getAllByModelAndYear(int modelId, int minYear, int maxYear);

	public List<Advertisement> getAllByModelAndCity(int modelId, int cityId);

	public List<Advertisement> getAllByModelAndUser(int modelId, int userId);
	
	public List<Advertisement> getAllbyModelAndPriceAndYear(int modelId, double minPrice, double maxPrice, int minYear,int maxYear);

	public List<Advertisement> getAllbyModelAndPriceAndCity(int modelId, double minPrice, double maxPrice, int cityId);
	
	public List<Advertisement> getAllbyModelAndPriceAndYearAndCity(int modelId, double minPrice, double maxPrice, int minYear, int maxYear, int cityId);

	
	public List<Advertisement> getAllByPrice(double minPrice, double maxPrice);
	
	public List<Advertisement> getAllByPriceAndYear(double minPrice, double maxPrice, int minYear, int maxYear);

	public List<Advertisement> getAllByPriceAndCity(double minPrice, double maxPrice, int cityId);

	public List<Advertisement> getAllByPriceAndUser(double minPrice, double maxPrice, int userId);
	
	public List<Advertisement> getAllbyPriceAndYearAndCity(double minPrice, double maxPrice, int minYear, int maxYear, int cityId);
	
	
	public List<Advertisement> getAllByYear(int minYear, int maxYear);
	
	public List<Advertisement> getAllByYearAndCity(int minYear, int maxYear, int cityId);
	

	public List<Advertisement> getAllByCity(int cityId);

	public List<Advertisement> getAllByUser(int userId);


}
