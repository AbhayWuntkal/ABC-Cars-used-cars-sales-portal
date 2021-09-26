package com.lithan.AbcCar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lithan.AbcCar.dao.UserRepository;
import com.lithan.AbcCar.entities.User;

@Controller
public class ViewController {

	@Autowired
	UserRepository userReposito;

	@RequestMapping(value ="/viewprofile")
	public String dash(Model model) {
		String userName = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userReposito.findByUserName(userName);
		model.addAttribute("User", user);
		return "viewprofile";

	}
	
	@RequestMapping(value ="/adminprofile")
	public String admindash(Model model) {
		String userName = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userReposito.findByUserName(userName);
		model.addAttribute("User", user);
		return "adminprofile";

	}

}
