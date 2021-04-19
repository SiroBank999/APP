/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Bean.DanhMuc;
import Controller.MenuController;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Admin
 */
public class JFMain extends javax.swing.JFrame {

    /**
     * Creates new form JFMain
     */

    int xMouse;
    int yMouse;
    public JFMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        MenuController ct = new MenuController(jpnView);
        ct.setView(jlbHome);
        List<DanhMuc> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMuc("Home",  jlbHome));
        listDanhMuc.add(new DanhMuc("User", jlbUser));
        listDanhMuc.add(new DanhMuc("Product", jlbProduct));
        ct.setEvent(listDanhMuc);
       
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlbUser = new javax.swing.JLabel();
        jlbHome = new javax.swing.JLabel();
        jlbChart = new javax.swing.JLabel();
        jlbProduct = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        imageSlide = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\APP\\src\\main\\java\\Public\\Images\\icons8_magento_50px.png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 61, 50));

        jlbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\APP\\src\\main\\java\\Public\\Images\\icons8_user_menu_female_30px.png")); // NOI18N
        jlbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbUserMouseClicked(evt);
            }
        });
        jPanel2.add(jlbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 40, 30));

        jlbHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\APP\\src\\main\\java\\Public\\Images\\icons8_home_30px.png")); // NOI18N
        jlbHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbHomeMouseClicked(evt);
            }
        });
        jPanel2.add(jlbHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 40, 30));

        jlbChart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbChart.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\APP\\src\\main\\java\\Public\\Images\\icons8_bar_chart_30px.png")); // NOI18N
        jlbChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbChartMouseClicked(evt);
            }
        });
        jPanel2.add(jlbChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 40, 30));

        jlbProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbProduct.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\APP\\src\\main\\java\\Public\\Images\\icons8_product_management_30px.png")); // NOI18N
        jlbProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbProductMouseClicked(evt);
            }
        });
        jPanel2.add(jlbProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 40, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\APP\\src\\main\\java\\Public\\Images\\icons8_exit_18px.png")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 40, 30));

        imageSlide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageSlide.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\APP\\src\\main\\java\\Public\\Images\\Untitled-2.png")); // NOI18N
        jPanel2.add(imageSlide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 480));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\APP\\src\\main\\java\\Public\\Images\\icons8_multiply_18px.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\APP\\src\\main\\java\\Public\\Images\\icons8_female_profile_30px.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 40, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel9.setText("Nguyen Van Nhon");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 120, 40));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\APP\\src\\main\\java\\Public\\Images\\icons8_alarm_24px_1.png")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 40, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\APP\\src\\main\\java\\Public\\Images\\icons8_gmail_24px.png")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 40, 30));

        jpnView.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jpnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 650, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
         xMouse=evt.getX();
         yMouse=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jlbHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbHomeMouseClicked
       imageSlide.setLocation(WIDTH, 140);

    }//GEN-LAST:event_jlbHomeMouseClicked

    private void jlbProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbProductMouseClicked
      imageSlide.setLocation(WIDTH, 240);
    }//GEN-LAST:event_jlbProductMouseClicked

    private void jlbChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbChartMouseClicked
       imageSlide.setLocation(WIDTH, 190);
    }//GEN-LAST:event_jlbChartMouseClicked

    private void jlbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbUserMouseClicked
       imageSlide.setLocation(WIDTH, 290);
   
    }//GEN-LAST:event_jlbUserMouseClicked

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
            java.util.logging.Logger.getLogger(JFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageSlide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbChart;
    private javax.swing.JLabel jlbHome;
    private javax.swing.JLabel jlbProduct;
    private javax.swing.JLabel jlbUser;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
