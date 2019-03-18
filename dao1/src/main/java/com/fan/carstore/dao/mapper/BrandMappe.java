package com.fan.carstore.dao.mapper;

import com.fan.carstore.dao.po.BrandDto;

public interface BrandMappe {
	BrandDto selectByBrandname(String brand_name);
	BrandDto selectByEname(String en_name);
	BrandDto selectCountry(String country);
	BrandDto selectPinyin(String pinyin);
	BrandDto selectAname(String alias_name);
}
