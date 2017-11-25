
package model;

import database.DBManagement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BillItem {
    private Bill bill;
    private Product product;
    private int quantity;
    private double amount;

     public void test() {
        try {
            Statement st = DBManagement.getCn().createStatement();
            String sql = "Select * from Bill_Item bi JOIN Product p ON p.product_no=bi.product_no "
                    + "JOIN Bill b ON bi.bill_no=b.bill_no "
                    + "JOIN Customer c ON b.customer_no=c.customer_no "
                    + "JOIN Catetory ca ON p.catetory_no=ca.catetory_no "
                    + "JOIN Delivery d ON d.delivery_no=b.delivery_no "
                    + "JOIN Bill_Status bs ON bs.status_no=b.status_no";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                DBManagement.ormBillItem(rs, this);
            System.out.println(toString());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   
    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Product getProduct() {
        return product;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BillItem{" + "bill=" + bill + ", product=" + product + ", quantity=" + quantity + ", amount=" + amount + '}';
    }
    
    
}
