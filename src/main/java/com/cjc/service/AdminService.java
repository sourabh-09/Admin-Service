package com.cjc.service;

import java.util.List;

import com.cjc.model.Ebooks;
import com.cjc.model.Parent;
import com.cjc.model.Tutor;

public interface AdminService {
public String addEbook(Ebooks book);
public String addTutor(Tutor tutor);
public List<Tutor> getAllTutor();
public List<Parent> getAllParent();
}
