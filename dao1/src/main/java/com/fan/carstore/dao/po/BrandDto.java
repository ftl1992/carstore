package com.fan.carstore.dao.po;

public class BrandDto {
	private String brand_name;
	private String en_name;
	private String country;
	private String pinyin;
	private String alias_name;
	@Override
	public String toString() {
		return "BrandDto [brand_name=" + brand_name + ", en_name=" + en_name + ", country=" + country + ", pinyin="
				+ pinyin + ", alias_name=" + alias_name + "]";
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getEn_name() {
		return en_name;
	}
	public void setEn_name(String en_name) {
		this.en_name = en_name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	
}
