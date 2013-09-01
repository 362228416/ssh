package com.ydpp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.ydpp.repository.BlogRepository;

@Controller
@Scope("prototype")
public class TestAction extends ActionSupport {

	@Autowired
	BlogRepository blogRepository;
	
	@Override
	public String execute() throws Exception {
		System.out.println(blogRepository.count());
		return super.execute();
	}
	
}
