package com.jackson.training.auth.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService implements UserDetailsService{
    
    @Autowired
    private UserRepository userrepo;

    @Override
    public UserDetails loadUserByUsername(String username)  {
        User user=userrepo.findUserByEmail();
        return user;
    }
    
}
