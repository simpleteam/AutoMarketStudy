package com.util;

import org.springframework.beans.factory.annotation.Autowired;

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
import com.entity.Mark;
import com.entity.Model;
import com.entity.Photo;
import com.entity.Region;
import com.entity.Type;
import com.entity.User;
import com.view.AdvertisementView;
import com.view.CityView;
import com.view.MarkView;
import com.view.ModelView;
import com.view.PhotoView;
import com.view.RegionView;
import com.view.TypeView;
import com.view.UserView;



public class Transformer {

	@Autowired
	private UserDao userDao;
	@Autowired
	private TypeDao typeDao;
	@Autowired
	private RegionDao regionDao;
	@Autowired
	private PhotoDao photoDao;
	@Autowired
	private ModelDao modelDao;
	@Autowired
	private MarkDao markDao;
	@Autowired
	private CityDao cityDao;
	@Autowired
	private AdvertisementDao advertisementDao;
	
	public User viewToEntity(UserView user){
		User entityUser = new User();
		entityUser.setId(user.getId());
		entityUser.setName(user.getName());
		entityUser.setPassword(user.getPassword());
		entityUser.setPhone(user.getPhone());
		entityUser.setCity(cityDao.get(user.getCity().getId()));
		return entityUser;
	}
	
	public Type viewToEntity(TypeView type){
		Type entityType = new Type();
		entityType.setId(type.getId());
		entityType.setType(type.getType());
		return entityType;
	}
	
	public Region viewToEntity(RegionView region) {
		Region entityRegion = new Region();
		entityRegion.setId(region.getId());
		entityRegion.setRegion(region.getRegion());
		return entityRegion;
	}
	
	public Photo viewToEntity(PhotoView photo){
		Photo entityPhoto = new Photo();
		entityPhoto.setId(photo.getId());
		entityPhoto.setPhoto(photo.getPhoto());
		entityPhoto.setAdvertisement(advertisementDao.get(photo.getAdvertisement().getId()));
		return entityPhoto;
	}
	
	public Model viewToEntity(ModelView model) {
		Model entityModel = new Model();
		entityModel.setId(model.getId());
		entityModel.setModel(model.getModel());
		entityModel.setMark(markDao.get(model.getMark().getId()));
		return entityModel;
	}
	
	public Mark viewToEntity(MarkView mark){
		Mark entityMark = new Mark();
		entityMark.setId(mark.getId());
		entityMark.setMark(mark.getMark());
		entityMark.setType(typeDao.get(mark.getType().getId()));
		return entityMark;
	}
	
	public City viewToEntity(CityView city) {
		City entityCity = new City();
		entityCity.setId(city.getId());
		entityCity.setCity(city.getCity());
		entityCity.setRegion(regionDao.get(city.getRegion().getId()));
		return entityCity;
	}
	
	public Advertisement viewToEntity(AdvertisementView advertisement){
		Advertisement entityAdvertisement = new Advertisement();
		entityAdvertisement.setId(advertisement.getId());
		entityAdvertisement.setPrice(advertisement.getPrice());
		entityAdvertisement.setDescription(advertisement.getDescription());
		entityAdvertisement.setModel(modelDao.get(advertisement.getModel().getId()));
		entityAdvertisement.setUser(userDao.get(advertisement.getUser().getId()));
		return entityAdvertisement;
	}
	
	
}
