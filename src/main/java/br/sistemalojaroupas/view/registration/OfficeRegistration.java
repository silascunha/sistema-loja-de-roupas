/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.view.registration;

import br.sistemalojaroupas.db.DBException;
import br.sistemalojaroupas.model.dao.OfficeDao;
import br.sistemalojaroupas.model.entities.Office;
import javax.swing.JOptionPane;

/**
 *
 * @author silas
 */
public class OfficeRegistration extends javax.swing.JDialog {
    
    private Office office;
    private boolean isEditing;
    /**
     * Creates new form OfficeRegistration
     */
    public OfficeRegistration(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        isEditing = false;
    }
    
    public OfficeRegistration(java.awt.Dialog parent, boolean modal, Office office) {
        super(parent, modal);
        initComponents();
        this.office = office;
        
        chkHome.setSelected(this.office.getPermissions().get("homeinfo"));
        chkSale.setSelected(this.office.getPermissions().get("sale"));
        chkProduct.setSelected(this.office.getPermissions().get("product"));
        chkCustomer.setSelected(this.office.getPermissions().get("customer"));
        chkEmployee.setSelected(this.office.getPermissions().get("employee"));
        
        title.setText("Editar Cargo");
        txtOffice.setText(this.office.getName());
        isEditing = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOffice = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        chkSale = new javax.swing.JCheckBox();
        chkProduct = new javax.swing.JCheckBox();
        chkEmployee = new javax.swing.JCheckBox();
        chkCustomer = new javax.swing.JCheckBox();
        chkHome = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        bnt_save = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOffice.setBackground(new java.awt.Color(0, 0, 0));
        txtOffice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOffice.setForeground(new java.awt.Color(255, 255, 255));
        txtOffice.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        txtOffice.setCaretColor(new java.awt.Color(255, 255, 255));
        txtOffice.setOpaque(false);
        jPanel1.add(txtOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 190, 30));

        jLabel35.setBackground(new java.awt.Color(59, 44, 150));
        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Permissões:");
        jLabel35.setOpaque(true);
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 30));

        jLabel36.setBackground(new java.awt.Color(59, 44, 150));
        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Nome do Cargo:");
        jLabel36.setOpaque(true);
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 30));

        chkSale.setForeground(new java.awt.Color(255, 255, 255));
        chkSale.setText("Realizar Vendas");
        jPanel1.add(chkSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        chkProduct.setForeground(new java.awt.Color(255, 255, 255));
        chkProduct.setText("Gestão do Estoque");
        jPanel1.add(chkProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        chkEmployee.setForeground(new java.awt.Color(255, 255, 255));
        chkEmployee.setText("Gestão de Funcionários");
        jPanel1.add(chkEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        chkCustomer.setForeground(new java.awt.Color(255, 255, 255));
        chkCustomer.setText("Gestão de Clientes");
        jPanel1.add(chkCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        chkHome.setForeground(new java.awt.Color(255, 255, 255));
        chkHome.setText("Visualização da Home");
        chkHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHomeActionPerformed(evt);
            }
        });
        jPanel1.add(chkHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jPanel2.setBackground(new java.awt.Color(108, 81, 233));

        title.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Novo Cargo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 40));

        bnt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvarClaro.png"))); // NOI18N
        bnt_save.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bnt_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnt_saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bnt_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bnt_saveMouseExited(evt);
            }
        });
        jPanel1.add(bnt_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 30));

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cancelarClaro.png"))); // NOI18N
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelMouseExited(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chkHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkHomeActionPerformed

    private void bnt_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_saveMouseEntered
        // Trocar para ícone escuro
        bnt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvar.png")));
    }//GEN-LAST:event_bnt_saveMouseEntered

    private void bnt_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_saveMouseExited
        // Voltar para ícone original
        bnt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvarClaro.png")));
    }//GEN-LAST:event_bnt_saveMouseExited

    private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_cancelMouseClicked

    private void btn_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseEntered
        // Trocar para ícone escuro
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cancelar.png")));
    }//GEN-LAST:event_btn_cancelMouseEntered

    private void btn_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseExited
        // Voltar para ícone original
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cancelarClaro.png")));
    }//GEN-LAST:event_btn_cancelMouseExited

    private void bnt_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_saveMouseClicked
        if (txtOffice.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos.", "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            if (!isEditing) {
                Office office = instantiateOffice(new Office());
                
                OfficeDao.insert(office);
                JOptionPane.showMessageDialog(null, "Cargo cadastrado com sucesso.", "Atenção!",
                    JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                instantiateOffice(this.office);
                
                OfficeDao.update(this.office);
                JOptionPane.showMessageDialog(null, "Cargo atualizado com sucesso.", "Atenção!",
                    JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        } catch (DBException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bnt_saveMouseClicked

    private Office instantiateOffice(Office office) {
        office.setName(txtOffice.getText().toUpperCase());

        office.putPermission("product", chkProduct.isSelected());
        office.putPermission("employee", chkEmployee.isSelected());
        office.putPermission("homeinfo", chkHome.isSelected());
        office.putPermission("sale", chkSale.isSelected());
        office.putPermission("customer", chkCustomer.isSelected());
        
        return office;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bnt_save;
    private javax.swing.JLabel btn_cancel;
    private javax.swing.JCheckBox chkCustomer;
    private javax.swing.JCheckBox chkEmployee;
    private javax.swing.JCheckBox chkHome;
    private javax.swing.JCheckBox chkProduct;
    private javax.swing.JCheckBox chkSale;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtOffice;
    // End of variables declaration//GEN-END:variables
}
