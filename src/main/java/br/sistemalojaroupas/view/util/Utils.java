/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.view.util;

import br.sistemalojaroupas.model.entities.Brand;
import br.sistemalojaroupas.model.entities.Category;
import br.sistemalojaroupas.model.entities.Color;
import br.sistemalojaroupas.model.entities.Product;
import br.sistemalojaroupas.model.entities.Sale;
import br.sistemalojaroupas.model.entities.TableContract;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author silas
 */
public class Utils {
    
    public static void updateTable(Collection<? extends TableContract> objList, JTable table) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        objList.forEach(obj -> {
            dtm.addRow(obj.tableRowModel());
        });
    }
    
    public static void updateComboBox(List<?> list, JComboBox cb) {
        cb.removeAllItems();
        cb.addItem("Selecione...");
        list.forEach(c -> {
            cb.addItem(c);
        });
    }
    
    public static void updateComboBox(List<?> list, JComboBox cb, String firstOption) {
        cb.removeAllItems();
        cb.addItem(firstOption);
        list.forEach(c -> {
            cb.addItem(c);
        });
    }
    
    public static void clearFields(JPanel pn){
        for (Component c : pn.getComponents()) {
            if (c instanceof JComboBox) ((JComboBox)c).setSelectedIndex(0);
            if (c instanceof JTextField) ((JTextField)c).setText("");
            if (c instanceof JFormattedTextField) ((JFormattedTextField)c).setText("");
        }
    } 
    
    public static boolean isAllFieldsFilled(JPanel pn) {
        
        for (Component c : pn.getComponents()) {
            if (c instanceof JComboBox) {
                int i = ((JComboBox)c).getSelectedIndex();
                if (i < 1) return false;
            }
            if (c instanceof JTextField) {
                String s = ((JTextField)c).getText();
                if (s.equals("")) return false;
            }
            if (c instanceof JFormattedTextField) {
                String s = ((JFormattedTextField)c).getText();
                if (s.equals("")) return false;
            }
        }
        return true;
    }
    
    public static Double tryParseToDouble(String arg) {
        try {
            return Double.parseDouble(arg);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
    public static Long tryParseToLong(String arg) {
        try {
            return Long.parseLong(arg);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
    public static Integer tryParseToInt(String arg) {
        try {
            return Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
    public static String formatCpf(String cpf) {
        String[] dividedCpf = cpf.replace('.', ',').replace('-', ',').split(",");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < dividedCpf.length; i++) {
            sb.append(dividedCpf[i]);
        }
        
        return sb.toString();
    }
    
    public static List<Product> productFilters(Collection<Product> product, Category category, Brand brand, Color color, String size) {
        List<Product> list = new ArrayList<>();
        list.addAll(product);
        
        if (category != null) {
            list.removeIf(p -> !p.getCategory().equals(category));
        }
        if (brand != null) {
            list.removeIf(p -> !p.getBrand().equals(brand));
        }
        if (color != null) {
            list.removeIf(p -> !p.getColor().equals(color));
        }
        if (size != null) {
            list.removeIf(p -> !p.getSize().equals(size));
        }
        
        return list;
    }

}
