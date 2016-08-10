package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.view.AdvertisementView;

@Service
@Transactional
public class AdminMarketService {

	@Autowired
	private AdvertisementService advertisementService;

	public List<AdvertisementView> getAllAdvertisementsByPrice(double minPrice, double maxPrice) {
		return advertisementService.getAllAdvertisementsByPrice(minPrice, maxPrice);
	}

	public List<AdvertisementView> getAllAdvertisementsByModel(int modelId) {
		return advertisementService.getAllAdvertisementsByModel(modelId);
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndPrice(int modelId, double minPrice, double maxPrice) {
		return advertisementService.getAllAdvertisementsByModelAndPrice(modelId, minPrice, maxPrice);
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndYear(int modelId, int minYear, int maxYear) {
		return advertisementService.getAllAdvertisementsByModelAndYear(modelId, minYear, maxYear);
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndCity(int modelId, int cityId) {
		return advertisementService.getAllAdvertisementsByModelAndCity(modelId, cityId);
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndUser(int modelId, int userId) {
		return advertisementService.getAllAdvertisementsByModelAndUser(modelId, userId);
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndPriceAndYear(int modelId, double minPrice,
			double maxPrice, int minYear, int maxYear) {
		return advertisementService.getAllAdvertisementsByModelAndPriceAndYear(modelId, minPrice, maxPrice, minYear,
				maxYear);
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndPriceAndCity(int modelId, double minPrice,
			double maxPrice, int cityId) {
		return advertisementService.getAllAdvertisementsByModelAndPriceAndCity(modelId, minPrice, maxPrice, cityId);
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndPriceAndYearAndCity(int modelId, double minPrice,
			double maxPrice, int minYear, int maxYear, int cityId) {
		return advertisementService.getAllAdvertisementsByModelAndPriceAndYearAndCity(modelId, minPrice, maxPrice,
				minYear, maxYear, cityId);
	}

	public List<AdvertisementView> getAllAdvertisementsByPriceAndYear(double minPrice, double maxPrice, int minYear,
			int maxYear) {
		return advertisementService.getAllAdvertisementsByPriceAndYear(minPrice, maxPrice, minYear, maxYear);
	}

	public List<AdvertisementView> getAllAdvertisementsByPriceAndCity(double minPrice, double maxPrice, int cityId) {
		return advertisementService.getAllAdvertisementsByPriceAndCity(minPrice, maxPrice, cityId);
	}

	public List<AdvertisementView> getAllAdvertisementsByPriceAndUser(double minPrice, double maxPrice, int userId) {
		return advertisementService.getAllAdvertisementsByPriceAndUser(minPrice, maxPrice, userId);
	}

	public List<AdvertisementView> getAllAdvertisementsByPriceAndYearAndCity(double minPrice, double maxPrice,
			int minYear, int maxYear, int cityId) {
		return advertisementService.getAllAdvertisementsByPriceAndYearAndCity(minPrice, maxPrice, minYear, maxYear,
				cityId);
	}

	public List<AdvertisementView> getAllAdvertisementsByYear(int minYear, int maxYear) {
		return advertisementService.getAllAdvertisementsByYear(minYear, maxYear);
	}

	public List<AdvertisementView> getAllAdvertisementsByYearAndCity(int minYear, int maxYear, int cityId) {
		return advertisementService.getAllAdvertisementsByYearAndCity(minYear, maxYear, cityId);
	}

	public List<AdvertisementView> getAllAdvertisementsByCity(int cityId) {
		return advertisementService.getAllAdvertisementsByCity(cityId);
	}

	
	
	



}
