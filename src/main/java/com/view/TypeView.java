package com.view;

import com.entity.Type;

public class TypeView {

	private int id;
	private String type;

	public TypeView(Type type) {
		this.id = type.getId();
		this.type = type.getType();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
