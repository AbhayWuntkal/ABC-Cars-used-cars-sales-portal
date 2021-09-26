package com.lithan.AbcCar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lithan.AbcCar.services.UserService;

@Controller
public class DeleteCarController {

	 @Autowired
	 private UserService userService;

	@GetMapping("/deletecar")
	public String deletecar(@RequestParam Long id, Model model) {
		
		userService.deleteCar(id);
		return "redirect:listcars";	
	}
	
}
