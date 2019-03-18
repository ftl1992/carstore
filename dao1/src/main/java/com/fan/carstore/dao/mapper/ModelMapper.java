package com.fan.carstore.dao.mapper;

import com.fan.carstore.dao.po.ModelDto;

public interface ModelMapper {
	ModelDto selectByModelname(String model_name);
	ModelDto selectByYear(int year);
	ModelDto selectByShortname(String short_name);
	
	
	
}
