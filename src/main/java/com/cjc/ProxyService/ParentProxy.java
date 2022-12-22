package com.cjc.ProxyService;

import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cjc.model.Parent;



@FeignClient("parent-service")
public interface ParentProxy {
	@GetMapping("/getParent")
	public List<Parent> getParent();

}
