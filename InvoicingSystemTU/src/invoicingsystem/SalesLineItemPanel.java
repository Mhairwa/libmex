/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LineItemPanel.java
 *
 * Created on Feb 23, 2012, 10:21:43 PM
 */
package invoicingsystem;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTextField;
import org.biz.app.ui.util.uiEty;
import org.biz.invoicesystem.entity.master.Item;
import org.biz.invoicesystem.entity.transactions.SalesInvoiceLineItem;

/**
 *
 * @author nnjj
 */
public class SalesLineItemPanel extends LineItemPanel {

    ArrayList al;
    SalesInvoiceLineItem salesline;

        public SalesLineItemPanel(JFrame jf) {
        super(jf);
        initComponents();
        
        al = new ArrayList();
        al.add(titemcode);
        al.add(tdescription);
        al.add(tqty);
        al.add(tprice);
        al.add(tunit);
        for (Object ct : al) {
            Component com = (Component) ct;
            com.addKeyListener(new KeyAdapter() {

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        moveNextFocus();                        
                        e.consume();
                    }
                }
            });

        }

        tunit.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    action();
                    titemcode.requestFocus();
//                rowToEty();
                    e.consume();
                }

            }
        });
        
        }
    /** Creates new form LineItemPanel */
    public SalesLineItemPanel() {
        super();
        initComponents();
        
        al = new ArrayList();
        al.add(titemcode);
        al.add(tdescription);
        al.add(tqty);
        al.add(tprice);
        al.add(tunit);
        for (Object ct : al) {
            Component com = (Component) ct;
            com.addKeyListener(new KeyAdapter() {

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        moveNextFocus();                        
                        e.consume();
                    }
                }
            });

        }

        tunit.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    action();
                    titemcode.requestFocus();
//                rowToEty();
                    e.consume();
                }

            }
        });
    }

    public void moveNextFocus() {
        Component com = getFocusOwner();
        if (com != null) {
            int id = al.indexOf(com);
            if (id > - 1 && id < al.size() - 1) {
                Component comp = (Component) al.get(++id);
                comp.requestFocus();
            }
        }
    }

    @Override
    protected void dialogInit() {
        super.dialogInit();
//        initComponents();
//        this.setModalityType(ModalityType.MODELESS);
//        setFocusableWindowState(false);
//        setUndecorated(true);
////        setLocationRelativeTo(fr);
//        getRootPane().setOpaque(false);
////        AWTUtilities.setWindowOpacity(this, 0.8f);
//        setFocusableWindowState(true);
//        setPreferredSize(new Dimension(900, 100));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titemcode = new org.components.controls.CTextField();
        tdescription = new org.components.controls.CTextField();
        tqty = new org.components.controls.CTextField();
        tprice = new org.components.controls.CTextField();
        tunit = new org.components.controls.CTextField();
        tlinetotal = new org.components.controls.CTextField();

        setBackground(new java.awt.Color(247, 230, 130));
        getContentPane().add(titemcode);
        titemcode.setBounds(20, 30, 122, 25);
        getContentPane().add(tdescription);
        tdescription.setBounds(160, 30, 140, 25);
        getContentPane().add(tqty);
        tqty.setBounds(320, 30, 122, 25);
        getContentPane().add(tprice);
        tprice.setBounds(460, 30, 140, 25);
        getContentPane().add(tunit);
        tunit.setBounds(610, 30, 140, 25);
        getContentPane().add(tlinetotal);
        tlinetotal.setBounds(760, 30, 140, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getItemFiled() {
        return titemcode;
    }

    public JTextField getItemdescFiled() {

        return tdescription;
    }

    public SalesInvoiceLineItem panelToEty() {
        
        
        salesline.setQty(uiEty.tcToDouble(tqty));
        salesline.setUnit(uiEty.tcToStr(tunit));
        salesline.setDescription(uiEty.tcToStr(tdescription));
        salesline.setPrice(uiEty.tcToDouble(tprice));
        salesline.setLineAmount(uiEty.tcToDouble(tlinetotal));
        //ui to ety ..
        return salesline;
    }

    public void getLineItem(){
    
        salesline=(SalesInvoiceLineItem)lineitem;
        
    }
    
    public void etyToPanel() {
    Item it= salesline.getItem();
    if(it!=null){
    uiEty.objToUi(titemcode, it.getCode());
    
    }else{
        uiEty.objToUi(titemcode, "");
    }
    uiEty.objToUi(tqty, salesline.getQty());
    uiEty.objToUi(tdescription, salesline.getDescription());
    uiEty.objToUi(tlinetotal, salesline.getLineAmount());
    uiEty.objToUi(tunit, salesline.getUnit());
    uiEty.objToUi(tprice, salesline.getPrice());
    
    }

    public void action() {
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.components.controls.CTextField tdescription;
    private org.components.controls.CTextField titemcode;
    private org.components.controls.CTextField tlinetotal;
    private org.components.controls.CTextField tprice;
    private org.components.controls.CTextField tqty;
    private org.components.controls.CTextField tunit;
    // End of variables declaration//GEN-END:variables
}
