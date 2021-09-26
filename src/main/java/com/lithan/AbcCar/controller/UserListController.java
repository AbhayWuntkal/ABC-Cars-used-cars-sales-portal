package com.lithan.AbcCar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lithan.AbcCar.entities.User;
import com.lithan.AbcCar.services.UserService;

@Controller
public class UserListController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/listusers")
	public String listuser(Model model){
		List<User> userlist = userService.listUser();
		model.addAttribute("userlist", userlist);
		return "listusers";
		
	}
}
