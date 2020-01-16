package com.orilore.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.orilore.mapper.DeptMapper;
import com.orilore.model.Dept;

@Service
public class DeptService implements IDeptService{
	@Resource
	private DeptMapper mapper;
	
	@Override
	public List<Dept> find() {
		return mapper.select();
	}

	@Override
	public void save(Dept bean) {
		mapper.insert(bean);
	}

}
