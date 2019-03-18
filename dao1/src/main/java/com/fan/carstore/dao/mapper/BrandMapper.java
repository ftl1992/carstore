package com.fan.carstore.dao.mapper;

import com.fan.carstore.dao.po.BrandDto;

public interface BrandMapper {
	BrandDto selectByBrandnameBrand(String brand_name);
	BrandDto selectByEname(String en_name);
	BrandDto selectCountry(String country);
	BrandDto selectPinyin(String pinyin);
	BrandDto selectAnameBrand(String alias_name);
}
