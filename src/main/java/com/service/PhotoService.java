package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdvertisementDao;
import com.dao.PhotoDao;
import com.entity.Photo;
import com.view.PhotoView;



@Service
public class PhotoService {

	@Autowired
	private PhotoDao photoDao;
	
	@Autowired
	private AdvertisementDao advertisementDao;
	
	public void addPhoto(PhotoView photo){
		photoDao.add(viewToEntity(photo));
	}
	
	public PhotoView getPhoto(int id){
		return new PhotoView(photoDao.get(id));
	}
	
	public void updatePhoto(PhotoView photo){
		photoDao.update(viewToEntity(photo));
	}
	
	public void deletePhoto(PhotoView photo){
		photoDao.delete(viewToEntity(photo));
	}
	
	private Photo viewToEntity(PhotoView photo){
		Photo entityPhoto = new Photo();
		entityPhoto.setId(photo.getId());
		entityPhoto.setPhoto(photo.getPhoto());
		entityPhoto.setAdvertisement(advertisementDao.get(photo.getAdvertisement().getId()));
		return entityPhoto;
	}
	
}
