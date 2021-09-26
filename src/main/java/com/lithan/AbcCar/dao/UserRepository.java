package com.lithan.AbcCar.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lithan.AbcCar.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, CrudRepository<User, Long> {
    User findByUserName(String userName);
}
