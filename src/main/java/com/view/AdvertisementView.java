package com.view;

import java.util.List;

import com.entity.Advertisement;
import com.entity.Photo;



public class AdvertisementView {

	private int id;
	private ModelView model;
	private List<PhotoView> photos;
	private double price;
	private String description;
	private UserView user;

	public AdvertisementView() {
	}

	public AdvertisementView(Advertisement advertisement) {
		this.id = advertisement.getId();
		this.model = new ModelView(advertisement.getModel());
		for (Photo photo : advertisement.getPhotos()) {
			photos.add(new PhotoView(photo));
		}
		this.price = advertisement.getPrice();
		this.description = advertisement.getDescription();
		this.user = new UserView(advertisement.getUser());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ModelView getModel() {
		return model;
	}

	public void setModel(ModelView model) {
		this.model = model;
	}

	public List<PhotoView> getPhotos() {
		return photos;
	}

	public void setPhotos(List<PhotoView> photos) {
		this.photos = photos;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserView getUser() {
		return user;
	}

	public void setUser(UserView user) {
		this.user = user;
	}

}
