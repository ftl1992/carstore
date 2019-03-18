package com.fan.carstore.dao.mapper;

import com.fan.carstore.dao.po.SeriesDto;

public interface SeriesMapper {
	SeriesDto selectBySeriesname(String series_name);
	SeriesDto selectByEname(String en_name);
	SeriesDto selectAname(String alias_name);
	
}
