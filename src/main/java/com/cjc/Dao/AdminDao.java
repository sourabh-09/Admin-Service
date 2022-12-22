package com.cjc.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Ebooks;

public interface AdminDao extends JpaRepository<Ebooks, Integer>{

}
