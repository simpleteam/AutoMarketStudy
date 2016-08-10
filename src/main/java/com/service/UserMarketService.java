package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.view.AdvertisementView;
import com.view.SearchView;

@Service
@Transactional
public class UserMarketService {

	@Autowired
	private AdvertisementService advertisementService;

	public List<AdvertisementView> getAdvertisements(SearchView search) {

		boolean isModel = search.getModelId() != 0;
		boolean isCity = search.getCityId() != 0;
		int modelId = search.getModelId();
		int cityId = search.getCityId();
		double minPrice = search.getMinPrice() != 0 ? search.getMinPrice() : 0;
		double maxPrice = search.getMaxPrice() != 0 ? search.getMaxPrice() : Double.MAX_VALUE;
		int minYear = search.getMinYear() != 0 ? search.getMinYear() : 0;
		int maxYear = search.getMaxYear() != 0 ? search.getMaxYear() : Integer.MAX_VALUE;

		if (isModel & isCity) {
			return advertisementService.getAllAdvertisementsByModelAndPriceAndYearAndCity(modelId, minPrice, maxPrice,
					minYear, maxYear, cityId);
		}

		if (isModel) {
			return advertisementService.getAllAdvertisementsByModelAndPriceAndYear(modelId, minPrice, maxPrice, minYear,
					maxYear);
		}

		if (isCity) {			
			return advertisementService.getAllAdvertisementsByPriceAndYearAndCity(minPrice, maxPrice, minYear, maxYear,
					cityId);
		}

		return advertisementService.getAllAdvertisementsByPriceAndYear(0, 100000, 2001, 2010);

	}

}
