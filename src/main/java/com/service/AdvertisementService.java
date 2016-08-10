package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AdvertisementDao;
import com.dao.ModelDao;
import com.dao.UserDao;
import com.entity.Advertisement;
import com.view.AdvertisementView;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AdvertisementService {

	@Autowired
	private AdvertisementDao advertisementDao;

	@Autowired
	private ModelDao modelDao;

	@Autowired
	private UserDao userDao;

	public void addAdvertisement(AdvertisementView advertisement) {
		advertisementDao.add(viewToEntity(advertisement));
	}

	public AdvertisementView getAdvertisementById(int id) {
		return new AdvertisementView(advertisementDao.get(id));
	}

	public void updateAdvertisement(AdvertisementView advertisement) {
		advertisementDao.update(viewToEntity(advertisement));
	}

	public void deleteAdvertisement(AdvertisementView advertisement) {
		advertisementDao.delete(viewToEntity(advertisement));
	}

	public List<AdvertisementView> getAllAdvertisementsByPrice(double minPrice, double maxPrice) {
		return listOfEntityToListOfView(advertisementDao.getAllByPrice(minPrice, maxPrice));
	}

	public List<AdvertisementView> getAllAdvertisementsByModel(int modelId) {
		return listOfEntityToListOfView(advertisementDao.getAllByModel(modelId));
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndPrice(int modelId, double minPrice, double maxPrice) {
		return listOfEntityToListOfView(advertisementDao.getAllByModelAndPrice(modelId, minPrice, maxPrice));
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndYear(int modelId, int minYear, int maxYear) {
		return listOfEntityToListOfView(advertisementDao.getAllByModelAndYear(modelId, minYear, maxYear));
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndCity(int modelId, int cityId) {
		return listOfEntityToListOfView(advertisementDao.getAllByModelAndCity(modelId, cityId));
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndUser(int modelId, int userId) {
		return listOfEntityToListOfView(advertisementDao.getAllByModelAndUser(modelId, userId));
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndPriceAndYear(int modelId, double minPrice, double maxPrice,
			int minYear, int maxYear) {
		return listOfEntityToListOfView(
				advertisementDao.getAllbyModelAndPriceAndYear(modelId, minPrice, maxPrice, minYear, maxYear));
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndPriceAndCity(int modelId, double minPrice, double maxPrice,
			int cityId) {
		return listOfEntityToListOfView(
				advertisementDao.getAllbyModelAndPriceAndCity(modelId, minPrice, maxPrice, cityId));
	}

	public List<AdvertisementView> getAllAdvertisementsByModelAndPriceAndYearAndCity(int modelId, double minPrice, double maxPrice,
			int minYear, int maxYear, int cityId) {
		return listOfEntityToListOfView(advertisementDao.getAllbyModelAndPriceAndYearAndCity(modelId, minPrice,
				maxPrice, minYear, maxYear, cityId));
	}

	public List<AdvertisementView> getAllAdvertisementsByPriceAndYear(double minPrice, double maxPrice, int minYear, int maxYear) {
		return listOfEntityToListOfView(advertisementDao.getAllByPriceAndYear(minPrice, maxPrice, minYear, maxYear));
	}

	public List<AdvertisementView> getAllAdvertisementsByPriceAndCity(double minPrice, double maxPrice, int cityId) {
		return listOfEntityToListOfView(advertisementDao.getAllByPriceAndCity(minPrice, maxPrice, cityId));
	}

	public List<AdvertisementView> getAllAdvertisementsByPriceAndUser(double minPrice, double maxPrice, int userId) {
		return listOfEntityToListOfView(advertisementDao.getAllByPriceAndUser(minPrice, maxPrice, userId));
	}

	public List<AdvertisementView> getAllAdvertisementsByPriceAndYearAndCity(double minPrice, double maxPrice, int minYear,
			int maxYear, int cityId) {
		
		System.out.println("__________________________________________________________________________________");
		
		return listOfEntityToListOfView(
				advertisementDao.getAllbyPriceAndYearAndCity(minPrice, maxPrice, minYear, maxYear, cityId));
	}

	public List<AdvertisementView> getAllAdvertisementsByYear(int minYear, int maxYear) {
		return listOfEntityToListOfView(advertisementDao.getAllByYear(minYear, maxYear));
	}

	public List<AdvertisementView> getAllAdvertisementsByYearAndCity(int minYear, int maxYear, int cityId) {
		return listOfEntityToListOfView(advertisementDao.getAllByYearAndCity(minYear, maxYear, cityId));
	}

	public List<AdvertisementView> getAllAdvertisementsByCity(int cityId) {
		return listOfEntityToListOfView(advertisementDao.getAllByCity(cityId));
	}

	public List<AdvertisementView> getAllAdvertisementsByUser(int userId) {
		return listOfEntityToListOfView(advertisementDao.getAllByUser(userId));
	}

	private List<AdvertisementView> listOfEntityToListOfView(List<Advertisement> entities) {
		List<AdvertisementView> advertisements = new ArrayList<>();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++==");
		
		for (Advertisement advertisement : entities) {
			System.out.println(advertisement.getDescription() + "==============================");
			advertisements.add(new AdvertisementView(advertisement));
		}
		return advertisements;
	}

	private Advertisement viewToEntity(AdvertisementView advertisement) {
		Advertisement entityAdvertisement = new Advertisement();
		entityAdvertisement.setId(advertisement.getId());
		entityAdvertisement.setYear(advertisement.getYear());
		entityAdvertisement.setPrice(advertisement.getPrice());
		entityAdvertisement.setDescription(advertisement.getDescription());
		entityAdvertisement.setModel(modelDao.get(advertisement.getModel().getId()));
		entityAdvertisement.setUser(userDao.get(advertisement.getUser().getId()));
		return entityAdvertisement;
	}

}
