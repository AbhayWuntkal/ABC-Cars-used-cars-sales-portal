package com.lithan.AbcCar.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.lithan.AbcCar.dao.CarRepository;
import com.lithan.AbcCar.dao.RoleRepository;
import com.lithan.AbcCar.dao.UserRepository;
import com.lithan.AbcCar.entities.Car;
import com.lithan.AbcCar.entities.Role;
import com.lithan.AbcCar.entities.User;
import javax.transaction.Transactional;

import java.util.List;
import java.util.Set;

@Service
@Transactional
public class UserService {
	
	@Autowired
	RoleRepository roleRepo;

	@Autowired
	UserRepository userReposito;

	@Autowired
	CarRepository carrepo;

	public User saveUser (User user) {
		Set<Role> role = roleRepo.findByName("USER");
		user.setRoles(role);
		User User = userReposito.save(user);
		return User;
	}
	
	public void addUser(User user) {
		Set<Role> role = roleRepo.findByName("USER");
		user.setRoles(role);
		userReposito.save(user);
	}
	
	public void addAdmin(User user) {
		Set<Role> role = roleRepo.findByName("ADMIN");
		user.setRoles(role);
		userReposito.save(user);
	}
	
	public void saveCar (Car car) {
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userReposito.findByUserName(name);
		car.setCarowner(name);
		carrepo.save(car);

	}

	public List<User> listUser() {
		List<User> userlist = userReposito.findAll();	
		return userlist;
	}

	public void deleteUser (Long id) {
		userReposito.deleteById(id);	
	}


	public List<Car> listcar() {
		List<Car> carlist = carrepo.findAll();	
		return carlist;
	}

	public void deleteCar (Long id) {
		carrepo.deleteById(id);	
	}
	
	public List<Car> search(String keyword) {
		return carrepo.search(keyword);
	}
	
}
