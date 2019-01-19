/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harpz.springsecurity.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author harpz
 */


@RestController
public class MainController {

@GetMapping("/all")
public String forAll(){
    return "For All Users";
}
 

@GetMapping("/auth/hello")
//@PreAuthorize("hasAnyRole('ADMIN')")
public String forAuth(){
    return "For Authorize Users";
}
}
