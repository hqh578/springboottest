package com.mk.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mk.bean.User;
import com.mk.dao.IUserMapper;
import com.mk.service.IUserService;

@Controller
public class IndexController {

	@Autowired
	private IUserService userService;
	
	

	@RequestMapping("/index")
	public String index(Model model){
		List<User> users = userService.findUsers();
		model.addAttribute("users",users);
		return "index";
	}
	
	@RequestMapping("/index.html")
	public String index2(){
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/index.json")
	public String indexjson(){
		return "你好";
	}
}
