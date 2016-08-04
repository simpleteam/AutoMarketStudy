package com.view;

import com.entity.Model;

public class ModelView {

	private int id;
	private String model;
	private MarkView mark;

	public ModelView(Model model) {
		this.id = model.getId();
		this.model = model.getModel();
		this.mark = new MarkView(model.getMark());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public MarkView getMark() {
		return mark;
	}

	public void setMark(MarkView mark) {
		this.mark = mark;
	}

}
