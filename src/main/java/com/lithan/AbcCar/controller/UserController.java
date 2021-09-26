package com.lithan.AbcCar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.lithan.AbcCar.dao.UserRepository;
import com.lithan.AbcCar.entities.Car;
import com.lithan.AbcCar.entities.User;
import com.lithan.AbcCar.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userReposito;

	@GetMapping("/register")
	public String register(Model model, User user) {
		model.addAttribute("user", user);
		return "register";
	}

	@PostMapping("/save")
	public String saveUser(Model model, User user) {
		userService.saveUser(user);
		model.addAttribute("user", user);
		String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        user = userReposito.findByUserName(userName);
		return "ThankYou";
	}

	@GetMapping("/postcar")
	public String postcar(Model model, Car car) {
		model.addAttribute("car", car);
		return "postcar";
	}

	@PostMapping("/savecar")
	public String saveCar(Model model, Car car) {
		userService.saveCar(car);
		model.addAttribute("car", car);
		return "PostSuccess";
	}

}
