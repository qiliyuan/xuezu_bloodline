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
	@RequestMapping("/")
	public String login() {
		System.out.println("进入login登陆界面");
		return "/login";
	}
	
	/**
	 * 登陆跳转到主界面index
	 * @return
	 */
	@RequestMapping("/ind")
	public String index(HttpServletRequest req) {
		System.out.println("name_qq："+req.getParameter("name"));
		System.out.println("pasd："+req.getParameter("pasd"));
		return "/index";
	}
	
	/**
	 * 
	* @Function: LoginController.java
	* @Description: 该函数的功能描述：数据库连接测试
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiliyuan
	* @date: 2018年10月24日 下午2:28:36
	 */
	public  String test(){
		return null;
	}
}
