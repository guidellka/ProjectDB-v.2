package model;

import java.util.Date;

public class BillStatus {
    private int statusNo;
    private String statusName;

    public int getStatusNo() {
        return statusNo;
    }

    public void setStatusNo(int statusNo) {
        this.statusNo = statusNo;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Override
    public String toString() {
        return "BillStatus{" + "statusNo=" + statusNo + ", statusName=" + statusName + '}';
    }
    
    
   
}
