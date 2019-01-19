/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harpz.springsecurity.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author harpz
 */
@Entity
@Table(name = "tbl_User")        
public class MUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)        
    Long uId;
    
    String uName;
    String uPassword;
    
    int active;
    
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinTable(name = "uRole", joinColumns = @JoinColumn(name = "rType"))
    Set<MRole> role;
    
    public MUser(MUser mUser) {
        this.uId = mUser.getuId();
        this.active = mUser.getActive();
        this.uName = mUser.getuName();
        this.uPassword = mUser.getuPassword();
        this.role = mUser.getRole();
    }
    
    
    

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Set<MRole> getRole() {
        return role;
    }

    public void setRole(Set<MRole> role) {
        this.role = role;
    }
    
    
    
    
}
