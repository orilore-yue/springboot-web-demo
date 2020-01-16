package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.model.Dept;
import com.orilore.service.IDeptService;

@RestController
@RequestMapping("/dept/")
public class DeptCtrl {
	@Resource
	private IDeptService service;
	
	@RequestMapping("list")
	public List<Dept> query(){
		return service.find();
	}
	
	@RequestMapping("save")
	public boolean save(Dept bean) {
		try {
			service.save(bean);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
}
