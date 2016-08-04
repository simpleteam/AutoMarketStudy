package com.view;

import com.entity.Region;

public class RegionView {

	private int id;
	private String region;

	public RegionView() {
	}

	public RegionView(Region region) {
		this.id = region.getId();
		this.region = region.getRegion();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
