
package br.sistemalojaroupas.view;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.dao.ProductDao;
import br.sistemalojaroupas.model.entities.Product;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import org.dizitart.no2.NitriteId;

/**
 *
 * @author lukas
 */
public class Home extends javax.swing.JFrame {
    
    Boolean bool = true;
    private List<JPanel> menuButtonsList = new ArrayList<>();
    private CardLayout panelsCardLayout;
    

    public Home() {
        initComponents();       
               
        panelsCardLayout = (CardLayout) CollectionCard.getLayout();
        
        //adicionando todos os panels que funcionam como botões no menu principal
        menuButtonsList.add(menu_home);
        menuButtonsList.add(menu_customers);
        menuButtonsList.add(menu_sale);
        menuButtonsList.add(menu_settings);
        menuButtonsList.add(menu_employees);
        menuButtonsList.add(menu_product);        
    }
    
    public void refreshProductsTable() {
        DefaultTableModel dtm = (DefaultTableModel) table_Products.getModel();
        dtm.setRowCount(0);
        
        List<Product> list = ProductDao.findAll();
        
        list.forEach(p -> {
            dtm.addRow(new Object[] {
                p.getId(),
                p.getDescription(),
                p.getColor(),
                p.getSize(),
                p.getCategory(),
                p.getCostPrice(),
                p.getSalePrice(),
                p.getQuantity(),
                p.getFormattedDate()
            });
        });
    }
    
    private void setMenuButtonsColor(JPanel pn1) {
        
        pn1.setBackground(new Color(108, 81, 233));
        
        menuButtonsList.forEach(pn2 -> {
            if (!pn2.equals(pn1)) pn2.setBackground(new Color(0,0,51));
        });
    }
    
    public void setDefaultColor(JPanel pnl){
        pnl.setBackground(new Color(98, 85, 158));
    }
    
    public void resetDefaultColor(JPanel pnl){
        pnl.setBackground(new Color(108, 81, 233));
    }
   
    public void changeSizeMenu(JSplitPane menu, int size){
        menu.setDividerLocation(size);
    }
    public void changeSizeHead(JPanel pnl, Dimension dim){
        pnl.setPreferredSize(dim);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Head = new javax.swing.JPanel();
        MaxMinClose = new javax.swing.JPanel();
        pnl_Max = new javax.swing.JPanel();
        btn_Max = new javax.swing.JLabel();
        pnl_Close = new javax.swing.JPanel();
        btn_Close = new javax.swing.JLabel();
        pnl_Min = new javax.swing.JPanel();
        btn_Min = new javax.swing.JLabel();
        pnl_HeaderMenu = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Mid_Header = new javax.swing.JPanel();
        pnl_IconMenu = new javax.swing.JPanel();
        btn_ShowHideMenu = new javax.swing.JLabel();
        Body = new javax.swing.JSplitPane();
        Menus = new javax.swing.JPanel();
        menu_sale = new javax.swing.JPanel();
        btn_sales = new javax.swing.JLabel();
        icon_sales = new javax.swing.JLabel();
        menu_home = new javax.swing.JPanel();
        btn_home = new javax.swing.JLabel();
        icon_home = new javax.swing.JLabel();
        menu_product = new javax.swing.JPanel();
        btn_products = new javax.swing.JLabel();
        icon_products = new javax.swing.JLabel();
        menu_employees = new javax.swing.JPanel();
        btn_employees = new javax.swing.JLabel();
        icon_employees = new javax.swing.JLabel();
        menu_customers = new javax.swing.JPanel();
        btn_customers = new javax.swing.JLabel();
        icon_customers = new javax.swing.JLabel();
        menu_settings = new javax.swing.JPanel();
        btn_settings = new javax.swing.JLabel();
        icon_settings = new javax.swing.JLabel();
        CollectionCard = new javax.swing.JPanel();
        Card_Home = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Card_Products = new javax.swing.JPanel();
        btn_editProduct = new javax.swing.JLabel();
        btn_removeProduct = new javax.swing.JLabel();
        btn_addProduct = new javax.swing.JLabel();
        btn_Search = new javax.swing.JLabel();
        txt_SearchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Products = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Card_Employees = new javax.swing.JPanel();
        Table_Employees = new javax.swing.JScrollPane();
        table_Employees = new javax.swing.JTable();
        btnSaveEmployee = new javax.swing.JLabel();
        btnEditEmployee = new javax.swing.JLabel();
        btnDeleteEmployee = new javax.swing.JLabel();
        Panel_Employees = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        BirthDate = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        AdditionalAddress = new javax.swing.JLabel();
        Job = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        Neighbourhood = new javax.swing.JLabel();
        txtEmployeeBirthDate = new javax.swing.JTextField();
        txtEmployeeCPF = new javax.swing.JTextField();
        State = new javax.swing.JLabel();
        CEP = new javax.swing.JLabel();
        HouseNumber = new javax.swing.JLabel();
        txtEmployeeCEP01 = new javax.swing.JTextField();
        txtEmployeeCEP02 = new javax.swing.JTextField();
        CPFSeparator = new javax.swing.JLabel();
        txtEmployeeAddress = new javax.swing.JTextField();
        City = new javax.swing.JLabel();
        txtEmployeeAddAddress = new javax.swing.JTextField();
        txtEmployeeCity = new javax.swing.JTextField();
        txtEmployeeState = new javax.swing.JTextField();
        txtEmployeeAddressNum = new javax.swing.JTextField();
        Phone = new javax.swing.JLabel();
        txtEmployeeJob = new javax.swing.JTextField();
        txtEmployeePhone = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        txtEmployeeEmail = new javax.swing.JTextField();
        txtEmployeeNeigh = new javax.swing.JTextField();
        Card_Customers = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Card_Settings = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Card_Sales = new javax.swing.JPanel();
        btn_NewSale = new javax.swing.JLabel();
        btn_SearchSale = new javax.swing.JLabel();
        searchSale = new javax.swing.JTextField();
        btn_CleanSearch = new javax.swing.JLabel();
        btn_DeleteSale = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();

        jTextField9.setText("jTextField9");

        jLabel20.setText("jLabel20");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Head.setBackground(new java.awt.Color(108, 81, 233));
        Head.setMaximumSize(new java.awt.Dimension(1000, 50));
        Head.setMinimumSize(new java.awt.Dimension(1000, 50));
        Head.setPreferredSize(new java.awt.Dimension(1000, 50));
        Head.setLayout(new java.awt.BorderLayout());

        MaxMinClose.setMaximumSize(new java.awt.Dimension(150, 50));
        MaxMinClose.setMinimumSize(new java.awt.Dimension(150, 50));
        MaxMinClose.setPreferredSize(new java.awt.Dimension(150, 50));
        MaxMinClose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_Max.setBackground(new java.awt.Color(108, 81, 233));
        pnl_Max.setMaximumSize(new java.awt.Dimension(50, 50));
        pnl_Max.setMinimumSize(new java.awt.Dimension(50, 50));
        pnl_Max.setPreferredSize(new java.awt.Dimension(50, 50));

        btn_Max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_maximizar.png"))); // NOI18N
        btn_Max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_MaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_MaxMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_MaxLayout = new javax.swing.GroupLayout(pnl_Max);
        pnl_Max.setLayout(pnl_MaxLayout);
        pnl_MaxLayout.setHorizontalGroup(
            pnl_MaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MaxLayout.createSequentialGroup()
                .addComponent(btn_Max, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_MaxLayout.setVerticalGroup(
            pnl_MaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_MaxLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(btn_Max, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MaxMinClose.add(pnl_Max, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        pnl_Close.setBackground(new java.awt.Color(108, 81, 233));
        pnl_Close.setMaximumSize(new java.awt.Dimension(50, 50));
        pnl_Close.setMinimumSize(new java.awt.Dimension(50, 50));
        pnl_Close.setPreferredSize(new java.awt.Dimension(50, 50));

        btn_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_fechar.png"))); // NOI18N
        btn_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_CloseLayout = new javax.swing.GroupLayout(pnl_Close);
        pnl_Close.setLayout(pnl_CloseLayout);
        pnl_CloseLayout.setHorizontalGroup(
            pnl_CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CloseLayout.createSequentialGroup()
                .addComponent(btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_CloseLayout.setVerticalGroup(
            pnl_CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CloseLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MaxMinClose.add(pnl_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        pnl_Min.setBackground(new java.awt.Color(108, 81, 233));
        pnl_Min.setMaximumSize(new java.awt.Dimension(50, 50));
        pnl_Min.setMinimumSize(new java.awt.Dimension(50, 50));
        pnl_Min.setPreferredSize(new java.awt.Dimension(50, 50));

        btn_Min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_mimizar.png"))); // NOI18N
        btn_Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_MinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_MinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_MinLayout = new javax.swing.GroupLayout(pnl_Min);
        pnl_Min.setLayout(pnl_MinLayout);
        pnl_MinLayout.setHorizontalGroup(
            pnl_MinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MinLayout.createSequentialGroup()
                .addComponent(btn_Min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_MinLayout.setVerticalGroup(
            pnl_MinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_MinLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(btn_Min, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MaxMinClose.add(pnl_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Head.add(MaxMinClose, java.awt.BorderLayout.LINE_END);

        pnl_HeaderMenu.setBackground(new java.awt.Color(108, 81, 233));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_github.png"))); // NOI18N

        jLabel14.setText("Backoffice");

        javax.swing.GroupLayout pnl_HeaderMenuLayout = new javax.swing.GroupLayout(pnl_HeaderMenu);
        pnl_HeaderMenu.setLayout(pnl_HeaderMenuLayout);
        pnl_HeaderMenuLayout.setHorizontalGroup(
            pnl_HeaderMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HeaderMenuLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );
        pnl_HeaderMenuLayout.setVerticalGroup(
            pnl_HeaderMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Head.add(pnl_HeaderMenu, java.awt.BorderLayout.LINE_START);

        Mid_Header.setBackground(new java.awt.Color(108, 81, 233));
        Mid_Header.setLayout(new java.awt.BorderLayout());

        pnl_IconMenu.setBackground(new java.awt.Color(108, 81, 233));
        pnl_IconMenu.setMaximumSize(new java.awt.Dimension(50, 50));
        pnl_IconMenu.setMinimumSize(new java.awt.Dimension(50, 50));
        pnl_IconMenu.setPreferredSize(new java.awt.Dimension(50, 50));

        btn_ShowHideMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ShowHideMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_menu.png"))); // NOI18N
        btn_ShowHideMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ShowHideMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ShowHideMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ShowHideMenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_IconMenuLayout = new javax.swing.GroupLayout(pnl_IconMenu);
        pnl_IconMenu.setLayout(pnl_IconMenuLayout);
        pnl_IconMenuLayout.setHorizontalGroup(
            pnl_IconMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ShowHideMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        pnl_IconMenuLayout.setVerticalGroup(
            pnl_IconMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ShowHideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Mid_Header.add(pnl_IconMenu, java.awt.BorderLayout.LINE_START);

        Head.add(Mid_Header, java.awt.BorderLayout.CENTER);

        getContentPane().add(Head, java.awt.BorderLayout.PAGE_START);

        Body.setDividerLocation(200);
        Body.setDividerSize(0);
        Body.setLastDividerLocation(200);

        Menus.setBackground(new java.awt.Color(0, 0, 51));
        Menus.setMinimumSize(new java.awt.Dimension(70, 100));
        Menus.setPreferredSize(new java.awt.Dimension(200, 650));

        menu_sale.setBackground(new java.awt.Color(0, 0, 51));
        menu_sale.setPreferredSize(new java.awt.Dimension(200, 50));
        menu_sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_saleMouseClicked(evt);
            }
        });
        menu_sale.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_sales.setBackground(new java.awt.Color(255, 255, 255));
        btn_sales.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_sales.setForeground(new java.awt.Color(255, 255, 255));
        btn_sales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_sales.setText("Vendas");
        menu_sale.add(btn_sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        icon_sales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_money.png"))); // NOI18N
        icon_sales.setMaximumSize(new java.awt.Dimension(70, 50));
        icon_sales.setMinimumSize(new java.awt.Dimension(70, 50));
        icon_sales.setPreferredSize(new java.awt.Dimension(70, 50));
        menu_sale.add(icon_sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu_home.setBackground(new java.awt.Color(0, 0, 51));
        menu_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_homeMouseClicked(evt);
            }
        });
        menu_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBackground(new java.awt.Color(255, 255, 255));
        btn_home.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_home.setText("Início");
        menu_home.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        icon_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_home.png"))); // NOI18N
        icon_home.setMaximumSize(new java.awt.Dimension(70, 50));
        icon_home.setMinimumSize(new java.awt.Dimension(70, 50));
        icon_home.setPreferredSize(new java.awt.Dimension(70, 50));
        menu_home.add(icon_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu_product.setBackground(new java.awt.Color(0, 0, 51));
        menu_product.setPreferredSize(new java.awt.Dimension(200, 50));
        menu_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_productMouseClicked(evt);
            }
        });
        menu_product.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_products.setBackground(new java.awt.Color(255, 255, 255));
        btn_products.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_products.setForeground(new java.awt.Color(255, 255, 255));
        btn_products.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_products.setText("Produtos");
        menu_product.add(btn_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        icon_products.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_clothes.png"))); // NOI18N
        icon_products.setMaximumSize(new java.awt.Dimension(70, 50));
        icon_products.setMinimumSize(new java.awt.Dimension(70, 50));
        icon_products.setPreferredSize(new java.awt.Dimension(70, 50));
        menu_product.add(icon_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu_employees.setBackground(new java.awt.Color(0, 0, 51));
        menu_employees.setPreferredSize(new java.awt.Dimension(200, 50));
        menu_employees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_employeesMouseClicked(evt);
            }
        });
        menu_employees.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_employees.setBackground(new java.awt.Color(255, 255, 255));
        btn_employees.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_employees.setForeground(new java.awt.Color(255, 255, 255));
        btn_employees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_employees.setText("Funcionários");
        menu_employees.add(btn_employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        icon_employees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_employees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_users.png"))); // NOI18N
        icon_employees.setMaximumSize(new java.awt.Dimension(70, 50));
        icon_employees.setMinimumSize(new java.awt.Dimension(70, 50));
        icon_employees.setPreferredSize(new java.awt.Dimension(70, 50));
        menu_employees.add(icon_employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu_customers.setBackground(new java.awt.Color(0, 0, 51));
        menu_customers.setPreferredSize(new java.awt.Dimension(200, 50));
        menu_customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_customersMouseClicked(evt);
            }
        });
        menu_customers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_customers.setBackground(new java.awt.Color(255, 255, 255));
        btn_customers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_customers.setForeground(new java.awt.Color(255, 255, 255));
        btn_customers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_customers.setText("Clientes");
        menu_customers.add(btn_customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        icon_customers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_customers.png"))); // NOI18N
        icon_customers.setMaximumSize(new java.awt.Dimension(70, 50));
        icon_customers.setMinimumSize(new java.awt.Dimension(70, 50));
        icon_customers.setPreferredSize(new java.awt.Dimension(70, 50));
        menu_customers.add(icon_customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu_settings.setBackground(new java.awt.Color(0, 0, 51));
        menu_settings.setPreferredSize(new java.awt.Dimension(200, 50));
        menu_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_settingsMouseClicked(evt);
            }
        });
        menu_settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_settings.setBackground(new java.awt.Color(255, 255, 255));
        btn_settings.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_settings.setForeground(new java.awt.Color(255, 255, 255));
        btn_settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_settings.setText("Configurações");
        menu_settings.add(btn_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        icon_settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_settings.png"))); // NOI18N
        icon_settings.setMaximumSize(new java.awt.Dimension(70, 50));
        icon_settings.setMinimumSize(new java.awt.Dimension(70, 50));
        icon_settings.setPreferredSize(new java.awt.Dimension(70, 50));
        menu_settings.add(icon_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout MenusLayout = new javax.swing.GroupLayout(Menus);
        Menus.setLayout(MenusLayout);
        MenusLayout.setHorizontalGroup(
            MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_employees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_customers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menu_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenusLayout.setVerticalGroup(
            MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenusLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(menu_sale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu_employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu_customers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu_settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenusLayout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(menu_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(533, Short.MAX_VALUE)))
        );

        Body.setLeftComponent(Menus);

        CollectionCard.setLayout(new java.awt.CardLayout());

        Card_Home.setBackground(new java.awt.Color(255, 255, 255));
        Card_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("NOVO CLIENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Card_Home.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 133, 132));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("ENTRADA PROD");
        Card_Home.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 133, 132));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("NOVA VENDA");
        Card_Home.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 133, 132));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("CONSULTA PROD");
        Card_Home.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 133, 132));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("F. Mensal");
        Card_Home.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, -1, -1));

        jFormattedTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        Card_Home.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 100, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Ticket Médio");
        Card_Home.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, -1, -1));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        Card_Home.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, 110, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Qtd. Vendas");
        Card_Home.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, -1, -1));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        Card_Home.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/welcome_Test.png"))); // NOI18N
        Card_Home.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 339, 53));

        CollectionCard.add(Card_Home, "cardHome");

        Card_Products.setBackground(new java.awt.Color(255, 255, 255));
        Card_Products.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_editProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_editProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_Editar.png"))); // NOI18N
        btn_editProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editProductMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editProductMouseExited(evt);
            }
        });
        Card_Products.add(btn_editProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 98, -1, 38));

        btn_removeProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_removeProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluirClaro.png"))); // NOI18N
        btn_removeProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_removeProductMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_removeProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_removeProductMouseExited(evt);
            }
        });
        Card_Products.add(btn_removeProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 98, -1, 38));

        btn_addProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_addProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarClaro.png"))); // NOI18N
        btn_addProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addProductMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_addProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_addProductMouseExited(evt);
            }
        });
        Card_Products.add(btn_addProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 98, -1, 38));

        btn_Search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pesquisarClaro.png"))); // NOI18N
        btn_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SearchMouseExited(evt);
            }
        });
        Card_Products.add(btn_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 98, -1, 38));

        txt_SearchField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Card_Products.add(txt_SearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 100, 460, 30));

        table_Products.setForeground(new java.awt.Color(0, 0, 51));
        table_Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Descrição", "Cor", "Tamanho", "Categoria", "P. Custo", "P. Venda", "Qtd.", "Data entrada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Products.setGridColor(new java.awt.Color(204, 204, 204));
        table_Products.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(table_Products);
        if (table_Products.getColumnModel().getColumnCount() > 0) {
            table_Products.getColumnModel().getColumn(1).setMinWidth(150);
            table_Products.getColumnModel().getColumn(1).setPreferredWidth(200);
            table_Products.getColumnModel().getColumn(1).setMaxWidth(250);
        }

        Card_Products.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 910, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText(" Produtos");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(108, 81, 233)));
        Card_Products.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, -1));
        Card_Products.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 1060, 10));

        CollectionCard.add(Card_Products, "cardProducts");

        Card_Employees.setBackground(new java.awt.Color(255, 255, 255));
        Card_Employees.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_Employees.setForeground(new java.awt.Color(0, 0, 51));
        table_Employees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nome"
            }
        ));
        table_Employees.setGridColor(new java.awt.Color(204, 204, 204));
        Table_Employees.setViewportView(table_Employees);

        Card_Employees.add(Table_Employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 190, 310));

        btnSaveEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSaveEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarEscuro.png"))); // NOI18N
        btnSaveEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveEmployeeMouseClicked(evt);
            }
        });
        Card_Employees.add(btnSaveEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 38));

        btnEditEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cadastrar.png"))); // NOI18N
        btnEditEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditEmployeeMouseClicked(evt);
            }
        });
        Card_Employees.add(btnEditEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, 38));

        btnDeleteEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDeleteEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluir.png"))); // NOI18N
        btnDeleteEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteEmployeeMouseClicked(evt);
            }
        });
        Card_Employees.add(btnDeleteEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, 38));

        Panel_Employees.setBackground(new java.awt.Color(255, 255, 255));

        Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Name.setText("NOME");

        txtEmployeeName.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeNameActionPerformed(evt);
            }
        });

        BirthDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BirthDate.setText("DATA NASC.");

        Address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Address.setText("ENDEREÇO");

        AdditionalAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AdditionalAddress.setText("COMPLEMENTO");

        Job.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Job.setText("CARGO");

        CPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CPF.setText("CPF");

        Neighbourhood.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Neighbourhood.setText("BAIRRO");

        txtEmployeeBirthDate.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmployeeBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeBirthDateActionPerformed(evt);
            }
        });

        txtEmployeeCPF.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        State.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        State.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        State.setText("UF");

        CEP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CEP.setText("CEP");

        HouseNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HouseNumber.setText("Nº");

        txtEmployeeCEP01.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeCEP01.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmployeeCEP01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeCEP01ActionPerformed(evt);
            }
        });

        txtEmployeeCEP02.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeCEP02.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmployeeCEP02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeCEP02ActionPerformed(evt);
            }
        });

        CPFSeparator.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CPFSeparator.setText("-");

        txtEmployeeAddress.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmployeeAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeAddressActionPerformed(evt);
            }
        });

        City.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        City.setText("CIDADE");

        txtEmployeeAddAddress.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeAddAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEmployeeCity.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeCity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEmployeeState.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeState.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEmployeeAddressNum.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeAddressNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Phone.setText("TELEFONE");

        txtEmployeeJob.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeJob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEmployeePhone.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeePhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Email.setText("E-MAIL");

        txtEmployeeEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEmployeeNeigh.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeNeigh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout Panel_EmployeesLayout = new javax.swing.GroupLayout(Panel_Employees);
        Panel_Employees.setLayout(Panel_EmployeesLayout);
        Panel_EmployeesLayout.setHorizontalGroup(
            Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addComponent(Name)
                        .addGap(68, 68, 68)
                        .addComponent(txtEmployeeName))
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addComponent(BirthDate)
                        .addGap(32, 32, 32)
                        .addComponent(txtEmployeeBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CPF)
                        .addGap(6, 6, 6)
                        .addComponent(txtEmployeeCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Job)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmployeeJob))
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addComponent(Phone)
                        .addGap(46, 46, 46)
                        .addComponent(txtEmployeePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmployeeEmail))
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addComponent(CEP)
                        .addGap(85, 85, 85)
                        .addComponent(txtEmployeeCEP01, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(CPFSeparator)
                        .addGap(6, 6, 6)
                        .addComponent(txtEmployeeCEP02, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addComponent(Address)
                        .addGap(40, 40, 40)
                        .addComponent(txtEmployeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(HouseNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmployeeAddressNum))
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addComponent(AdditionalAddress)
                        .addGap(6, 6, 6)
                        .addComponent(txtEmployeeAddAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Neighbourhood)
                        .addGap(6, 6, 6)
                        .addComponent(txtEmployeeNeigh, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addComponent(City)
                        .addGap(60, 60, 60)
                        .addComponent(txtEmployeeCity, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtEmployeeState, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        Panel_EmployeesLayout.setVerticalGroup(
            Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Name))
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmployeeBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BirthDate)
                            .addComponent(CPF)
                            .addComponent(Job))))
                .addGap(31, 31, 31)
                .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmployeePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Phone)
                            .addComponent(Email))))
                .addGap(18, 18, 18)
                .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmployeeCEP01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeCEP02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CEP)
                            .addComponent(CPFSeparator))))
                .addGap(18, 18, 18)
                .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmployeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeAddressNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Address)
                            .addComponent(HouseNumber))))
                .addGap(16, 16, 16)
                .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmployeeAddAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeNeigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdditionalAddress)
                            .addComponent(Neighbourhood))))
                .addGap(18, 18, 18)
                .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmployeeCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_EmployeesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(Panel_EmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(City)
                            .addComponent(State)))))
        );

        Card_Employees.add(Panel_Employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 870, 450));

        CollectionCard.add(Card_Employees, "cardEmployees");

        Card_Customers.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CARD CUSTOMERS");

        javax.swing.GroupLayout Card_CustomersLayout = new javax.swing.GroupLayout(Card_Customers);
        Card_Customers.setLayout(Card_CustomersLayout);
        Card_CustomersLayout.setHorizontalGroup(
            Card_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card_CustomersLayout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(713, Short.MAX_VALUE))
        );
        Card_CustomersLayout.setVerticalGroup(
            Card_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card_CustomersLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(463, Short.MAX_VALUE))
        );

        CollectionCard.add(Card_Customers, "cardCustomers");

        Card_Settings.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CARD SETTINGS");

        javax.swing.GroupLayout Card_SettingsLayout = new javax.swing.GroupLayout(Card_Settings);
        Card_Settings.setLayout(Card_SettingsLayout);
        Card_SettingsLayout.setHorizontalGroup(
            Card_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card_SettingsLayout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(713, Short.MAX_VALUE))
        );
        Card_SettingsLayout.setVerticalGroup(
            Card_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card_SettingsLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(463, Short.MAX_VALUE))
        );

        CollectionCard.add(Card_Settings, "cardSettings");

        Card_Sales.setBackground(new java.awt.Color(255, 255, 255));

        btn_NewSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarEscuro.png"))); // NOI18N
        btn_NewSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NewSaleMouseClicked(evt);
            }
        });

        btn_SearchSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pesquisar.png"))); // NOI18N
        btn_SearchSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SearchSaleMouseClicked(evt);
            }
        });

        btn_CleanSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_limparClaro.png"))); // NOI18N
        btn_CleanSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CleanSearchMouseClicked(evt);
            }
        });

        btn_DeleteSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluir.png"))); // NOI18N
        btn_DeleteSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DeleteSaleMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 81, 233));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HISTÓRICO DE VENDAS");

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", null},
                {"", "", "", "", null},
                {"", "", "", "", null},
                {"", "", "", "", null},
                {"", "", "", "", null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código da Venda", "CPF Cliente", "Total", "Vendedor", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        salesTable.setGridColor(new java.awt.Color(204, 204, 204));
        salesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(salesTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Card_SalesLayout = new javax.swing.GroupLayout(Card_Sales);
        Card_Sales.setLayout(Card_SalesLayout);
        Card_SalesLayout.setHorizontalGroup(
            Card_SalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card_SalesLayout.createSequentialGroup()
                .addGroup(Card_SalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Card_SalesLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(Card_SalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Card_SalesLayout.createSequentialGroup()
                                .addComponent(searchSale, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_SearchSale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_CleanSearch))
                            .addGroup(Card_SalesLayout.createSequentialGroup()
                                .addComponent(btn_NewSale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_DeleteSale))))
                    .addGroup(Card_SalesLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        Card_SalesLayout.setVerticalGroup(
            Card_SalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card_SalesLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(Card_SalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_NewSale)
                    .addComponent(btn_DeleteSale))
                .addGap(18, 18, 18)
                .addGroup(Card_SalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_SearchSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_CleanSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchSale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        CollectionCard.add(Card_Sales, "cardSales");

        Body.setRightComponent(CollectionCard);

        getContentPane().add(Body, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseMouseEntered
        // color red
        pnl_Close.setBackground(new Color(232, 17, 35));
    }//GEN-LAST:event_btn_CloseMouseEntered

    private void btn_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseMouseExited
        // color original
        resetDefaultColor(pnl_Close);
    }//GEN-LAST:event_btn_CloseMouseExited

    private void btn_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseMouseClicked
        // Close
        int op;
        op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if(op == 0){
            DB.close();
            System.exit(0);
        }        
    }//GEN-LAST:event_btn_CloseMouseClicked

    private void btn_MaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MaxMouseEntered
        setDefaultColor(pnl_Max);
    }//GEN-LAST:event_btn_MaxMouseEntered

    private void btn_MaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MaxMouseExited
        resetDefaultColor(pnl_Max);
    }//GEN-LAST:event_btn_MaxMouseExited

    private void btn_MaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MaxMouseClicked
        // Max
        if(this.getExtendedState() != Home.MAXIMIZED_BOTH){
            this.setExtendedState(Home.MAXIMIZED_BOTH);
        }else{
            this.setExtendedState(Home.NORMAL);
        }
    
    }//GEN-LAST:event_btn_MaxMouseClicked

    private void btn_MinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinMouseEntered
        setDefaultColor(pnl_Min);
    }//GEN-LAST:event_btn_MinMouseEntered

    private void btn_MinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinMouseExited
        resetDefaultColor(pnl_Min);
    }//GEN-LAST:event_btn_MinMouseExited

    private void btn_MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinMouseClicked
        // Min
        this.setExtendedState(Home.ICONIFIED);
    }//GEN-LAST:event_btn_MinMouseClicked

    private void btn_ShowHideMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ShowHideMenuMouseEntered
        setDefaultColor(pnl_IconMenu);
    }//GEN-LAST:event_btn_ShowHideMenuMouseEntered

    private void btn_ShowHideMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ShowHideMenuMouseExited
        resetDefaultColor(pnl_IconMenu);
    }//GEN-LAST:event_btn_ShowHideMenuMouseExited

    private void btn_ShowHideMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ShowHideMenuMouseClicked
        if(bool == true){
            changeSizeHead(pnl_HeaderMenu, new Dimension(70, pnl_HeaderMenu.getHeight()));
            changeSizeMenu(Body, 70);
            SwingUtilities.updateComponentTreeUI(this);
            bool = false;
        }else{
            changeSizeHead(pnl_HeaderMenu, new Dimension(200, pnl_HeaderMenu.getHeight()));
            changeSizeMenu(Body, 200);
            SwingUtilities.updateComponentTreeUI(this);
            bool = true;
        }
        
    }//GEN-LAST:event_btn_ShowHideMenuMouseClicked

    private void btn_addProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addProductMouseClicked
      new Register_Or_Insert(this, true).setVisible(true);
      refreshProductsTable();
    }//GEN-LAST:event_btn_addProductMouseClicked

    private void btn_removeProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeProductMouseClicked
        int row = table_Products.getSelectedRow();
        
        if (row > -1) {
            DefaultTableModel dtm = (DefaultTableModel) table_Products.getModel();
            NitriteId id = (NitriteId) dtm.getValueAt(row, 0);
            
            int op;
            op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover esse produto?",
                    "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if(op == 0){
                ProductDao.removeById(id);
                refreshProductsTable();
            } 
        }
    }//GEN-LAST:event_btn_removeProductMouseClicked

    private void btn_editProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editProductMouseClicked
        new Register_New_Products(this, true).setVisible(true);
    }//GEN-LAST:event_btn_editProductMouseClicked

    private void btnSaveEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveEmployeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveEmployeeMouseClicked

    private void btnEditEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditEmployeeMouseClicked
        new Register_New_Employee(this, true).setVisible(true);
    }//GEN-LAST:event_btnEditEmployeeMouseClicked

    private void btnDeleteEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteEmployeeMouseClicked

    private void txtEmployeeCEP02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeCEP02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeCEP02ActionPerformed

    private void txtEmployeeCEP01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeCEP01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeCEP01ActionPerformed

    private void txtEmployeeAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeAddressActionPerformed

    private void txtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameActionPerformed

    private void txtEmployeeBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeBirthDateActionPerformed

    private void btn_NewSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewSaleMouseClicked

    }//GEN-LAST:event_btn_NewSaleMouseClicked

    private void btn_SearchSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchSaleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SearchSaleMouseClicked

    private void btn_CleanSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CleanSearchMouseClicked
        searchSale.setText("");
    }//GEN-LAST:event_btn_CleanSearchMouseClicked

    private void btn_DeleteSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DeleteSaleMouseClicked
        int del;
        del = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir registro de venda?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(del == 0){
            } 
    }//GEN-LAST:event_btn_DeleteSaleMouseClicked

    private void menu_saleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_saleMouseClicked
        panelsCardLayout.show(CollectionCard, "cardSales");
        setMenuButtonsColor(menu_sale);
    }//GEN-LAST:event_menu_saleMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
  
    private void salesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesTableMouseClicked
       new Sale_Information().setVisible(true);
    }//GEN-LAST:event_salesTableMouseClicked

    private void menu_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_homeMouseClicked
        panelsCardLayout.show(CollectionCard, "cardHome");
        setMenuButtonsColor(menu_home);
    }//GEN-LAST:event_menu_homeMouseClicked

    private void menu_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_productMouseClicked
        panelsCardLayout.show(CollectionCard, "cardProducts");
        setMenuButtonsColor(menu_product);
        
        refreshProductsTable();
    }//GEN-LAST:event_menu_productMouseClicked

    private void menu_employeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_employeesMouseClicked
        panelsCardLayout.show(CollectionCard, "cardEmployees");
        setMenuButtonsColor(menu_employees);
    }//GEN-LAST:event_menu_employeesMouseClicked

    private void menu_customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_customersMouseClicked
        panelsCardLayout.show(CollectionCard, "cardCustomers");
        setMenuButtonsColor(menu_customers);
    }//GEN-LAST:event_menu_customersMouseClicked

    private void menu_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_settingsMouseClicked
        panelsCardLayout.show(CollectionCard, "cardSettings");
        setMenuButtonsColor(menu_settings);
    }//GEN-LAST:event_menu_settingsMouseClicked

    private void btn_addProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addProductMouseEntered
        // Trocar para o ícone escuro
        btn_addProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarEscuro.png")));
    }//GEN-LAST:event_btn_addProductMouseEntered

    private void btn_addProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addProductMouseExited
        // Voltar para o ícone original
        btn_addProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarClaro.png")));
    }//GEN-LAST:event_btn_addProductMouseExited

    private void btn_editProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editProductMouseEntered
        // Trocar para o ícone escuro
        btn_editProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_EditarEscuro.png"))); 
    }//GEN-LAST:event_btn_editProductMouseEntered

    private void btn_editProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editProductMouseExited
        // Voltar para o ícone original
        btn_editProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_Editar.png"))); 
    }//GEN-LAST:event_btn_editProductMouseExited

    private void btn_removeProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeProductMouseEntered
        // Trocar para o ícone escuro
        btn_removeProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluir.png")));
    }//GEN-LAST:event_btn_removeProductMouseEntered

    private void btn_removeProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeProductMouseExited
        // Voltar para o ícone original
        btn_removeProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluirClaro.png")));
    }//GEN-LAST:event_btn_removeProductMouseExited

    private void btn_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SearchMouseClicked

    private void btn_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchMouseEntered
        // Trocar para o ícone escuro:
        btn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pesquisar.png")));
    }//GEN-LAST:event_btn_SearchMouseEntered

    private void btn_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchMouseExited
       // Voltar para o ícone original
       btn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pesquisarClaro.png")));
    }//GEN-LAST:event_btn_SearchMouseExited

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(!DB.isClosed()) DB.close();
    }//GEN-LAST:event_formWindowClosed


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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdditionalAddress;
    private javax.swing.JLabel Address;
    private javax.swing.JLabel BirthDate;
    private javax.swing.JSplitPane Body;
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel CPFSeparator;
    private javax.swing.JPanel Card_Customers;
    private javax.swing.JPanel Card_Employees;
    private javax.swing.JPanel Card_Home;
    private javax.swing.JPanel Card_Products;
    private javax.swing.JPanel Card_Sales;
    private javax.swing.JPanel Card_Settings;
    private javax.swing.JLabel City;
    private javax.swing.JPanel CollectionCard;
    private javax.swing.JLabel Email;
    private javax.swing.JPanel Head;
    private javax.swing.JLabel HouseNumber;
    private javax.swing.JLabel Job;
    private javax.swing.JPanel MaxMinClose;
    private javax.swing.JPanel Menus;
    private javax.swing.JPanel Mid_Header;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Neighbourhood;
    private javax.swing.JPanel Panel_Employees;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel State;
    private javax.swing.JScrollPane Table_Employees;
    private javax.swing.JLabel btnDeleteEmployee;
    private javax.swing.JLabel btnEditEmployee;
    private javax.swing.JLabel btnSaveEmployee;
    private javax.swing.JLabel btn_CleanSearch;
    private javax.swing.JLabel btn_Close;
    private javax.swing.JLabel btn_DeleteSale;
    private javax.swing.JLabel btn_Max;
    private javax.swing.JLabel btn_Min;
    private javax.swing.JLabel btn_NewSale;
    private javax.swing.JLabel btn_Search;
    private javax.swing.JLabel btn_SearchSale;
    private javax.swing.JLabel btn_ShowHideMenu;
    private javax.swing.JLabel btn_addProduct;
    private javax.swing.JLabel btn_customers;
    private javax.swing.JLabel btn_editProduct;
    private javax.swing.JLabel btn_employees;
    private javax.swing.JLabel btn_home;
    private javax.swing.JLabel btn_products;
    private javax.swing.JLabel btn_removeProduct;
    private javax.swing.JLabel btn_sales;
    private javax.swing.JLabel btn_settings;
    private javax.swing.JLabel icon_customers;
    private javax.swing.JLabel icon_employees;
    private javax.swing.JLabel icon_home;
    private javax.swing.JLabel icon_products;
    private javax.swing.JLabel icon_sales;
    private javax.swing.JLabel icon_settings;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel menu_customers;
    private javax.swing.JPanel menu_employees;
    private javax.swing.JPanel menu_home;
    private javax.swing.JPanel menu_product;
    private javax.swing.JPanel menu_sale;
    private javax.swing.JPanel menu_settings;
    private javax.swing.JPanel pnl_Close;
    private javax.swing.JPanel pnl_HeaderMenu;
    private javax.swing.JPanel pnl_IconMenu;
    private javax.swing.JPanel pnl_Max;
    private javax.swing.JPanel pnl_Min;
    private javax.swing.JTable salesTable;
    private javax.swing.JTextField searchSale;
    private javax.swing.JTable table_Employees;
    private javax.swing.JTable table_Products;
    private javax.swing.JTextField txtEmployeeAddAddress;
    private javax.swing.JTextField txtEmployeeAddress;
    private javax.swing.JTextField txtEmployeeAddressNum;
    private javax.swing.JTextField txtEmployeeBirthDate;
    private javax.swing.JTextField txtEmployeeCEP01;
    private javax.swing.JTextField txtEmployeeCEP02;
    private javax.swing.JTextField txtEmployeeCPF;
    private javax.swing.JTextField txtEmployeeCity;
    private javax.swing.JTextField txtEmployeeEmail;
    private javax.swing.JTextField txtEmployeeJob;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtEmployeeNeigh;
    private javax.swing.JTextField txtEmployeePhone;
    private javax.swing.JTextField txtEmployeeState;
    private javax.swing.JTextField txt_SearchField;
    // End of variables declaration//GEN-END:variables
}
