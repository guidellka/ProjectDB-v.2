package GUI;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.Product;

public class ProductPanel extends javax.swing.JPanel {

    private Product p = new Product();

    public ProductPanel(Product input) {
        p = input;
        initComponents();
        pic.setIcon(ResizeImageForApp(pic, p.getImageProduct()));
    }

    public ImageIcon ResizeImageForApp(JLabel picPlace, String filePicture) {
        ImageIcon myPic = new ImageIcon(getClass().getResource("/GUI/image/product/1.A0001.jpg"));
        Image img = myPic.getImage();
        Image newImg = img.getScaledInstance(picPlace.getWidth(), picPlace.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        price = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(930, 200));
        setMinimumSize(new java.awt.Dimension(930, 200));
        setPreferredSize(new java.awt.Dimension(930, 200));
        setLayout(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setMinimumSize(new java.awt.Dimension(130, 60));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 50));
        add(jSeparator1);
        jSeparator1.setBounds(0, 198, 930, 2);

        jLabel2.setFont(new java.awt.Font("supermarket", 0, 24)); // NOI18N
        jLabel2.setText("บาท");
        add(jLabel2);
        jLabel2.setBounds(530, 100, 50, 30);

        pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(pic);
        pic.setBounds(33, 13, 308, 174);

        jButton1.setText("รายละเอียด");
        add(jButton1);
        jButton1.setBounds(550, 150, 113, 39);

        price.setFont(new java.awt.Font("supermarket", 0, 24)); // NOI18N
        price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price.setText(p.getPrice()+"");
        add(price);
        price.setBounds(450, 100, 70, 30);

        jLabel4.setFont(new java.awt.Font("supermarket", 0, 24)); // NOI18N
        jLabel4.setText("ชื่อสินค้า :");
        add(jLabel4);
        jLabel4.setBounds(390, 40, 80, 30);

        productName.setFont(new java.awt.Font("supermarket", 0, 24)); // NOI18N
        productName.setText(p.getProductName());
        add(productName);
        productName.setBounds(480, 40, 430, 30);

        jLabel5.setFont(new java.awt.Font("supermarket", 0, 24)); // NOI18N
        jLabel5.setText("ราคา :");
        add(jLabel5);
        jLabel5.setBounds(390, 100, 50, 30);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel price;
    private javax.swing.JLabel productName;
    // End of variables declaration//GEN-END:variables
}
