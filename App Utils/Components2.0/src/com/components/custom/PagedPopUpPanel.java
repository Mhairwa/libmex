/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Detail.java
 *
 * Created on Dec 7, 2011, 10:14:09 PM
 */
package com.components.custom;

import java.awt.KeyboardFocusManager;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.biz.app.ui.util.TableUtil;
import org.components.controls.CPopupMenu;
import org.components.parent.controls.editors.TablePopUpCellEditor;

/**
 *
 * @author nnjj
 */
public abstract class PagedPopUpPanel extends javax.swing.JPanel {

    JTable tbl;
    JTextField textField;
    TablePopUpCellEditor editor;
    int selectedColumn = 0;
    Object selectedObject ;
    String selectedID ;
    String pageKey;
    List list;
    Boolean popupDisabled=false;

    
    
    public int getSelectedColumn() {
        return selectedColumn;
    }
    public String getSelectedID() {
        return selectedID;
    }
    public Object getSelectedObject() {
        return selectedObject;
    }

    public void setSelectedColumn(int selectedColumn) {
        this.selectedColumn = selectedColumn;
    }
    public void setSelectedID(String selectedID) {
        this.selectedID = selectedID;
    }
    public void setSelectedObject(Object selectedObject) {
        this.selectedObject = selectedObject;
    }
    
    public void setPopDesable(Boolean disable){
        popupDisabled=disable;
    }

    public JTable getTbl() {
        return tbl;
    }

    public void setTbl(JTable tbl) {
        this.tbl = tbl;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    /** Creates new form Detail */
    public PagedPopUpPanel(JTable tb, TablePopUpCellEditor field) {
        initComponents();
        tbl = tb;
        editor = field;
        textField = field.getComponent();
        editor.setMasterTbl(tbl);
        init();
    }

   
    
    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public PagedPopUpPanel(JTextField field) {
        initComponents();
        textField = field;

//        this.requestFocusInWindow();
//        cTextField1.requestFocus();



        init();

    }

    public PagedPopUpPanel() {
        initComponents();
        tbl = new JTable();
    }
    JPopupMenu jpm;

    public void showPopUp() {
        try {
            if (!jpm.isVisible() && !popupDisabled) {
                jpm.setFocusable(false);
                this.setSize(600, 300);
                jpm.setSize(200, 200);                
                this.setVisible(true);
                jpm.setVisible(true);                
                jpm.show(textField, 30, 30);
                jpm.setFocusable(true);
            }
        } catch (Exception e) {

            System.out.println(" --------------   " + e.getMessage());
        }


    }

    public void init() {

        jpm = new CPopupMenu();
        this.setSize(600, 300);
        jpm.add(this);        
        jpm.setSize(200, 200);
//        this.requestFocusInWindow();
//        cTextField1.requestFocus();
        jpm.setFocusable(false);
        textField.addFocusListener(new FocusAdapter() {

            @Override
            public void focusLost(FocusEvent e) {

                closePopup();
            }
        });
        cxTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 getSeletedValue();
         editor.getComponent().postActionEvent();
            }        
        });
        textField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    getSeletedValue();
                    if (editor != null) {
                        editor.getComponent().postActionEvent();
                    }
                    //move table selection

                    e.consume();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (jpm.isVisible()) {
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().redispatchEvent(cxTable1, e);
                    e.consume();
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                   if (jpm.isVisible()) {
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().redispatchEvent(cxTable1, e);
                    e.consume();
                   }
                }
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    System.out.println("popup panels related text field selected");
                    if (jpm.isVisible()) {
                    jpm.setVisible(false);
                    e.consume();
                   }
                }
            }
        });

        textField.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent e) {
                
                search(textField.getText());
                setObjectToTable(list);
                showPopUp();
            }

            public void removeUpdate(DocumentEvent e) {
                search(textField.getText());
                setObjectToTable(list);
                showPopUp();
            }

            public void changedUpdate(DocumentEvent e) {
                search(textField.getText());
                setObjectToTable(list);
                showPopUp();
            }
        });


    }
//serach sort filter cache and within the cache we we do 
    //we find our entity

    public void search(String qry) {
    }

    public void getSeletedValue() {
        selectItem();
    }

    public  void setModel(){
       
TableUtil.createTableModel(cxTable1, new String[]{"111","22","33,44","55","666","777"},new Class [] {
        Object.class, String.class, String.class,Double.class,Double.class,Double.class,Double.class,Double.class
    });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cLabel1 = new org.components.controls.CLabel();
        cTextField1 = new org.components.controls.CTextField();
        cButton1 = new org.components.controls.CButton();
        cButton2 = new org.components.controls.CButton();
        cButton3 = new org.components.controls.CButton();
        cButton4 = new org.components.controls.CButton();
        cButton5 = new org.components.controls.CButton();
        cButton6 = new org.components.controls.CButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cxTable1 = new org.components.controls.CxTable();

        cLabel1.setText("Popo fff");

        cButton1.setText(">");

        cButton2.setText(">>");

        cButton3.setText(">|");

        cButton4.setText("<");

        cButton5.setText("<<");

        cButton6.setText("|<");

        cxTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nullfsdf", "nullsdafsadfd", "nullsadfd", "nullgeg"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cxTable1.setFocusable(false);
        jScrollPane1.setViewportView(cxTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.components.controls.CButton cButton1;
    private org.components.controls.CButton cButton2;
    private org.components.controls.CButton cButton3;
    private org.components.controls.CButton cButton4;
    private org.components.controls.CButton cButton5;
    private org.components.controls.CButton cButton6;
    private org.components.controls.CLabel cLabel1;
    private org.components.controls.CTextField cTextField1;
    private org.components.controls.CxTable cxTable1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void selectItem() {

        Object ob = TableUtil.getSelectedModelsValueAt(cxTable1, 0);
      
        if(ob!=null){
            //find object from list and select
           if (textField instanceof JTextField) {
            textField.setText(ob.toString());
            selectedID=ob.toString();
            action(); 
        }
           
           
        }
        closePopup();
      
    }

    public void closePopup() {
        if (jpm.isVisible()) {
            jpm.setVisible(false);
        }
    }

    public void action() {

        System.out.println("action implemented ......");
    }

        
        
    public void setObjectToTable(List lst) {
        list=lst;
        addToTable(lst);
    }

    public void addToTable(List items) {
        TableUtil.cleardata(cxTable1);
        if (items == null || items.isEmpty()) {
            return;
        }
        for (Object itm : items) {
            addToTable(itm);
        }
//        TableUtil.addrowSR(cxTable1, new Object[]{TableUtil.newRowID, ""});
    }

    public void addToTable(Object item) {
        TableUtil.addrowSR(cxTable1, data(item));
    }

    public Object[] data(Object item) {
        return null;
    }
}
