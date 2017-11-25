package model;

import database.DBManagement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {

    private int customerNo;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String address;
    private String email;
    private String telNo;
    private int customerInviteNo;
    private boolean status; //ture = เเอดมิน

    public void test() {
        try {
            Statement st = DBManagement.getCn().createStatement();
            String sql = "Select * from Customer where username='guidellka'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                DBManagement.ormCustomer(rs, this);
                System.out.println(toString());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean login(String username, String password) throws SQLException {
        boolean result = false;
        String sql = "select * from Customer where username='" + username + "'";
        Statement st = DBManagement.getCn().createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        if (rs.getString("username").equals(username)) {
            if (rs.getString("password").equals(password)) {
                DBManagement.ormCustomer(rs, this);
                result = true;
            }
        }
        return result;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCustomerInviteNo() {
        return customerInviteNo;
    }

    public void setCustomerInviteNo(int customerInviteNo) {
        this.customerInviteNo = customerInviteNo;
    }

    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerNo=" + customerNo + ", username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", email=" + email + ", telNo=" + telNo + ", customerInviteNo=" + customerInviteNo + ", status=" + status + '}';
    }


}
