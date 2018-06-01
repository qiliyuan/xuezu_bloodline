package com.qly.xuezu.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@CrossOrigin
@RequestMapping("/")
public class LoginController {

	/**
	 * login入口
	 * @return
	 */
	@RequestMapping("/log")
	public String login() {
		System.out.println(">>");
		return "/login";
	}
	
	/**
	 * 登陆跳转到主界面index
	 * @return
	 */
	@RequestMapping("/ind")
	public String index(HttpServletRequest req) {
		System.out.println("name_qq"+req.getParameter("name"));
		System.out.println("pasd"+req.getParameter("pasd"));
		return "/index";
	}
}
