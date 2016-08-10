package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdvertisementDao;
import com.dao.CityDao;
import com.dao.MarkDao;
import com.dao.ModelDao;
import com.dao.PhotoDao;
import com.dao.RegionDao;
import com.dao.TypeDao;
import com.dao.UserDao;
import com.entity.Advertisement;
import com.entity.City;
import com.entity.Region;
import com.entity.Type;
import com.view.AdvertisementView;
import com.view.CityView;
import com.view.MarkView;
import com.view.ModelView;
import com.view.PhotoView;
import com.view.RegionView;
import com.view.SearchView;
import com.view.TypeView;
import com.view.UserView;



@Service
public class MarketService {

	@Autowired
	private TypeDao typeDao;

	@Autowired
	private MarkDao markDao;

	@Autowired
	private ModelDao modelDao;

	@Autowired
	private AdvertisementDao advertDao;

	@Autowired
	private PhotoDao photoDao;

	@Autowired
	private UserDao userDao;

	@Autowired
	private CityDao cityDao;

	@Autowired
	private RegionDao regionDao;

	@Autowired
	private RegionService regionService;
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AdvertisementService advertisementService;
	
	@Autowired
	private PhotoService photoService;
	
	@Autowired
	private ModelService modelService;
	
	@Autowired
	private MarkService markService;
	
	@Autowired
	private TypeService typeService;
	
	
	
	public void addRegion(RegionView region) {
		regionService.add(region);
	}

	public RegionView getRegionById(int id) {
		return regionService.get(id);
	}

	public void updateRegion(RegionView region) {
		regionService.update(region);
	}

	public void deleteRegion(RegionView region) {
		regionService.delete(region);
	}
	
	public RegionView getRegionByName(String name) {
		return regionService.getByName(name);
	}

	public void addCity(CityView city) {
		cityService.add(city);
	}

	public CityView getCityById(int id) {
		return cityService.get(id);
	}

	public void updateCity(CityView city) {
		cityService.update(city);
	}

	public void deleteCity(CityView city) {
		cityService.delete(city);
	}

	public void addUser(UserView user) {
		userService.add(user);
	}

	public UserView getUserById(int id) {
		return userService.get(id);
	}

	public void updateUser(UserView user) {
		userService.update(user);
	}

	public void deleteUser(UserView user) {
		userService.delete(user);
	}

	public void addAdvertisement(AdvertisementView advertisement) {
		advertisementService.add(advertisement);
	}

	public AdvertisementView getAdvertisementById(int id) {
		return advertisementService.getById(id);
	}

	public void updateAdvertisement(AdvertisementView advertisement) {
		advertisementService.update(advertisement);
	}

	public void deleteAdvertisement(AdvertisementView advertisement) {
		advertisementService.delete(advertisement);
	}

	public void addPhoto(PhotoView photo) {
		photoService.add(photo);
	}

	public PhotoView getPhotoById(int id) {
		return photoService.get(id);
	}

	public void updatePhoto(PhotoView photo) {
		photoService.update(photo);
	}

	public void deletePhoto(PhotoView photo) {
		photoService.delete(photo);
	}

	public void addModel(ModelView model) {
		modelService.add(model);
	}

	public ModelView getModelById(int id) {
		return modelService.get(id);
	}

	public void updateModel(ModelView model) {
		modelService.update(model);
	}

	public void deleteModel(ModelView model) {
		modelService.delete(model);
	}

	public void addMark(MarkView mark) {
		markService.add(mark);
	}

	public MarkView getMarkById(int id) {
		return markService.get(id);
	}

	public void updateMark(MarkView mark) {
		markService.update(mark);
	}

	public void deleteMark(MarkView mark) {
		markService.delete(mark);
	}

	public void addType(TypeView type) {
		typeService.add(type);
	}

	public TypeView getTypeById(int id) {
		return typeService.get(id);
	}

	public void updateType(TypeView type) {
		typeService.update(type);
	}

	public void deleteType(TypeView type) {
		typeService.delete(type);
	}

	public void addType(String nameOfType) {
		Type type = new Type();
		type.setType(nameOfType);
		typeDao.add(type);
	}

	public void deleteType(String nameOfType) {
		Type type = typeDao.getTypeByName(nameOfType);
		typeDao.delete(type);
	}

	public Type getType(int id) {
		return typeDao.get(id);
	}

	public void updateType(Type type) {
		typeDao.update(type);
	}

	public List<RegionView> getAllRegions() {
		List<RegionView> regions = new ArrayList<>();
		List<Region> entityRegions = regionDao.getAll();
		for (Region region : entityRegions) {
			regions.add(new RegionView(region));
		}
		return regions;
	}

	public List<CityView> getCitiesByRegion(int regionId) {
		List<CityView> cities = new ArrayList<>();
		Region region = regionDao.get(regionId);
		List<City> entityCities = cityDao.getAllByRegion(region);
		for (City city : entityCities) {
			cities.add(new CityView(city));
		}
		return cities;
	}

	public List<AdvertisementView> getAllAdvertisement() {
		List<AdvertisementView> advertisements = new ArrayList<>();
		List<Advertisement> entityAdvertisements = advertDao.getAll();
		for (Advertisement advertisement : entityAdvertisements) {
			advertisements.add(new AdvertisementView(advertisement));
		}
		return advertisements;
	}
	
	public List<AdvertisementView> searchAdvertisements(SearchView search){
		
		return null;
	}
	

}
