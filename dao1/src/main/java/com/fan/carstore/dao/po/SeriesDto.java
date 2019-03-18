package com.fan.carstore.dao.po;

public class SeriesDto {
	private String series_name;
	private String alias_name;
	private String en_name;
	private String image_url;
	private int is_import;
	private int is_hidden;
	private int display_tag;
	
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public int getIs_import() {
		return is_import;
	}
	public void setIs_import(int is_import) {
		this.is_import = is_import;
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
	public String getSeries_name() {
		return series_name;
	}
	public void setSeries_name(String series_name) {
		this.series_name = series_name;
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


}
