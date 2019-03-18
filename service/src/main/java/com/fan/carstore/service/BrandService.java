package com.fan.carstore.service;

import com.fan.carstore.dao.po.BrandDto;

public interface BrandService {
	public BrandDto selectByBrandname(String brand_name) throws Exception;
	public BrandDto selectByEname(String en_name) throws Exception ;
	public BrandDto selectCountry(String country) throws Exception ;
	public BrandDto selectPinyin(String pinyin) throws Exception ;
	public BrandDto selectAname(String alias_name) throws Exception ;
}
