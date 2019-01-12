package com.eloan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * 网站首页
 * 
 * @author Administrator
 * 
 */
@Controller
public class IndexController {



	@RequestMapping("index")
	public String index() {


		return "/web/views/main.html";
	}


}
