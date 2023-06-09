package com.jackson.training.auth.user;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails {

    private int id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String password;
    private boolean activated;
    private Date activatedDate;
    private boolean blocked;
    private Date blockedDate;
    private Date lastConnection;
    private Date recordDate;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isActivated() {
        return activated;
    }
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    public Date getActivatedDate() {
        return activatedDate;
    }
    public void setActivatedDate(Date activatedDate) {
        this.activatedDate = activatedDate;
    }
    public boolean isBlocked() {
        return blocked;
    }
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
    public Date getBlockedDate() {
        return blockedDate;
    }
    public void setBlockedDate(Date blockedDate) {
        this.blockedDate = blockedDate;
    }
    public Date getLastConnection() {
        return lastConnection;
    }
    public void setLastConnection(Date lastConnection) {
        this.lastConnection = lastConnection;
    }
    public Date getRecordDate() {
        return recordDate;
    }
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;    
    }
    @Override
    public String getUsername() { 
        throw new UnsupportedOperationException("Unimplemented method 'getUsername'");
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
