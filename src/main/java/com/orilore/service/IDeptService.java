package com.orilore.service;

import java.util.List;

import com.orilore.model.Dept;

public interface IDeptService {
	public List<Dept> find();
	public void save(Dept bean);
}
