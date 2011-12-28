/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CTable.java
 *
 * Created on May 6, 2010, 10:48:54 AM
 */

package org.components.controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import org.components.parent.controls.PTable;

/**
 *
 * @author nano
 */
public class CTable extends PTable {

    /** Creates new form BeanForm */
    public CTable() {
        initComponents();
        ActionListener al = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            }
        };
        // i am disabling the default behaviour of table editing
        // so we can imlplement our own way of navigation 
        this.registerKeyboardAction(al, KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        this.registerKeyboardAction(al, KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.buttonBackground"));
        setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        setIntercellSpacing(new java.awt.Dimension(10, 5));
        setRowHeight(24);
        setRowMargin(5);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
