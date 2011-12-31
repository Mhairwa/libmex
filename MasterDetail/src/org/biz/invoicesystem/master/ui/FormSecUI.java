/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormSecUI.java
 *
 * Created on Dec 16, 2011, 10:15:13 AM
 */
package org.biz.invoicesystem.master.ui;

import javax.swing.JPanel;
import org.biz.app.ui.util.MessageBoxes;
import org.components.windows.TabPanelUI;

/**
 *
 * @author Administrator
 */
public class FormSecUI extends TabPanelUI {

    /** Creates new form FormSecUI */
    public FormSecUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cComboBox1 = new org.components.controls.CComboBox();
        cLabel1 = new org.components.controls.CLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        cPanel1 = new org.components.containers.CPanel();
        cLabel2 = new org.components.controls.CLabel();
        cLabel10 = new org.components.controls.CLabel();
        cTextField2 = new org.components.controls.CTextField();
        cLabel11 = new org.components.controls.CLabel();
        cTextField3 = new org.components.controls.CTextField();
        cLabel12 = new org.components.controls.CLabel();
        cTextField4 = new org.components.controls.CTextField();
        cLabel13 = new org.components.controls.CLabel();
        cTextField5 = new org.components.controls.CTextField();
        cLabel14 = new org.components.controls.CLabel();
        cTextField6 = new org.components.controls.CTextField();
        cPanel3 = new org.components.containers.CPanel();
        cLabel6 = new org.components.controls.CLabel();
        cPanel4 = new org.components.containers.CPanel();
        cLabel7 = new org.components.controls.CLabel();
        cPanel5 = new org.components.containers.CPanel();
        oxComboPorts = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        oxTxtSmscNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        oxTxtSmscNumber1 = new javax.swing.JTextField();
        oxTxtSmscNumber2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        oxTxtSmscNumber3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cButton1 = new org.components.controls.CButton();
        cButton2 = new org.components.controls.CButton();
        cButton3 = new org.components.controls.CButton();
        cPanel2 = new org.components.containers.CPanel();
        cLabel3 = new org.components.controls.CLabel();
        cComboBox2 = new org.components.controls.CComboBox();
        cLabel4 = new org.components.controls.CLabel();
        cComboBox3 = new org.components.controls.CComboBox();
        cLabel5 = new org.components.controls.CLabel();
        cTextField1 = new org.components.controls.CTextField();
        cLabel8 = new org.components.controls.CLabel();
        cPanel6 = new org.components.containers.CPanel();
        cLabel9 = new org.components.controls.CLabel();
        cClose = new org.components.controls.CButton();
        cSaveBtn = new org.components.controls.CButton();
        cClear = new org.components.controls.CButton();
        cDeleteBtn = new org.components.controls.CButton();

        setLayout(null);

        cComboBox1.setEditable(true);
        cComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cComboBox1ActionPerformed(evt);
            }
        });
        add(cComboBox1);
        cComboBox1.setBounds(186, 12, 315, 23);

        cLabel1.setText("Security Role");
        add(cLabel1);
        cLabel1.setBounds(10, 11, 172, 25);

        cPanel1.setLayout(null);

        cLabel2.setText("0-No Access,  1-Read Only,  2-Read/Write, 3-Full Access");
        cPanel1.add(cLabel2);
        cLabel2.setBounds(0, 350, 440, 20);

        cLabel10.setText("Item Master Form");
        cPanel1.add(cLabel10);
        cLabel10.setBounds(10, 20, 208, 25);
        cPanel1.add(cTextField2);
        cTextField2.setBounds(220, 20, 73, 25);

        cLabel11.setText("Customer  Form");
        cPanel1.add(cLabel11);
        cLabel11.setBounds(10, 50, 208, 25);
        cPanel1.add(cTextField3);
        cTextField3.setBounds(220, 50, 73, 25);

        cLabel12.setText("Staff Form");
        cPanel1.add(cLabel12);
        cLabel12.setBounds(10, 80, 208, 25);
        cPanel1.add(cTextField4);
        cTextField4.setBounds(220, 80, 73, 25);

        cLabel13.setText("Supplier Form");
        cPanel1.add(cLabel13);
        cLabel13.setBounds(10, 110, 208, 25);
        cPanel1.add(cTextField5);
        cTextField5.setBounds(220, 110, 73, 25);

        cLabel14.setText("Another Form");
        cPanel1.add(cLabel14);
        cLabel14.setBounds(10, 140, 208, 25);
        cPanel1.add(cTextField6);
        cTextField6.setBounds(220, 140, 73, 25);

        jTabbedPane1.addTab("Forms", cPanel1);

        cPanel3.setLayout(null);

        cLabel6.setText("0-No Access,  1-Read Only,  2-Read/Write, 3-Full Access");
        cPanel3.add(cLabel6);
        cLabel6.setBounds(0, 350, 440, 20);

        jTabbedPane1.addTab("Purchase", cPanel3);

        cPanel4.setLayout(null);

        cLabel7.setText("0-No Access,  1-Read Only,  2-Read/Write, 3-Full Access");
        cPanel4.add(cLabel7);
        cLabel7.setBounds(0, 350, 440, 20);

        jTabbedPane1.addTab("Dues", cPanel4);

        cPanel5.setLayout(null);

        cPanel5.add(oxComboPorts);
        oxComboPorts.setBounds(111, 48, 152, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma 11", 1, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OR ");
        cPanel5.add(jLabel2);
        jLabel2.setBounds(242, 11, 53, 23);
        cPanel5.add(oxTxtSmscNumber);
        oxTxtSmscNumber.setBounds(110, 77, 150, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma 11", 1, 12));
        jLabel3.setText("Smsc Number");
        cPanel5.add(jLabel3);
        jLabel3.setBounds(10, 77, 100, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma 11", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HTTP Setting");
        cPanel5.add(jLabel5);
        jLabel5.setBounds(301, 11, 239, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma 11", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GSM Modem Setting");
        cPanel5.add(jLabel6);
        jLabel6.setBounds(10, 11, 226, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma 11", 1, 12));
        jLabel7.setText("Port");
        cPanel5.add(jLabel7);
        jLabel7.setBounds(10, 46, 77, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma 11", 1, 12));
        jLabel4.setText("URL ");
        cPanel5.add(jLabel4);
        jLabel4.setBounds(311, 46, 57, 23);
        cPanel5.add(oxTxtSmscNumber1);
        oxTxtSmscNumber1.setBounds(378, 46, 296, 20);
        cPanel5.add(oxTxtSmscNumber2);
        oxTxtSmscNumber2.setBounds(378, 75, 170, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma 11", 1, 12));
        jLabel8.setText("Username");
        cPanel5.add(jLabel8);
        jLabel8.setBounds(311, 75, 70, 23);
        cPanel5.add(oxTxtSmscNumber3);
        oxTxtSmscNumber3.setBounds(378, 106, 170, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma 11", 1, 12));
        jLabel9.setText("Password");
        cPanel5.add(jLabel9);
        jLabel9.setBounds(311, 106, 70, 23);

        cButton1.setText("Next");
        cPanel5.add(cButton1);
        cButton1.setBounds(340, 150, 80, 40);

        cButton2.setText("Save");
        cPanel5.add(cButton2);
        cButton2.setBounds(160, 150, 80, 40);

        cButton3.setText("Clear");
        cPanel5.add(cButton3);
        cButton3.setBounds(250, 150, 80, 40);

        jTabbedPane1.addTab("Sms", cPanel5);

        cPanel2.setLayout(null);

        cLabel3.setText("Printer For Invoice");
        cPanel2.add(cLabel3);
        cLabel3.setBounds(10, 40, 137, 25);
        cPanel2.add(cComboBox2);
        cComboBox2.setBounds(222, 41, 206, 23);

        cLabel4.setText("Report Format For Invoice");
        cPanel2.add(cLabel4);
        cLabel4.setBounds(10, 71, 191, 25);
        cPanel2.add(cComboBox3);
        cComboBox3.setBounds(222, 72, 206, 23);

        cLabel5.setText("View Customer Credit Details");
        cPanel2.add(cLabel5);
        cLabel5.setBounds(10, 102, 208, 25);
        cPanel2.add(cTextField1);
        cTextField1.setBounds(222, 102, 73, 25);

        cLabel8.setText("0-No Access,   1-View Only,   2-Save/Update,  3-Full Access(Include Delete)");
        cPanel2.add(cLabel8);
        cLabel8.setBounds(0, 350, 540, 20);

        jTabbedPane1.addTab("Invoice ", cPanel2);

        cPanel6.setLayout(null);

        cLabel9.setText("0-No Access,  1-Read Only,  2-Read/Write, 3-Full Access");
        cPanel6.add(cLabel9);
        cLabel9.setBounds(0, 350, 440, 20);

        jTabbedPane1.addTab("Reports", cPanel6);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 42, 820, 410);

        cClose.setText("Goto List ");
        add(cClose);
        cClose.setBounds(720, 460, 90, 50);

        cSaveBtn.setText("Save");
        cSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSaveBtnActionPerformed(evt);
            }
        });
        add(cSaveBtn);
        cSaveBtn.setBounds(450, 460, 80, 50);

        cClear.setText("Clear");
        cClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cClearActionPerformed(evt);
            }
        });
        add(cClear);
        cClear.setBounds(540, 460, 80, 50);

        cDeleteBtn.setText("Delete");
        cDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDeleteBtnActionPerformed(evt);
            }
        });
        add(cDeleteBtn);
        cDeleteBtn.setBounds(630, 460, 80, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void cSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSaveBtnActionPerformed
        
        
        try {
        
        } catch (Exception e) {
            e.printStackTrace();
            MessageBoxes.errormsg(null,e.getMessage(),"Error");
        }
        
    }//GEN-LAST:event_cSaveBtnActionPerformed

    private void cClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cClearActionPerformed
        
}//GEN-LAST:event_cClearActionPerformed

    private void cDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDeleteBtnActionPerformed
        try {
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cDeleteBtnActionPerformed

    private void cComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.components.controls.CButton cButton1;
    private org.components.controls.CButton cButton2;
    private org.components.controls.CButton cButton3;
    private org.components.controls.CButton cClear;
    private org.components.controls.CButton cClose;
    private org.components.controls.CComboBox cComboBox1;
    private org.components.controls.CComboBox cComboBox2;
    private org.components.controls.CComboBox cComboBox3;
    private org.components.controls.CButton cDeleteBtn;
    private org.components.controls.CLabel cLabel1;
    private org.components.controls.CLabel cLabel10;
    private org.components.controls.CLabel cLabel11;
    private org.components.controls.CLabel cLabel12;
    private org.components.controls.CLabel cLabel13;
    private org.components.controls.CLabel cLabel14;
    private org.components.controls.CLabel cLabel2;
    private org.components.controls.CLabel cLabel3;
    private org.components.controls.CLabel cLabel4;
    private org.components.controls.CLabel cLabel5;
    private org.components.controls.CLabel cLabel6;
    private org.components.controls.CLabel cLabel7;
    private org.components.controls.CLabel cLabel8;
    private org.components.controls.CLabel cLabel9;
    private org.components.containers.CPanel cPanel1;
    private org.components.containers.CPanel cPanel2;
    private org.components.containers.CPanel cPanel3;
    private org.components.containers.CPanel cPanel4;
    private org.components.containers.CPanel cPanel5;
    private org.components.containers.CPanel cPanel6;
    private org.components.controls.CButton cSaveBtn;
    private org.components.controls.CTextField cTextField1;
    private org.components.controls.CTextField cTextField2;
    private org.components.controls.CTextField cTextField3;
    private org.components.controls.CTextField cTextField4;
    private org.components.controls.CTextField cTextField5;
    private org.components.controls.CTextField cTextField6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox oxComboPorts;
    private javax.swing.JTextField oxTxtSmscNumber;
    private javax.swing.JTextField oxTxtSmscNumber1;
    private javax.swing.JTextField oxTxtSmscNumber2;
    private javax.swing.JTextField oxTxtSmscNumber3;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getTabName() {
    
        return "Security Form";
    }

    @Override
    public JPanel getJPanel() {
   
        return this;
    }
}
