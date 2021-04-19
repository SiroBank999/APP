/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;


import Model.StaffModel;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class JPUser extends javax.swing.JPanel {

    /**
     * Creates new form JPUser
     */
    private List<StaffModel> listStaff = new ArrayList<>();
   
    String strFind = "";

     
   
    public JPUser() {
        initComponents();
        jTable2.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable2.getTableHeader().setOpaque(Boolean.FALSE);
        jTable2.getTableHeader().setBackground(new Color(32, 136, 203));
        jTable2.getTableHeader().setForeground(new Color(255, 255, 255));
        jTable2.setRowHeight(25);
        showResult();

    }
    public void showResult() {
        StaffModel staff = new StaffModel();
        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
        tableModel.setRowCount(0);
        listStaff = staff.findByName(strFind);
        listStaff.forEach((StaffModel staff1) -> {
            tableModel.addRow(new Object[]{staff1.getId(), staff1.getFullname(), staff1.getNgaysinh(), staff1.getHsl()});
        });

    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "HỌ TÊN", "NĂM SINH", "HỆ SỐ LƯƠNG"
            }
        ));
        jTable2.setFocusable(false);
        jTable2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable2.setRowHeight(25);
        jTable2.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 630, 231));

        txtTimKiem.setBackground(new java.awt.Color(204, 204, 204));
        txtTimKiem.setBorder(null);
        txtTimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemCaretUpdate(evt);
            }
        });
        add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 11, 219, 28));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 40, 260, 10));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\APP\\src\\main\\java\\Public\\Images\\icons8_search_18px_1.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 30, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("THÊM MỚI");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        strFind = txtTimKiem.getText();

        showResult();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtTimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemCaretUpdate
        strFind = txtTimKiem.getText();

        showResult();
    }//GEN-LAST:event_txtTimKiemCaretUpdate

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       int row = jTable2.rowAtPoint(evt.getPoint());
      
       String s = jTable2.getModel().getValueAt(row, 0).toString();
        int id = Integer.parseInt(s);
       
       JFAdduser update = new JFAdduser();
        update.setIdStaff(id);
        try {
            //suaframe.load_student_data();
            update.loadStaff();
        } catch (IOException ex) {
            Logger.getLogger(JPUser.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        update.setVisible(true);
        
        
        
        
        
        
//      StaffModel staff = new StaffModel();
//      int selected = jTable2.getSelectedRow();
//      if(selected>=0){
//          String staffname = (String) jTable2.getValueAt(selected,1);
//          String staffngaysinh = (String) jTable2.getValueAt(selected,2);
//          float staffhsl =(float) jTable2.getValueAt(selected,3);
//          
//             
//            
//                  update.setVisible(true);
//                  update.txtFullname.setText(staffname);
//                  update.txtNgaysinh.setText(staffngaysinh);
//                  update.txtHsl.setText(String.valueOf(staffhsl));
//                 
//                  
//          
//      }
       
    }//GEN-LAST:event_jTable2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        JFAdduser add = new  JFAdduser();
        add.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables


}