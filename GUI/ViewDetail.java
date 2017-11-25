package GUI;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.BillItem;
import model.Customer;
import model.Product;

public class ViewDetail extends javax.swing.JFrame {

    private Product p;
    private Customer ct;
    private CategoryGUI g;
    private BillItem bi[];

    public ViewDetail(Customer ct, Product p, CategoryGUI g, BillItem bi[]) {
        this.p = p;
        this.ct = ct;
        this.g = g;
        this.bi = bi;
        initComponents();
        pic.setIcon(ResizeImageForApp(pic, p.getImageProduct()));
    }

    public ImageIcon ResizeImageForApp(JLabel picPlace, String filePicture) {
        ImageIcon myPic = new ImageIcon(getClass().getResource("/GUI/image/product/" + filePicture));
        Image img = myPic.getImage();
        Image newImg = img.getScaledInstance(picPlace.getWidth(), picPlace.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 780));
        getContentPane().setLayout(null);

        pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(pic);
        pic.setBounds(20, 110, 580, 490);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/detail1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 20, 380, 60);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4","5" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(740, 500, 100, 40);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("supermarket", 1, 36)); // NOI18N
        jLabel3.setText(p.getProductName());
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(640, 110, 530, 46);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("supermarket", 1, 18)); // NOI18N
        jLabel6.setText(p.getCatetory().getCatetotyName());
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(740, 230, 261, 51);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("supermarket", 1, 18)); // NOI18N
        jLabel5.setText(p.getPrice()+"");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(740, 170, 150, 51);

        jLabel7.setFont(new java.awt.Font("supermarket", 1, 24)); // NOI18N
        jLabel7.setText("จำนวน:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(660, 500, 80, 30);

        jLabel8.setFont(new java.awt.Font("supermarket", 1, 24)); // NOI18N
        jLabel8.setText("ราคา:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(670, 180, 50, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(p.getDescription());
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(740, 300, 390, 190);

        jLabel9.setFont(new java.awt.Font("supermarket", 1, 24)); // NOI18N
        jLabel9.setText("หมวดหมู่:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(640, 230, 90, 30);

        jButton1.setText("หยิบลงตะกร้า");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(630, 660, 130, 40);

        jButton2.setText("ย้อนกลับ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(490, 660, 130, 40);

        jLabel10.setFont(new java.awt.Font("supermarket", 1, 24)); // NOI18N
        jLabel10.setText("รายละเอียด:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(620, 300, 110, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/system/bgit.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1200, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CategoryGUI c = new CategoryGUI(ct, p.getCatetory().getCatetoryNo(), bi);
        c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i = 0; i < bi.length; i++) {
            if (bi[i] == null) {
                bi[i] = new BillItem();
                bi[i].setProduct(p);
                bi[i].setQuantity(Integer.parseInt(jComboBox1.getSelectedItem() + ""));
                break;
            } else if (p.getProductNo() == bi[i].getProduct().getProductNo()) {
                JOptionPane.showMessageDialog(this, "คุณเคยซื้อสินค้านี้เเล้ว");
                break;
            } else if (i == bi.length - 1) {
                JOptionPane.showMessageDialog(this, "ตระกร้าเต็มเเล้ว");
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
            java.util.logging.Logger.getLogger(ViewDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel pic;
    // End of variables declaration//GEN-END:variables
}
