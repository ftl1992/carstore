package com.fan.carstore.dao.po;

public class ModelDo {
	private String model_code;
	private String model_name;
	private String series_name;
	private String date_create;
	private String date_update;
	private int year;
	private String short_name;
	private String lead_pic;
	private int sell_status;
	private int import_type;
	private int is_hidden;
	private int is_import;
	private int display_tag;
	@Override
	public String toString() {
		return "model [model_code=" + model_code + ", model_name=" + model_name + ", series_name=" + series_name
				+ ", date_create=" + date_create + ", date_update=" + date_update + ", year=" + year + ", short_name="
				+ short_name + ", lead_pic=" + lead_pic + ", sell_status=" + sell_status + ", import_type="
				+ import_type + ", is_hidden=" + is_hidden + ", is_import=" + is_import + ", display_tag=" + display_tag
				+ "]";
	}
	public String getModel_code() {
		return model_code;
	}
	public void setModel_code(String model_code) {
		this.model_code = model_code;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getSeries_name() {
		return series_name;
	}
	public void setSeries_name(String series_name) {
		this.series_name = series_name;
	}
	public String getDate_create() {
		return date_create;
	}
	public void setDate_create(String date_create) {
		this.date_create = date_create;
	}
	public String getDate_update() {
		return date_update;
	}
	public void setDate_update(String date_update) {
		this.date_update = date_update;
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
	public int getIs_import() {
		return is_import;
	}
	public void setIs_import(int is_import) {
		this.is_import = is_import;
	}
	public int getDisplay_tag() {
		return display_tag;
	}
	public void setDisplay_tag(int display_tag) {
		this.display_tag = display_tag;
	}
}
