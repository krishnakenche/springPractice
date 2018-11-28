package com.demo1.practice1.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo1.practice1.web.dto.ConsumerDto;
import com.demo1.practice1.web.entities.ConsumerList;
import com.demo1.practice1.web.service.DemoService;

@RestController
@RequestMapping(value = "/practice1/v1")
public class ConsumerReportController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerReportController.class);

	@Autowired
	private DemoService demo;

	@RequestMapping(value = "/mobile", method = RequestMethod.POST)
	public ResponseEntity<?> getData(@RequestBody ConsumerDto Consumerdto) {
		ConsumerList list = demo.getDataFromDao(Consumerdto.getMobileNo());
		return new ResponseEntity<ConsumerList>(list, HttpStatus.OK);

	}

}
