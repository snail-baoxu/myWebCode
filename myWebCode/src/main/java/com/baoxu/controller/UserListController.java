package com.baoxu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baoxu.model.User;
@Controller
@RequestMapping("/user")
public class UserListController {
	@RequestMapping("/userList.do")
	public ModelAndView userList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<User> userList = new ArrayList<User>();
		
		User user1 = new  User();
		user1.setUserName("张三");
		user1.setAge(18);
		user1.setSex(1);
		User user2 = new  User();
		user2.setUserName("李四");
		user2.setAge(19);
		user2.setSex(2);
		userList.add(user1);
		userList.add(user2);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userList", userList);
		modelAndView.setViewName("userList");
		
		return modelAndView;
	}
}
