package com.cjc.ProxyService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cjc.model.Tutor;

@FeignClient("tutor-service")
public interface TutorProxy {
	@PostMapping("/tutor-service/addtutor")
public String addTutor(Tutor tutor);
	
	
	@GetMapping("/tutor-service/getTutor")
	public List<Tutor> getallTutor();
}
