package com.view;

import com.entity.Photo;

public class PhotoView {

	private int id;
	private byte[] photo;
	private AdvertisementView advertisement;

	public PhotoView(Photo photo) {
		this.id = photo.getId();
		this.photo = photo.getPhoto();
		this.advertisement = new AdvertisementView(photo.getAdvertisement());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public AdvertisementView getAdvertisement() {
		return advertisement;
	}

	public void setAdvertisement(AdvertisementView advertisement) {
		this.advertisement = advertisement;
	}

}
