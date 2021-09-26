package com.lithan.AbcCar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lithan.AbcCar.dao.UserRepository;
import com.lithan.AbcCar.entities.User;
import com.lithan.AbcCar.services.UserService;

@Controller
public class UpdateController {

	@Autowired
	UserService userService;

	@Autowired
	UserRepository userReposito;

	@RequestMapping(value = "/editprofile")
	public String dash(Model model) {
		String userName = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userReposito.findByUserName(userName);
		model.addAttribute("User", user);
		return "update";
	}

	@PostMapping("/saveprofile")
	public String edit(@ModelAttribute("User") User user) {
		userService.addUser(user);
		return "viewprofile";
	}

	@RequestMapping(value = "/editadmin")
	public String dashadmin(Model model) {
		String userName = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userReposito.findByUserName(userName);
		model.addAttribute("User", user);
		return "updateadmin";
	}

	@PostMapping("/saveadmin")
	public String editAdmin(@ModelAttribute("User") User user) {
		userService.addAdmin(user);
		return "adminprofile";
	}
}
