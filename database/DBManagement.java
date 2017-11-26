package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import model.*;

public class DBManagement {

    private static String driver = "com.mysql.jdbc.Driver";
    private static String user = "sitkmutt-shopping";
    private static String password = "123456";
    private static String url = "jdbc:mysql://athagoras.cv9i80fkeqhz.ap-southeast-1.rds.amazonaws.com:33606/sitkmutt-shopping?characterEncoding=utf8";

    public static Customer ormCustomer(ResultSet rs, Customer customer) {
        try {
            int customer_no = rs.getInt("customer_no");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String address = rs.getString("address");
            String email = rs.getString("email");
            String tel_no = rs.getString("tel_no");
            boolean status = rs.getBoolean("status");
            int customerInviteNo = rs.getInt("customer_invite_no");

            customer.setCustomerNo(customer_no);
            customer.setUsername(username);
            customer.setPassword(password);
            customer.setFirstname(firstname);
            customer.setLastname(lastname);
            customer.setAddress(address);
            customer.setEmail(email);
            customer.setTelNo(tel_no);
            customer.setCustomerInviteNo(customerInviteNo);
            customer.setStatus(status);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return customer;
    }

    public static Catetory ormCatetory(ResultSet rs, Catetory catetory) {
        try {
            int catetoryNo = rs.getInt("catetory_no");
            String catetotyName = rs.getString("catetory_name");

            catetory.setCatetoryNo(catetoryNo);
            catetory.setCatetotyName(catetotyName);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return catetory;
    }

    public static Delivery ormDelivery(ResultSet rs, Delivery delivery) {
        try {
            int deliveryNo = rs.getInt("delivery_no");
            String deliveryName = rs.getString("delivery_name");

            delivery.setDeliveryNo(deliveryNo);
            delivery.setDeliveryName(deliveryName);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return delivery;
    }

    public static BillStatus ormBillStatus(ResultSet rs, BillStatus billStatus) {
        try {
            int statusNo = rs.getInt("status_no");
            String statusName = rs.getString("status_name");

            billStatus.setStatusNo(statusNo);
            billStatus.setStatusName(statusName);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return billStatus;
    }

    public static Product ormProduct(ResultSet rs, Product product) {
        try {
            int productNo = rs.getInt("product_no");
            String productName = rs.getString("product_name");
            Catetory catetory = new Catetory();
            ormCatetory(rs, catetory);
            int quantity = rs.getInt("quantity");
            double price = rs.getInt("price");
            String imageProduct = rs.getString("img_product");
            String description = rs.getString("description");

            product.setProductNo(productNo);
            product.setProductName(productName);
            product.setCatetory(catetory);
            product.setQuantity(quantity);
            product.setPrice(price);
            product.setImageProduct(imageProduct);
            product.setDescription(description);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return product;
    }
    public static Product ormProduct(ResultSet rs2,ResultSet rs,Product product){
         try {
            int productNo = rs.getInt("product_no");
            String productName = rs.getString("product_name");
            Catetory catetory = new Catetory();
            if(rs2.next()){
            ormCatetory(rs2, catetory);
            }
            int quantity = rs.getInt("quantity");
            double price = rs.getInt("price");
            String imageProduct = rs.getString("img_product");
            String description = rs.getString("description");

            product.setProductNo(productNo);
            product.setProductName(productName);
            product.setCatetory(catetory);
            product.setQuantity(quantity);
            product.setPrice(price);
            product.setImageProduct(imageProduct);
            product.setDescription(description);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return product;
        
    }
    

    public static Bill ormBill(ResultSet rs, Bill bill) {
        try {
            int billNo = rs.getInt("bill_no");
            Date date = rs.getDate("date");
            Customer customer = new Customer();
            ormCustomer(rs, customer);
            BillStatus billStatus = new BillStatus();
            ormBillStatus(rs, billStatus);
            Delivery delivery = new Delivery();
            ormDelivery(rs, delivery);
            String imageSlip = rs.getString("image_silp");
            String trackCode = rs.getString("track_code");
            double totalPrice = rs.getDouble("total_price");
            String comment = rs.getString("comment");

            bill.setBillNo(billNo);
            bill.setBillStatus(billStatus);
            bill.setComment(comment);
            bill.setCustomer(customer);
            bill.setDelivery(delivery);
            bill.setImageSlip(imageSlip);
            bill.setTotalPrice(totalPrice);
            bill.setTrackCode(trackCode);
            bill.setDate(date);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return bill;
    }

    public static BillHistory ormBillHistory(ResultSet rs, BillHistory billHistory) {
        try {
            int billStatusNo = rs.getInt("bill_status_no");
            Bill bill = new Bill();
            ormBill(rs, bill);
            String billStatus = rs.getString("bill_status");
            Date dateUpdate = rs.getDate("date_update");

            billHistory.setBill(bill);
            billHistory.setBillStatus(billStatus);
            billHistory.setBillStatusNo(billStatusNo);
            billHistory.setDate(dateUpdate);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return billHistory;
    }

    public static BillItem ormBillItem(ResultSet rs, BillItem billItem) {
        try {
            int quantity = rs.getInt("quantity");
            double amount = rs.getDouble("total_price");
            Bill bill = new Bill();
            ormBill(rs, bill);
            Product product = new Product();
            ormProduct(rs,product);
            
            billItem.setProduct(product);
            billItem.setAmount(amount);
            billItem.setBill(bill);
            billItem.setQuantity(quantity);
            

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return billItem;
    }

    public static Connection getCn() {
        Connection cn = null;
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return cn;
    }

}
