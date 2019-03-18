package com.fan.carstore.dao.po;

public class BrandDo {
	
	private String brand_code;
	private String brand_name;
	private String date_create;
	private String date_update;
	private String logo_url;
	private String country;
	private String en_name;
	private String pinyin;
	private String alias_name;
	private int is_hidden;
	
	@Override
	public String toString() {
		return "Brand [brand_code=" + brand_code + ", brand_name=" + brand_name + ", date_create=" + date_create
				+ ", date_update=" + date_update + ", logo_url=" + logo_url + ", country=" + country + ", en_name="
				+ en_name + ", pinyin=" + pinyin + ", alias_name=" + alias_name + ", is_hidden=" + is_hidden + ", hot="
				+ hot + ", display_tag=" + display_tag + "]";
	}
	private int hot;
	private int display_tag;


	public String getBrand_code() {
		return brand_code;
	}
	public void setBrand_code(String brand_code) {
		this.brand_code = brand_code;
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
	public String getLogo_url() {
		return logo_url;
	}
	public void setLogo_url(String logo_url) {
		this.logo_url = logo_url;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEn_name() {
		return en_name;
	}
	public void setEn_name(String en_name) {
		this.en_name = en_name;
	}
	public String getPinyin() {
		return pinyin;
	}
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
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
	public int getHot() {
		return hot;
	}
	public void setHot(int hot) {
		this.hot = hot;
	}
	public int getDisplay_tag() {
		return display_tag;
	}
	public void setDisplay_tag(int display_tag) {
		this.display_tag = display_tag;
	}
}
