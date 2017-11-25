
package model;

import database.DBManagement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Bill {
    private int billNo;
    private Customer customer;
    private Date date;
    private String imageSlip;    
    private String trackCode;
    private BillStatus billStatus;
    private Delivery delivery;
    private double totalPrice;
    private String comment;

    public void test() {
        try {
            Statement st = DBManagement.getCn().createStatement();
            String sql = "Select * from Bill b JOIN Bill_Status bs ON b.status_no=bs.status_no "
                    + "JOIN Delivery d ON d.delivery_no=b.delivery_no "
                    + "JOIN Customer c ON c.customer_no=b.customer_no";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                DBManagement.ormBill(rs, this);
                System.out.println(toString());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getImageSlip() {
        return imageSlip;
    }

    public void setImageSlip(String imageSlip) {
        this.imageSlip = imageSlip;
    }

    public String getTrackCode() {
        return trackCode;
    }

    public void setTrackCode(String trackCode) {
        this.trackCode = trackCode;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Bill{" + "billNo=" + billNo + ", customer=" + customer + ", date=" + date + ", imageSlip=" + imageSlip + ", trackCode=" + trackCode + ", billStatus=" + billStatus + ", delivery=" + delivery + ", totalPrice=" + totalPrice + ", comment=" + comment + '}';
    }

    
}
