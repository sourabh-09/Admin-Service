package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cjc.Dao.AdminDao;
import com.cjc.ProxyService.ParentProxy;
import com.cjc.ProxyService.TutorProxy;
import com.cjc.model.Ebooks;
import com.cjc.model.Parent;
import com.cjc.model.Tutor;

public class AdminServicImpl implements AdminService {
	@Autowired
   private AdminDao dao;
	@Autowired
	private ParentProxy pproxy;
	@Autowired
	private TutorProxy tproxy;
	
	@Override
	public String addEbook(Ebooks book) {
		dao.save(book);
		return "Ebook added";
	}
	@Override
	public String addTutor(Tutor tutor) {
		tproxy.addTutor(tutor);
		return "tutor added";
	}
	@Override
	public List<Tutor> getAllTutor() {
		
		return tproxy.getallTutor();
	}
	@Override
	public List<Parent> getAllParent() {
		
		return pproxy.getParent();
	}
	
	

}
