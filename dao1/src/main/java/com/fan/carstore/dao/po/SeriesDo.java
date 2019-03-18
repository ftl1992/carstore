package com.fan.carstore.dao.po;

public class SeriesDo {
	private String series_code;
	private String series_name;
	private String brand_name;
	private String date_create;
	private String date_update;
	private String image_url;
	private String en_name;
	private String alias_name;
	private int is_hidden;
	private int is_import;
	private int display_tag;
	@Override
	public String toString() {
		return "Series [series_code=" + series_code + ", series_name=" + series_name + ", brand_name=" + brand_name
				+ ", date_create=" + date_create + ", date_update=" + date_update + ", image_url=" + image_url
				+ ", en_name=" + en_name + ", alias_name=" + alias_name + ", is_hidden=" + is_hidden + ", is_import="
				+ is_import + ", display_tag=" + display_tag + "]";
	}
	public String getSeries_code() {
		return series_code;
	}
	public void setSeries_code(String series_code) {
		this.series_code = series_code;
	}
	public String getSeries_name() {
		return series_name;
	}
	public void setSeries_name(String series_name) {
		this.series_name = series_name;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
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
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getEn_name() {
		return en_name;
	}
	public void setEn_name(String en_name) {
		this.en_name = en_name;
	}
	public String getAlias_name() {
		return alias_name;
	}
	public void setAlias_name(String alias_name) {
		this.alias_name = alias_name;
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
