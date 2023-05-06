package com.jackson.training.auth.user.accesright;

import java.util.Date;
public class AccesRights {
    private String accesName;
    private Date recordDate;

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
