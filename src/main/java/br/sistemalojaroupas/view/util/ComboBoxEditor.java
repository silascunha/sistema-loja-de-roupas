/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.view.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicComboBoxEditor;

/**
 *
 * @author silas
 */
public class ComboBoxEditor extends BasicComboBoxEditor {
    private JLabel label = new JLabel();
    private JPanel panel = new JPanel();
    private Object selectedItem;
    
    public ComboBoxEditor() {
        
        label.setOpaque(true);
        label.setFont(new java.awt.Font("Tahoma", 0, 14));
        label.setForeground(Color.WHITE);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(label);
        panel.setBackground(new java.awt.Color(0, 0, 51));
    }
    
    public Component getEditorComponent() {
        return this.panel;
    }
     
    public Object getItem() {
        return "[" + this.selectedItem.toString() + "]";
    }
     
    public void setItem(Object item) {
        this.selectedItem = item;
        label.setText(item.toString());
    }
}
