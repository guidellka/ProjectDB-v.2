package model;

import java.util.Date;

public class BillHistory {
    private int billStatusNo;
    private Bill bill;
    private String billStatus;
    private Date dateUpdate;

    public int getBillStatusNo() {
        return billStatusNo;
    }

    public void setBillStatusNo(int billStatusNo) {
        this.billStatusNo = billStatusNo;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public Date getDate() {
        return dateUpdate;
    }

    public void setDate(Date date) {
        this.dateUpdate = date;
    }
    
}
