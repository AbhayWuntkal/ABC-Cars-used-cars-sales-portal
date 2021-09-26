package com.lithan.AbcCar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lithan.AbcCar.entities.Car;
import com.lithan.AbcCar.entities.User;
import com.lithan.AbcCar.services.UserService;


@Controller
public class CarListController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/listcars")
	public String listcars(Model model){
		List<Car> carlist = userService.listcar();
		model.addAttribute("carlist", carlist);
		return "listcars";
		
	}
	
	
}
