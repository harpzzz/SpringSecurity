/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harpz.springsecurity.service;

import com.harpz.springsecurity.model.MUser;
import com.harpz.springsecurity.model.MUserDetail;
import com.harpz.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author harpz
 */
public class CustomUserDetailService implements UserDetailsService  {

    @Autowired
    UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        MUser user = userRepository.findByName(userName);
        return new MUserDetail(user);
    }
    
}
