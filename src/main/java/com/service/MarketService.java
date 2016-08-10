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
		regionService.addRegion(region);
	}

	public RegionView getRegionById(int id) {
		return regionService.getRegionById(id);
	}

	public void updateRegion(RegionView region) {
		regionService.updateRegion(region);
	}

	public void deleteRegion(RegionView region) {
		regionService.deleteRegion(region);
	}
	
	public RegionView getRegionByName(String name) {
		return regionService.getRegionByName(name);
	}

	public void addCity(CityView city) {
		cityService.addCity(city);
	}

	public CityView getCityById(int id) {
		return cityService.getCityById(id);
	}

	public void updateCity(CityView city) {
		cityService.updateCity(city);
	}

	public void deleteCity(CityView city) {
		cityService.deleteCity(city);
	}

	public void addUser(UserView user) {
		userService.addUser(user);
	}

	public UserView getUserById(int id) {
		return userService.getUserById(id);
	}

	public void updateUser(UserView user) {
		userService.updateUser(user);
	}

	public void deleteUser(UserView user) {
		userService.deleteUser(user);
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
		photoService.addPhoto(photo);
	}

	public PhotoView getPhotoById(int id) {
		return photoService.getPhotoById(id);
	}

	public void updatePhoto(PhotoView photo) {
		photoService.updatePhoto(photo);
	}

	public void deletePhoto(PhotoView photo) {
		photoService.deletePhoto(photo);
	}

	public void addModel(ModelView model) {
		modelService.addModel(model);
	}

	public ModelView getModelById(int id) {
		return modelService.getModelById(id);
	}

	public void updateModel(ModelView model) {
		modelService.updateModel(model);
	}

	public void deleteModel(ModelView model) {
		modelService.deleteModel(model);
	}

	public void addMark(MarkView mark) {
		markService.addMark(mark);
	}

	public MarkView getMarkById(int id) {
		return markService.getMarkById(id);
	}

	public void updateMark(MarkView mark) {
		markService.updateMark(mark);
	}

	public void deleteMark(MarkView mark) {
		markService.deleteMark(mark);
	}

	public void addType(TypeView type) {
		typeService.addType(type);
	}

	public TypeView getTypeById(int id) {
		return typeService.getTypeById(id);
	}

	public void updateType(TypeView type) {
		typeService.updateType(type);
	}

	public void deleteType(TypeView type) {
		typeService.deleteType(type);
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
