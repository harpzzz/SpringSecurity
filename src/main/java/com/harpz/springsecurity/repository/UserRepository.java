/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harpz.springsecurity.repository;

import com.harpz.springsecurity.model.MUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author harpz
 */
public interface UserRepository extends JpaRepository<MUser,Long> {

    public MUser findByName(String userName);
    
    
}
