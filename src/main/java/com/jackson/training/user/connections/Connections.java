package com.jackson.training.user.connections;

import java.util.Date;

import com.jackson.training.user.User;

public class Connections {
    
    private String uid;
    private Date connectedTime;
    private Date logoutTime;
    private String operation;
    private User user;
    private Date recordDate;
    
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public Date getConnectedTime() {
        return connectedTime;
    }
    public void setConnectedTime(Date connectedTime) {
        this.connectedTime = connectedTime;
    }
    public Date getLogoutTime() {
        return logoutTime;
    }
    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }
    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Date getRecordDate() {
        return recordDate;
    }
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

}
