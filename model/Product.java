
package model;

import database.DBManagement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Product {
    private int productNo;
    private String productName;
    private Catetory catetory;
    private int quantity;
    private double price;
    private String imageProduct;
    private String description;

    public void test() {
        try {
            Statement st = DBManagement.getCn().createStatement();
            String sql = "Select * from Product p JOIN Catetory c ON p.catetory_no=c.catetory_no";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                DBManagement.ormProduct(rs, this);
                System.out.println(toString());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Catetory getCatetory() {
        return catetory;
    }

    public void setCatetory(Catetory catetory) {
        this.catetory = catetory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

 
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(String imageProduct) {
        this.imageProduct = imageProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" + "productNo=" + productNo + ", productName=" + productName + ", catetory=" + catetory + ", quantity=" + quantity + ", price=" + price + ", imageProduct=" + imageProduct + ", description=" + description + '}';
    }
    
    
    
}
