package com.lithan.AbcCar.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.lithan.AbcCar.dao.UserRepository;
import com.lithan.AbcCar.entities.Role;
import com.lithan.AbcCar.entities.User;

import javax.transaction.Transactional;

@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDetailsServiceImpl() {
    }

    /*
     * Default Authentication mechanism calls this method to get UserDetails by the name given at the time of login.
     * This method returns UserDetails with password and roles he/she plays.
     * Spring then verifies the password given by the user with this password and authenticates the user.
     */
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(userName);
        if(user == null) {
            throw new UsernameNotFoundException("user " + userName + " is not valid. Please re-enter.");
        }
        org.springframework.security.core.userdetails.User.UserBuilder userBuilder = org.springframework.security.core.userdetails.User.builder();
        String[] roleNames= user.getRoles().stream().map(Role::getName).toArray(String[]::new);
        return userBuilder.username(user.getUserName())
                        .password(user.getPassword())
                        .roles(roleNames)
                        .passwordEncoder(passwordEncoder::encode)
                        .build();
    }
}
