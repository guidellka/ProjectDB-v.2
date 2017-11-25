/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Customer;

public class News extends javax.swing.JFrame {

    private Customer ct;

    public News(Customer ct) {
        this.ct = ct;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setPreferredSize(new java.awt.Dimension(1200, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("supermarket", 0, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/font.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 50, 380, 70);

        jLabel16.setFont(new java.awt.Font("supermarket", 0, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText(ct.getFirstname()+" "+ct.getLastname());
        getContentPane().add(jLabel16);
        jLabel16.setBounds(810, 20, 240, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/magnifier (1).png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(720, 140, 41, 40);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/logout.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1150, 20, 40, 50);

        jLabel10.setFont(new java.awt.Font("supermarket", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Select Catetory");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 140, 250, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/icon.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1100, 20, 40, 40);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/man-user.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(1060, 20, 30, 40);

        jLabel17.setFont(new java.awt.Font("supermarket", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("กระเป๋าสตางค์");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(920, 380, 110, 30);

        jLabel18.setFont(new java.awt.Font("supermarket", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("กระเป๋าถือ");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(710, 380, 80, 30);

        jLabel11.setFont(new java.awt.Font("supermarket", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("กระเป๋าสะพายไหล่");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(440, 380, 130, 30);

        jLabel2.setFont(new java.awt.Font("supermarket", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("กระเป๋าสะพายหลัง");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 380, 130, 30);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 420, 840, 290);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/catetory4.png"))); // NOI18N
        jLabel7.setText("jLabel6");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(880, 200, 170, 170);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/catetory2.png"))); // NOI18N
        jLabel8.setText("jLabel6");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(660, 200, 170, 170);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/catetory5.png"))); // NOI18N
        jLabel9.setText("jLabel6");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 200, 170, 170);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/catetory.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 200, 170, 170);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(760, 140, 270, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/bgit.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(1200, 750));
        jLabel3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1200, 750);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        Login login = new Login();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        CategoryGUI cg = new CategoryGUI(ct, 1);
        cg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        CategoryGUI cg = new CategoryGUI(ct, 2);
        cg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        CategoryGUI cg = new CategoryGUI(ct, 3);
        cg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        CategoryGUI cg = new CategoryGUI(ct, 4);
        cg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            CategoryGUI cg = new CategoryGUI(ct, jTextField1.getText());
            cg.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        ViewUser v = new ViewUser(ct);
        v.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
