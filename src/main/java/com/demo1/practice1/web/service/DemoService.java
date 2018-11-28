package com.demo1.practice1.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo1.practice1.web.dao.DemoDao1;
import com.demo1.practice1.web.entities.ConsumerList;

@Service
public class DemoService {

	@Autowired
	private DemoDao1 demo;
	
	public ConsumerList getDataFromDao(String MobileNo) {
		return demo.getDataFromDb(MobileNo);
		
	}
}
