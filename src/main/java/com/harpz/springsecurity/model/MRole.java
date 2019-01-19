/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harpz.springsecurity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author harpz
 */
@Entity
@Table(name = "tbl_Role")        
class MRole {
 
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)        
    Long rId;
    
    @Column(name = "roleType")
    String rType;

    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public String getrType() {
        return rType;
    }

    public void setrType(String rType) {
        this.rType = rType;
    }
    
    
    
    
}
