package com.demo1.practice1.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo1.practice1.web.entities.ConsumerList;

public interface DemoRepository extends JpaRepository<ConsumerList, String>{

	public ConsumerList findByMobilenumber(String mobileNo);
}
