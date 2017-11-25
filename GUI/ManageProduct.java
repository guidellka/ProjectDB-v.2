package GUI;

import database.DBManagement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import model.Customer;
import model.Product;

public class ManageProduct extends javax.swing.JFrame {

    private Customer ct;
    private MProduct[] allProduct;

    public ManageProduct(Customer ct) {
        this.ct = ct;
        JPanel subPanel = new JPanel();
        try {
            String sql = "Select * from Product p JOIN Catetory c ON p.catetory_no=c.catetory_no";
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);

            int countProdect = countProduct();
            allProduct = new MProduct[countProdect];
            subPanel.setSize(750, countProdect * 50);
            for (int i = 0; i < allProduct.length; i++) {
                rs.next();
                Product product = new Product();
                DBManagement.ormProduct(rs, product);
                MProduct p = new MProduct(product, this, this.ct);
                subPanel.add(p);
                allProduct[i] = p;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));
        initComponents();
        jScrollPane1.setViewportView(subPanel);
    }

    public ManageProduct(Customer ct, int catetoryNo) {
        this.ct = ct;
        JPanel subPanel = new JPanel();
        try {
            String sql = "Select * from Product p JOIN Catetory c ON p.catetory_no=c.catetory_no "
                    + "WHERE p.catetory_no=" + catetoryNo;
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);

            int countProdect = countProduct(catetoryNo);
            allProduct = new MProduct[countProdect];
            subPanel.setSize(750, countProdect * 50);
            for (int i = 0; i < allProduct.length; i++) {
                rs.next();
                Product product = new Product();
                DBManagement.ormProduct(rs, product);
                MProduct p = new MProduct(product, this, this.ct);
                subPanel.add(p);
                allProduct[i] = p;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));
        initComponents();
        jScrollPane1.setViewportView(subPanel);
    }

    public ManageProduct(Customer ct, String search) {
        this.ct = ct;
        JPanel subPanel = new JPanel();
        try {
            String sql = "Select * from Product p JOIN Catetory c ON p.catetory_no=c.catetory_no "
                    + "WHERE product_name LIKE '%" + search + "%'";
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);

            int countProdect = countProduct(search);
            allProduct = new MProduct[countProdect];
            subPanel.setSize(750, countProdect * 50);
            for (int i = 0; i < allProduct.length; i++) {
                rs.next();
                Product product = new Product();
                DBManagement.ormProduct(rs, product);
                MProduct p = new MProduct(product, this, this.ct);
                subPanel.add(p);
                allProduct[i] = p;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));
        initComponents();
        jScrollPane1.setViewportView(subPanel);
    }

    public int countProduct() {
        int count = 0;
        try {
            String sql = "Select count(*) from Product p JOIN Catetory c ON p.catetory_no=c.catetory_no";
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public int countProduct(int catetoryNo) {
        int count = 0;
        try {
            String sql = "Select count(*) from Product p JOIN Catetory c ON p.catetory_no=c.catetory_no "
                    + "WHERE p.catetory_no=" + catetoryNo;
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public int countProduct(String search) {
        int count = 0;
        try {
            String sql = "Select count(*) from Product p JOIN Catetory c ON p.catetory_no=c.catetory_no "
                    + "WHERE product_name LIKE '%" + search + "%'";
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setPreferredSize(new java.awt.Dimension(1200, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton5.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        jButton5.setText("เพิ่ม");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(140, 420, 70, 30);

        jLabel1.setFont(new java.awt.Font("supermarket", 1, 48)); // NOI18N
        jLabel1.setText("จัดการสินค้า");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 70, 220, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/catetory5.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 140, 170, 170);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/Mproduct.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 410, 770, 50);

        jLabel16.setFont(new java.awt.Font("supermarket", 0, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText(ct.getFirstname()+" "+ct.getLastname());
        getContentPane().add(jLabel16);
        jLabel16.setBounds(890, 20, 240, 50);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/logout.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1150, 20, 40, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/catetory2.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(620, 140, 170, 170);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/catetory4.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(820, 140, 170, 170);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/catetory.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 140, 170, 170);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/bag1.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(220, 320, 170, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/bag2.png"))); // NOI18N
        jLabel12.setText("jLabel10");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(420, 320, 170, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/ba4.png"))); // NOI18N
        jLabel13.setText("jLabel10");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(620, 320, 170, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/bag3.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(820, 320, 170, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/magnifier (1).png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 360, 41, 40);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(220, 360, 770, 40);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 458, 770, 250);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/Untitled-1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 750);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        Login login = new Login();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ManageProduct m = new ManageProduct(ct, 1);
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        ManageProduct m = new ManageProduct(ct, 1);
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        ManageProduct m = new ManageProduct(ct, 2);
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        ManageProduct m = new ManageProduct(ct, 2);
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        ManageProduct m = new ManageProduct(ct, 3);
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        ManageProduct m = new ManageProduct(ct, 3);
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        ManageProduct m = new ManageProduct(ct, 4);
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        ManageProduct m = new ManageProduct(ct, 4);
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
      if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            ManageProduct mp = new ManageProduct(ct, jTextField1.getText());
            mp.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
