package GUI;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Customer;

public class Login extends javax.swing.JFrame {

    private Customer ct = new Customer();

    public Login() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 750));
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setPreferredSize(new java.awt.Dimension(1200, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(470, 260, 340, 20);

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(470, 200, 340, 20);

        passwordField.setBorder(null);
        passwordField.setOpaque(false);
        getContentPane().add(passwordField);
        passwordField.setBounds(470, 230, 340, 30);
        passwordField.setBackground(new java.awt.Color(70, 229, 155,0));

        jLabel1.setFont(new java.awt.Font("WP DOMINO novel", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/login.png"))); // NOI18N
        jLabel1.setText("COMEBAG");
        jLabel1.setMaximumSize(new java.awt.Dimension(340, 58));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 90, 310, 58);

        jLabel2.setFont(new java.awt.Font("supermarket", 0, 24)); // NOI18N
        jLabel2.setText("PASSWORD:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 240, 110, 21);

        usernameField.setBorder(null);
        usernameField.setOpaque(false);
        getContentPane().add(usernameField);
        usernameField.setBounds(470, 170, 342, 34);
        usernameField.setBackground(new java.awt.Color(70, 229, 155,0));

        jButton1.setText("ยืนยัน");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 300, 92, 23);

        jLabel3.setFont(new java.awt.Font("supermarket", 0, 24)); // NOI18N
        jLabel3.setText("USER:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 180, 57, 21);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/Untitled-1.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setPreferredSize(new java.awt.Dimension(1200, 750));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1200, 750);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(780, 300, 350, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (usernameField.getText().equals("") && passwordField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากรอก Username และ Password");
        } else if (passwordField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากรอก Password");
        } else if (usernameField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากรอก Username");
        } else {
            boolean result = false;
            try {
                result = ct.login(usernameField.getText(), passwordField.getText());
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            if (result) {
                if (ct.isStatus()) {
                    ManageProduct m = new ManageProduct(ct);
                    m.setVisible(true);
                    setVisible(false);
                } else {
                    News n = new News(ct);
                    n.setVisible(true);
                    setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Username or Password incorrect");
                usernameField.setText(null);
                passwordField.setText(null);
            }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
