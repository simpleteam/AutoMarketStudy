package com.view;

import com.entity.Mark;

public class MarkView {

	private int id;
	private String mark;
	private TypeView type;

	public MarkView(Mark mark) {
		this.id = mark.getId();
		this.mark = mark.getMark();
		this.type = new TypeView(mark.getType());
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the mark
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * @param mark
	 *            the mark to set
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}

	/**
	 * @return the type
	 */
	public TypeView getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(TypeView type) {
		this.type = type;
	}

}
