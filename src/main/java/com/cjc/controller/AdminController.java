package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Ebooks;
import com.cjc.service.AdminService;

@RestController
@RequestMapping("/Admin-service")
public class AdminController {
	@Autowired
	private AdminService service;
	@PostMapping("/addEbook")
    public String addEbook(Ebooks book) {
	return service.addEbook(book);
     }
	
	
	
	
	
	
	
	
	
}
