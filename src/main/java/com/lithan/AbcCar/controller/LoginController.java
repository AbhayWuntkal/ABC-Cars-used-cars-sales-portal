package com.lithan.AbcCar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lithan.AbcCar.dao.UserRepository;
import com.lithan.AbcCar.entities.User;
import com.lithan.AbcCar.services.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userService;

	@Autowired
	UserRepository userReposito;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String onLogin() {
		return "login";
	}

	@RequestMapping(value = "/dash")
	public String loginSuccess(Model mod) {
		String userName = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userReposito.findByUserName(userName);
		mod.addAttribute("login_success", user);
		return "dash";
	}

	@RequestMapping(value = "/login_error")
	public String onLoginError(Model model) {
		String error_msg = "Incorrect user or password. Please re-enter.";
		model.addAttribute("error_string", error_msg);
		return "login";
	}

}
