package com.demo1.practice1.web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo1.practice1.web.entities.ConsumerList;
import com.demo1.practice1.web.repository.DemoRepository;

@Repository
public class DemoDao1 {
	@Autowired
	private DemoRepository demo;
	public ConsumerList getDataFromDb(String MobileNo) {
		return demo.findByMobilenumber(MobileNo);
		
	}
}


