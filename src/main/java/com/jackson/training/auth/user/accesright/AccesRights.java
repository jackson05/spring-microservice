package com.jackson.training.auth.user.accesright;

import java.util.Date;
public class AccesRights {
    
    private int id;
    private String accesName;
    private Date recordDate;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getAccesName() {
        return accesName;
    }
    public void setAcces(String accesName) {
        this.accesName = accesName;
    }
    public Date getRecordDate() {
        return recordDate;
    }
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }
    
}
