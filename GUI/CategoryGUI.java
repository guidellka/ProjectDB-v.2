package GUI;

import database.DBManagement;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ScrollBar;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.BillItem;
import model.Customer;
import model.Product;

public class CategoryGUI extends javax.swing.JFrame {

    private Customer ct;
    private ProductPanel[] allItem;
    private BillItem bi [];

    public CategoryGUI(Customer ct, int catetoryNo,BillItem[] bi) {
        this.ct = ct;
        this.bi = bi;
        JPanel subPanel = new JPanel();
        try {
            String sql = "Select * from Product p JOIN Catetory c ON p.catetory_no=c.catetory_no "
                    + "Where p.catetory_no=" + catetoryNo;
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            int countProdect = countProduct(catetoryNo);
            allItem = new ProductPanel[countProdect];
            subPanel.setSize(930, countProdect * 200);
            for (int i = 0; i < allItem.length; i++) {
                rs.next();
                Product product = new Product();
                DBManagement.ormProduct(rs, product);
                ProductPanel p = new ProductPanel(product,this, bi,this.ct);
                subPanel.add(p);
                allItem[i] = p;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));
        initComponents();
        jScrollPane1.setViewportView(subPanel);
        changeComboBox(catetoryNo);
        
        for (BillItem i: bi) {
            if(i != null){
                System.out.println(i);
            }
        }
        System.out.println("---------------------------");
    }

    public CategoryGUI(Customer ct, String search,BillItem[] bi) {
        this.ct = ct;
        JPanel subPanel = new JPanel();
        try {
            String sql = "Select * from Product where product_name LIKE '%" + search + "%' ";
            Statement st = DBManagement.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            int countProdect = countProduct(search);

            allItem = new ProductPanel[countProdect];
            subPanel.setSize(930, countProdect * 200);

            for (int i = 0; i < allItem.length; i++) {
                rs.next();
                Product product = new Product();
                DBManagement.ormProduct(rs, product);
                ProductPanel p = new ProductPanel(product, this, bi,this.ct);
                subPanel.add(p);
                allItem[i] = p;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));
        initComponents();
        jScrollPane1.setViewportView(subPanel);
        
        for (BillItem i: bi) {
            if(i != null){
                System.out.println(i);
            }
        }
        System.out.println("---------------------------");
    }

    public void changeComboBox(int catetoryNo) {
        switch (catetoryNo) {
            case 1:
                jComboBox1.setSelectedIndex(1);
                break;
            case 2:
                jComboBox1.setSelectedIndex(2);
                break;
            case 3:
                jComboBox1.setSelectedIndex(3);
                break;
            case 4:
                jComboBox1.setSelectedIndex(4);
                break;
        }
    }

    public int countProduct(int catetoryNo) {
        int count = 0;
        try {
            String sql = "Select count(*) from Product p JOIN Catetory c ON p.catetory_no=c.catetory_no "
                    + "Where p.catetory_no=" + catetoryNo;
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
            String sql = "Select count(*) from Product where product_name LIKE '%" + search + "%'";
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jComboBox1.setFont(new java.awt.Font("supermarket", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "หมวดหมู่", "กระเป๋าสะพายหลัง", "กระเป๋าสะพายข้าง", "กระเป๋าถือ" ,"กระเป๋าสตางค์"}));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(140, 140, 180, 40);

        jButton1.setFont(new java.awt.Font("supermarket", 0, 20)); // NOI18N
        jButton1.setText("เลือก");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 140, 90, 40);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(810, 140, 260, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/icon.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1100, 20, 40, 40);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/man-user.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15);
        jLabel15.setBounds(1060, 20, 30, 40);

        jLabel16.setFont(new java.awt.Font("supermarket", 0, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText(ct.getFirstname()+" "+ct.getLastname());
        getContentPane().add(jLabel16);
        jLabel16.setBounds(810, 20, 240, 50);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/logout.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1150, 20, 40, 50);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(930, 440));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(930, 440));
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 200, 930, 480);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/magnifier (1).png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(760, 140, 41, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/font.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 40, 380, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/bgit.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 1200, 760);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(this, "ยืนยันการออกโปรแกรม", "ปิดโปรแกรม", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
            return;
        }
    }//GEN-LAST:event_formWindowClosing

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        News n = new News(ct);
        n.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        ViewUser v = new ViewUser(ct);
        v.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        Login login = new Login();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            CategoryGUI cg = new CategoryGUI(ct, jTextField1.getText(), bi);
            cg.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CategoryGUI cg;
        switch (jComboBox1.getSelectedIndex()) {
            case 1:
                cg = new CategoryGUI(ct, 1, bi);
                cg.setVisible(true);
                setVisible(false);
                break;
            case 2:
                cg = new CategoryGUI(ct, 2, bi);
                cg.setVisible(true);
                setVisible(false);
                break;
            case 3:
                cg = new CategoryGUI(ct, 3, bi);
                cg.setVisible(true);
                setVisible(false);
                break;
            case 4:
                cg = new CategoryGUI(ct, 4, bi);
                cg.setVisible(true);
                setVisible(false);
                break;

        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CategoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CategoryGUI().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
