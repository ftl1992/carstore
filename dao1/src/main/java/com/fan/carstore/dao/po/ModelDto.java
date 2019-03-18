package com.fan.carstore.dao.po;

public class ModelDto {
	private String model_name;
	private int year;
	private String short_name;
	private String lead_pic;
	private int sell_status;
	private int import_type;
	private int is_hidden;
	private int display_tag;
	
	public String getLead_pic() {
		return lead_pic;
	}
	public void setLead_pic(String lead_pic) {
		this.lead_pic = lead_pic;
	}
	public int getSell_status() {
		return sell_status;
	}
	public void setSell_status(int sell_status) {
		this.sell_status = sell_status;
	}
	public int getImport_type() {
		return import_type;
	}
	public void setImport_type(int import_type) {
		this.import_type = import_type;
	}
	public int getIs_hidden() {
		return is_hidden;
	}
	public void setIs_hidden(int is_hidden) {
		this.is_hidden = is_hidden;
	}
	public int getDisplay_tag() {
		return display_tag;
	}
	public void setDisplay_tag(int display_tag) {
		this.display_tag = display_tag;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getShort_name() {
		return short_name;
	}
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	@Override
	public String toString() {
		return "ModelDto [model_name=" + model_name + ", year=" + year + ", short_name=" + short_name + ", lead_pic="
				+ lead_pic + ", sell_status=" + sell_status + ", import_type=" + import_type + ", is_hidden="
				+ is_hidden + ", display_tag=" + display_tag + "]";
	}

}
