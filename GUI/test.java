package GUI;

import database.DBManagement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

public class test {

    public static void main(String[] args){
       Customer ct = new Customer();
        try {
            ct.login("guidellka", "1234");
            System.out.println(ct);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
