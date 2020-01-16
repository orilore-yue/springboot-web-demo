package com.orilore.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.orilore.model.Dept;

@Mapper
public interface DeptMapper {
	public List<Dept> select();
	public void insert(Dept bean);
}
