package com.fan.carstore.service;

import com.fan.carstore.dao.po.BrandDto;
import com.fan.carstore.dao.po.ModelDto;
import com.fan.carstore.dao.po.SeriesDto;

public interface Service {
	public SeriesDto selectBySeriesname(String series_name) throws Exception;
	public SeriesDto selectByEname(String en_name) throws Exception;
	public SeriesDto selectAname(String alias_name) throws Exception;
	public 	ModelDto selectByModelname(String model_name)throws Exception;
	public ModelDto selectByYear(int year)throws Exception;
	public ModelDto selectByShortname(String short_name)throws Exception;
	public BrandDto selectByBrandname(String brand_name) throws Exception;
	public BrandDto selectByEnameBrand(String en_name) throws Exception ;
	public BrandDto selectCountry(String country) throws Exception ;
	public BrandDto selectPinyin(String pinyin) throws Exception ;
	public BrandDto selectAnameBrand(String alias_name) throws Exception ;
}
