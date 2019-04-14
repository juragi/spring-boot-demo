package com.juragi.mapper;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
	
	public String getCurrent();
	public List<HashMap<String, Object>> getBoardList();
}
