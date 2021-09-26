package com.lithan.AbcCar.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lithan.AbcCar.entities.Role;
import com.lithan.AbcCar.entities.User;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	 Set<Role> findByName(String name);
}
