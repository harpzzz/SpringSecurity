    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harpz.springsecurity.model;

import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author harpz
 */
public class MUserDetail extends MUser implements UserDetails {

    public MUserDetail(final MUser mUser) {
        super(mUser);
    }

    
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getRole()
                .stream()
                .map(rol -> new SimpleGrantedAuthority("ROLE_" + rol.getrType()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return super.getuPassword();
    }

    @Override
    public String getUsername() {
        return super.getuPassword();
    }

    @Override
    public boolean isAccountNonExpired() {
            return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
}
