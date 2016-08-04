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

	@Transactional
	public List<AdvertisementView> getAllByPrice(double min, double max){
		
		List<AdvertisementView> advertisements = new ArrayList<>();
		for(Advertisement advertisement : advertisementDao.getAllByPrice(min, max)){
			advertisements.add(new AdvertisementView(advertisement));
		}
		
		return advertisements;
	}
	
	
	@Transactional
	public List<AdvertisementView> getAllByPrice(int model, double min, double max){
		
		List<AdvertisementView> advertisements = new ArrayList<>();
		for(Advertisement advertisement : advertisementDao.getAllByModelAndPrice(model, min, max)){
			advertisements.add(new AdvertisementView(advertisement));
		}
		
		return advertisements;
	}
	
	
	
	@Transactional
	public List<AdvertisementView> getAllAdvertisementByModel(int modelId) {
		List<AdvertisementView> advertisements = new ArrayList<>();
		for(Advertisement advertisement : advertisementDao.getAllByModel(modelId)){
			advertisements.add(new AdvertisementView(advertisement));
		}
		return advertisements;
	}

	private Advertisement viewToEntity(AdvertisementView advertisement) {
		Advertisement entityAdvertisement = new Advertisement();
		entityAdvertisement.setId(advertisement.getId());
		entityAdvertisement.setPrice(advertisement.getPrice());
		entityAdvertisement.setDescription(advertisement.getDescription());
		entityAdvertisement.setModel(modelDao.get(advertisement.getModel().getId()));
		entityAdvertisement.setUser(userDao.get(advertisement.getUser().getId()));
		return entityAdvertisement;
	}
//
//	private AdvertisementView entityToView(Advertisement advertisement) {
//		AdvertisementView viewAdvertisement = new AdvertisementView();
//		viewAdvertisement.setId(advertisement.getId());
//		viewAdvertisement.setDescription(advertisement.getDescription());
//		viewAdvertisement.setPrice(advertisement.getPrice());
//		viewAdvertisement.setModel(new ModelView(advertisement.getModel()));
//		List<PhotoView> photos = new ArrayList<>();
//		for (Photo photo : advertisement.getPhotos()) {
//			photos.add(new PhotoView(photo));
//		}
//		viewAdvertisement.setPhotos(photos);
//		viewAdvertisement.setUser(new UserView(advertisement.getUser()));
//		return viewAdvertisement;
//	}

}
