
package br.sistemalojaroupas.view;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.dao.EmployeeDao;
import br.sistemalojaroupas.model.dao.ProductDao;
import br.sistemalojaroupas.model.dao.SaleDao;
import br.sistemalojaroupas.model.entities.Employee;
import br.sistemalojaroupas.model.entities.Product;
import br.sistemalojaroupas.view.listeners.DataChangeListener;
import br.sistemalojaroupas.view.util.Utils;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lukas
 */
public class Home extends javax.swing.JFrame implements DataChangeListener {
    
    Boolean bool = true;
    private List<JPanel> menuButtonsList = new ArrayList<>();
    private CardLayout panelsCardLayout;
    private JTable visibleTable;
    

    
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
        
        setMenuButtonsColor(menu_home);
        
        refreshHomeData();
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
   
    public void changePaneSize(JPanel pnl, Dimension dim){
        pnl.setPreferredSize(dim);
    }
    
    @Override
    public void onDataChanged() {
        if(visibleTable == table_Products) Utils.updateTable(ProductDao.findAll(), table_Products);
    }
    
    private void setVisibleTable(JTable table) {
        this.visibleTable = table;
    }
    
    private void refreshHomeData() {
        txtTotalSales.setText(SaleDao.size().toString());
        txtFaturamentoValor.setText(String.format("R$ %.2f", SaleDao.revenues()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgButtonsHome2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        novaVenda1 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        novoProduto1 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        novoCliente1 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        buscarCliente1 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        buscarVenda1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelInformacoes = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        faturamento2 = new javax.swing.JLabel();
        faturamentoValor2 = new javax.swing.JLabel();
        iconeFaturamento2 = new javax.swing.JLabel();
        fundoFaturamento2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        faturamento3 = new javax.swing.JLabel();
        faturamentoValor3 = new javax.swing.JLabel();
        iconeFaturamento3 = new javax.swing.JLabel();
        fundoFaturamento6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        faturamento4 = new javax.swing.JLabel();
        faturamentoValor4 = new javax.swing.JLabel();
        iconeFaturamento4 = new javax.swing.JLabel();
        fundoFaturamento7 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        faturamento5 = new javax.swing.JLabel();
        faturamentoValor5 = new javax.swing.JLabel();
        iconeFaturamento5 = new javax.swing.JLabel();
        fundoFaturamento8 = new javax.swing.JLabel();
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
        pnMenu = new javax.swing.JPanel();
        menu_home = new javax.swing.JPanel();
        btn_home = new javax.swing.JLabel();
        icon_home = new javax.swing.JLabel();
        menu_sale = new javax.swing.JPanel();
        btn_sales = new javax.swing.JLabel();
        icon_sales = new javax.swing.JLabel();
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
        iconeOcultar1 = new javax.swing.JLabel();
        txtBemVindo1 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        panelInformacoes1 = new javax.swing.JPanel();
        pnFaturamento = new javax.swing.JPanel();
        txtFaturamento = new javax.swing.JLabel();
        txtFaturamentoValor = new javax.swing.JLabel();
        iconFaturamento = new javax.swing.JLabel();
        fundoFaturamento = new javax.swing.JLabel();
        pnReceita = new javax.swing.JPanel();
        txtReceita = new javax.swing.JLabel();
        txtReceitaValor = new javax.swing.JLabel();
        iconReceita = new javax.swing.JLabel();
        fundoReceita = new javax.swing.JLabel();
        pnVendas = new javax.swing.JPanel();
        txtVendas = new javax.swing.JLabel();
        txtTotalSales = new javax.swing.JLabel();
        iconVendas = new javax.swing.JLabel();
        fundoVendas = new javax.swing.JLabel();
        pnTicket = new javax.swing.JPanel();
        txtTicket = new javax.swing.JLabel();
        txtTicketValor = new javax.swing.JLabel();
        iconTicket = new javax.swing.JLabel();
        fundoTicket = new javax.swing.JLabel();
        bgButtonsHome = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        novaVenda2 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        novoProduto2 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        novoCliente2 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        buscarCliente2 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        buscarVenda2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Card_Sales = new javax.swing.JPanel();
        btn_NewSale = new javax.swing.JLabel();
        btn_SearchSale = new javax.swing.JLabel();
        searchSale = new javax.swing.JTextField();
        btn_DeleteSale = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSales = new javax.swing.JTable();
        Card_Products = new javax.swing.JPanel();
        btn_editProduct = new javax.swing.JLabel();
        btn_removeProduct = new javax.swing.JLabel();
        btn_addProduct = new javax.swing.JLabel();
        txtProductsSearchField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Products = new javax.swing.JTable();
        btn_SearchProducts = new javax.swing.JLabel();
        Card_Employees = new javax.swing.JPanel();
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
        jLabel34 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        Table_Employees = new javax.swing.JScrollPane();
        table_Employees = new javax.swing.JTable();
        Card_Customers = new javax.swing.JPanel();
        btn_Deletec = new javax.swing.JLabel();
        btn_Searchc = new javax.swing.JLabel();
        btn_Addc = new javax.swing.JLabel();
        cSearchCustomer = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCustomers = new javax.swing.JTable();
        btn_Editc = new javax.swing.JLabel();
        Card_Settings = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();

        bgButtonsHome2.setBackground(new java.awt.Color(0,0,0,0));
        bgButtonsHome2.setForeground(new java.awt.Color(51, 51, 51));
        bgButtonsHome2.setOpaque(false);
        bgButtonsHome2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0,0,0,0));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        novaVenda1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        novaVenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_novaVenda.png"))); // NOI18N
        novaVenda1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        novaVenda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                novaVenda1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                novaVenda1MouseExited(evt);
            }
        });
        jPanel5.add(novaVenda1);

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator11.setPreferredSize(new java.awt.Dimension(3, 180));
        jPanel5.add(jSeparator11);

        novoProduto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_novoProduto.png"))); // NOI18N
        novoProduto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                novoProduto1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                novoProduto1MouseExited(evt);
            }
        });
        jPanel5.add(novoProduto1);

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator12.setPreferredSize(new java.awt.Dimension(3, 180));
        jPanel5.add(jSeparator12);

        novoCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_novoCliente.png"))); // NOI18N
        novoCliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                novoCliente1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                novoCliente1MouseExited(evt);
            }
        });
        jPanel5.add(novoCliente1);

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator13.setPreferredSize(new java.awt.Dimension(3, 180));
        jPanel5.add(jSeparator13);

        buscarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_buscarCliente.png"))); // NOI18N
        buscarCliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarCliente1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarCliente1MouseExited(evt);
            }
        });
        jPanel5.add(buscarCliente1);

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator14.setPreferredSize(new java.awt.Dimension(3, 180));
        jPanel5.add(jSeparator14);

        buscarVenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_buscarVenda.png"))); // NOI18N
        buscarVenda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarVenda1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarVenda1MouseExited(evt);
            }
        });
        jPanel5.add(buscarVenda1);

        bgButtonsHome2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1050, 280));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo_botoes_home.png"))); // NOI18N
        bgButtonsHome2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelInformacoes.setBackground(new java.awt.Color(0,0,0,0));
        panelInformacoes.setOpaque(false);
        panelInformacoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 50, 5));

        jPanel8.setBackground(new java.awt.Color(0,0,0,0));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(215, 66));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        faturamento2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        faturamento2.setForeground(new java.awt.Color(255, 255, 255));
        faturamento2.setText("Faturamento");
        jPanel8.add(faturamento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, 20));

        faturamentoValor2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        faturamentoValor2.setForeground(new java.awt.Color(255, 255, 255));
        faturamentoValor2.setText("R$ 39.482,49");
        jPanel8.add(faturamentoValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        iconeFaturamento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_dinheiro.png"))); // NOI18N
        jPanel8.add(iconeFaturamento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fundoFaturamento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo1_home.png"))); // NOI18N
        jPanel8.add(fundoFaturamento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelInformacoes.add(jPanel8);

        jPanel12.setBackground(new java.awt.Color(0,0,0,0));
        jPanel12.setOpaque(false);
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        faturamento3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        faturamento3.setForeground(new java.awt.Color(255, 255, 255));
        faturamento3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        faturamento3.setText("Receita líquida");
        jPanel12.add(faturamento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        faturamentoValor3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        faturamentoValor3.setForeground(new java.awt.Color(255, 255, 255));
        faturamentoValor3.setText("R$ 3.482,49");
        jPanel12.add(faturamentoValor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        iconeFaturamento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cifrão.png"))); // NOI18N
        jPanel12.add(iconeFaturamento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fundoFaturamento6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo2_home.png"))); // NOI18N
        jPanel12.add(fundoFaturamento6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelInformacoes.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(0,0,0,0));
        jPanel13.setOpaque(false);
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        faturamento4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        faturamento4.setForeground(new java.awt.Color(255, 255, 255));
        faturamento4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        faturamento4.setText("Total de vendas");
        jPanel13.add(faturamento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        faturamentoValor4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        faturamentoValor4.setForeground(new java.awt.Color(255, 255, 255));
        faturamentoValor4.setText("986");
        jPanel13.add(faturamentoValor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        iconeFaturamento4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_carrinhoDeCompras.png"))); // NOI18N
        jPanel13.add(iconeFaturamento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fundoFaturamento7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo3_home.png"))); // NOI18N
        jPanel13.add(fundoFaturamento7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelInformacoes.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(0,0,0,0));
        jPanel14.setOpaque(false);
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        faturamento5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        faturamento5.setForeground(new java.awt.Color(255, 255, 255));
        faturamento5.setText("Ticket médio");
        jPanel14.add(faturamento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        faturamentoValor5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        faturamentoValor5.setForeground(new java.awt.Color(255, 255, 255));
        faturamentoValor5.setText("R$ 482,50");
        jPanel14.add(faturamentoValor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        iconeFaturamento5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_ticket.png"))); // NOI18N
        jPanel14.add(iconeFaturamento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        fundoFaturamento8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo4_home.png"))); // NOI18N
        jPanel14.add(fundoFaturamento8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelInformacoes.add(jPanel14);

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

        pnMenu.setBackground(new java.awt.Color(0, 0, 51));
        pnMenu.setMinimumSize(new java.awt.Dimension(70, 100));
        pnMenu.setPreferredSize(new java.awt.Dimension(200, 650));

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

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_employees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_customers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menu_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
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
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnMenuLayout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(menu_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(490, Short.MAX_VALUE)))
        );

        getContentPane().add(pnMenu, java.awt.BorderLayout.WEST);

        CollectionCard.setMinimumSize(new java.awt.Dimension(1110, 641));
        CollectionCard.setPreferredSize(new java.awt.Dimension(1110, 641));
        CollectionCard.setLayout(new java.awt.CardLayout());

        Card_Home.setBackground(new java.awt.Color(255, 255, 255));
        Card_Home.setPreferredSize(new java.awt.Dimension(1110, 583));

        iconeOcultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_olhoFechar.png"))); // NOI18N

        txtBemVindo1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtBemVindo1.setForeground(new java.awt.Color(29, 73, 153));
        txtBemVindo1.setText("  Olá, bem-vindo!");
        txtBemVindo1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 0, 0, new java.awt.Color(0, 0, 51)));

        panelInformacoes1.setBackground(new java.awt.Color(0,0,0,0));
        panelInformacoes1.setOpaque(false);
        panelInformacoes1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 50, 5));

        pnFaturamento.setBackground(new java.awt.Color(0,0,0,0));
        pnFaturamento.setOpaque(false);
        pnFaturamento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFaturamento.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtFaturamento.setForeground(new java.awt.Color(255, 255, 255));
        txtFaturamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFaturamento.setText("Faturamento");
        pnFaturamento.add(txtFaturamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, 20));

        txtFaturamentoValor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtFaturamentoValor.setForeground(new java.awt.Color(255, 255, 255));
        txtFaturamentoValor.setText("R$ 39.482,49");
        pnFaturamento.add(txtFaturamentoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        iconFaturamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_dinheiro.png"))); // NOI18N
        pnFaturamento.add(iconFaturamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fundoFaturamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo1_home.png"))); // NOI18N
        pnFaturamento.add(fundoFaturamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelInformacoes1.add(pnFaturamento);

        pnReceita.setBackground(new java.awt.Color(0,0,0,0));
        pnReceita.setOpaque(false);
        pnReceita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtReceita.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtReceita.setForeground(new java.awt.Color(255, 255, 255));
        txtReceita.setText("Receita líquida");
        pnReceita.add(txtReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        txtReceitaValor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtReceitaValor.setForeground(new java.awt.Color(255, 255, 255));
        txtReceitaValor.setText("R$ 3.482,49");
        pnReceita.add(txtReceitaValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        iconReceita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cifrão.png"))); // NOI18N
        pnReceita.add(iconReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fundoReceita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo2_home.png"))); // NOI18N
        pnReceita.add(fundoReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelInformacoes1.add(pnReceita);

        pnVendas.setBackground(new java.awt.Color(0,0,0,0));
        pnVendas.setOpaque(false);
        pnVendas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtVendas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtVendas.setForeground(new java.awt.Color(255, 255, 255));
        txtVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVendas.setText("Total de vendas");
        pnVendas.add(txtVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        txtTotalSales.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtTotalSales.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalSales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalSales.setText("986");
        pnVendas.add(txtTotalSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 10, 100, -1));

        iconVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_carrinhoDeCompras.png"))); // NOI18N
        pnVendas.add(iconVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fundoVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo3_home.png"))); // NOI18N
        pnVendas.add(fundoVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelInformacoes1.add(pnVendas);

        pnTicket.setBackground(new java.awt.Color(0,0,0,0));
        pnTicket.setOpaque(false);
        pnTicket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTicket.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTicket.setForeground(new java.awt.Color(255, 255, 255));
        txtTicket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTicket.setText("Ticket médio");
        pnTicket.add(txtTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, 20));

        txtTicketValor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtTicketValor.setForeground(new java.awt.Color(255, 255, 255));
        txtTicketValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTicketValor.setText("R$ 482,50");
        pnTicket.add(txtTicketValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 100, -1));

        iconTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_ticket.png"))); // NOI18N
        pnTicket.add(iconTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        fundoTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo4_home.png"))); // NOI18N
        pnTicket.add(fundoTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelInformacoes1.add(pnTicket);

        bgButtonsHome.setBackground(new java.awt.Color(0,0,0,0));
        bgButtonsHome.setForeground(new java.awt.Color(51, 51, 51));
        bgButtonsHome.setMaximumSize(new java.awt.Dimension(1900, 1080));
        bgButtonsHome.setOpaque(false);
        bgButtonsHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0,0,0,0));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        novaVenda2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        novaVenda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_novaVenda.png"))); // NOI18N
        novaVenda2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        novaVenda2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                novaVenda2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                novaVenda2MouseExited(evt);
            }
        });
        jPanel6.add(novaVenda2);

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator15.setPreferredSize(new java.awt.Dimension(3, 180));
        jPanel6.add(jSeparator15);

        novoProduto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_novoProduto.png"))); // NOI18N
        novoProduto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                novoProduto2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                novoProduto2MouseExited(evt);
            }
        });
        jPanel6.add(novoProduto2);

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator16.setPreferredSize(new java.awt.Dimension(3, 180));
        jPanel6.add(jSeparator16);

        novoCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_novoCliente.png"))); // NOI18N
        novoCliente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                novoCliente2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                novoCliente2MouseExited(evt);
            }
        });
        jPanel6.add(novoCliente2);

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator17.setPreferredSize(new java.awt.Dimension(3, 180));
        jPanel6.add(jSeparator17);

        buscarCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_buscarCliente.png"))); // NOI18N
        buscarCliente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarCliente2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarCliente2MouseExited(evt);
            }
        });
        jPanel6.add(buscarCliente2);

        jSeparator18.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator18.setPreferredSize(new java.awt.Dimension(3, 180));
        jPanel6.add(jSeparator18);

        buscarVenda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_buscarVenda.png"))); // NOI18N
        buscarVenda2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarVenda2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarVenda2MouseExited(evt);
            }
        });
        jPanel6.add(buscarVenda2);

        bgButtonsHome.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1050, 280));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo_botoes_home.png"))); // NOI18N
        bgButtonsHome.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout Card_HomeLayout = new javax.swing.GroupLayout(Card_Home);
        Card_Home.setLayout(Card_HomeLayout);
        Card_HomeLayout.setHorizontalGroup(
            Card_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card_HomeLayout.createSequentialGroup()
                .addGroup(Card_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Card_HomeLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtBemVindo1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Card_HomeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Card_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelInformacoes1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bgButtonsHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconeOcultar1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Card_HomeLayout.setVerticalGroup(
            Card_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card_HomeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtBemVindo1)
                .addGap(25, 25, 25)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconeOcultar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInformacoes1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(bgButtonsHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CollectionCard.add(Card_Home, "cardHome");

        Card_Sales.setBackground(new java.awt.Color(255, 255, 255));
        Card_Sales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_NewSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarClaro.png"))); // NOI18N
        btn_NewSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NewSaleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewSaleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewSaleMouseExited(evt);
            }
        });
        Card_Sales.add(btn_NewSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 174, -1, -1));

        btn_SearchSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pesquisarClaro.png"))); // NOI18N
        btn_SearchSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SearchSaleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SearchSaleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SearchSaleMouseExited(evt);
            }
        });
        Card_Sales.add(btn_SearchSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(943, 174, -1, -1));
        Card_Sales.add(searchSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 174, 623, 30));

        btn_DeleteSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluirClaro.png"))); // NOI18N
        btn_DeleteSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DeleteSaleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DeleteSaleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DeleteSaleMouseExited(evt);
            }
        });
        Card_Sales.add(btn_DeleteSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 174, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 51));
        jLabel32.setText(" Vendas");
        jLabel32.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(108, 81, 233)));
        Card_Sales.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 19, 100, -1));
        Card_Sales.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 59, 1060, 10));

        tableSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código da Venda", "Total", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSales.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(tableSales);

        Card_Sales.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 214, 961, 342));

        CollectionCard.add(Card_Sales, "cardSales");

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
        Card_Products.add(btn_editProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 174, -1, -1));

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
        Card_Products.add(btn_removeProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 174, -1, -1));

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
        Card_Products.add(btn_addProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 174, -1, -1));

        txtProductsSearchField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtProductsSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductsSearchFieldKeyPressed(evt);
            }
        });
        Card_Products.add(txtProductsSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 174, 540, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText(" Produtos");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(108, 81, 233)));
        Card_Products.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 19, 100, -1));
        Card_Products.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 59, 1060, 10));

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
                "Cód.", "Descrição", "Cor", "Tamanho", "Categoria", "P. Custo", "P. Venda", "Qtd.", "Data entrada"
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
            table_Products.getColumnModel().getColumn(0).setMinWidth(25);
            table_Products.getColumnModel().getColumn(0).setPreferredWidth(50);
            table_Products.getColumnModel().getColumn(0).setMaxWidth(75);
            table_Products.getColumnModel().getColumn(1).setMinWidth(150);
            table_Products.getColumnModel().getColumn(1).setPreferredWidth(220);
            table_Products.getColumnModel().getColumn(1).setMaxWidth(300);
            table_Products.getColumnModel().getColumn(2).setMinWidth(60);
            table_Products.getColumnModel().getColumn(2).setPreferredWidth(80);
            table_Products.getColumnModel().getColumn(2).setMaxWidth(100);
            table_Products.getColumnModel().getColumn(3).setMinWidth(60);
            table_Products.getColumnModel().getColumn(3).setPreferredWidth(80);
            table_Products.getColumnModel().getColumn(3).setMaxWidth(100);
            table_Products.getColumnModel().getColumn(4).setMinWidth(100);
            table_Products.getColumnModel().getColumn(4).setPreferredWidth(130);
            table_Products.getColumnModel().getColumn(4).setMaxWidth(180);
            table_Products.getColumnModel().getColumn(5).setMinWidth(60);
            table_Products.getColumnModel().getColumn(5).setPreferredWidth(80);
            table_Products.getColumnModel().getColumn(5).setMaxWidth(100);
            table_Products.getColumnModel().getColumn(6).setMinWidth(60);
            table_Products.getColumnModel().getColumn(6).setPreferredWidth(80);
            table_Products.getColumnModel().getColumn(6).setMaxWidth(100);
            table_Products.getColumnModel().getColumn(7).setMinWidth(25);
            table_Products.getColumnModel().getColumn(7).setPreferredWidth(40);
            table_Products.getColumnModel().getColumn(7).setMaxWidth(60);
            table_Products.getColumnModel().getColumn(8).setMinWidth(80);
            table_Products.getColumnModel().getColumn(8).setPreferredWidth(80);
            table_Products.getColumnModel().getColumn(8).setMaxWidth(100);
        }

        Card_Products.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 214, 983, 338));

        btn_SearchProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_SearchProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pesquisarClaro.png"))); // NOI18N
        btn_SearchProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SearchProductsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SearchProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SearchProductsMouseExited(evt);
            }
        });
        Card_Products.add(btn_SearchProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 174, -1, -1));

        CollectionCard.add(Card_Products, "cardProducts");

        Card_Employees.setBackground(new java.awt.Color(255, 255, 255));
        Card_Employees.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSaveEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSaveEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarClaro.png"))); // NOI18N
        btnSaveEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveEmployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveEmployeeMouseExited(evt);
            }
        });
        Card_Employees.add(btnSaveEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 38));

        btnEditEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_Editar.png"))); // NOI18N
        btnEditEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditEmployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditEmployeeMouseExited(evt);
            }
        });
        Card_Employees.add(btnEditEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, 38));

        btnDeleteEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDeleteEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluirClaro.png"))); // NOI18N
        btnDeleteEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteEmployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteEmployeeMouseExited(evt);
            }
        });
        Card_Employees.add(btnDeleteEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 38));

        Panel_Employees.setBackground(new java.awt.Color(255, 255, 255));

        Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Name.setText("NOME");

        txtEmployeeName.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        txtEmployeeCEP02.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeCEP02.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        CPFSeparator.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CPFSeparator.setText("-");

        txtEmployeeAddress.setBackground(new java.awt.Color(204, 204, 204));
        txtEmployeeAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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
                        .addComponent(txtEmployeeState, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 233, Short.MAX_VALUE))
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
                            .addComponent(State))))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        Card_Employees.add(Panel_Employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 870, 370));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 51));
        jLabel34.setText(" Funcionários");
        jLabel34.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(108, 81, 233)));
        Card_Employees.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, -1));
        Card_Employees.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 1060, 10));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(108, 81, 233));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("FUNCIONÁRIOS");
        Card_Employees.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 190, 47));

        table_Employees.setForeground(new java.awt.Color(0, 0, 51));
        table_Employees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CPF", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Employees.setGridColor(new java.awt.Color(204, 204, 204));
        Table_Employees.setViewportView(table_Employees);
        if (table_Employees.getColumnModel().getColumnCount() > 0) {
            table_Employees.getColumnModel().getColumn(0).setMinWidth(0);
            table_Employees.getColumnModel().getColumn(0).setPreferredWidth(0);
            table_Employees.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        Card_Employees.add(Table_Employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 220, 310));

        CollectionCard.add(Card_Employees, "cardEmployees");

        Card_Customers.setBackground(new java.awt.Color(255, 255, 255));
        Card_Customers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Deletec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluirClaro.png"))); // NOI18N
        btn_Deletec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DeletecMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DeletecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DeletecMouseExited(evt);
            }
        });
        Card_Customers.add(btn_Deletec, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, 40));

        btn_Searchc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pesquisarClaro.png"))); // NOI18N
        btn_Searchc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SearchcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SearchcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SearchcMouseExited(evt);
            }
        });
        Card_Customers.add(btn_Searchc, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 174, -1, -1));

        btn_Addc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarClaro.png"))); // NOI18N
        btn_Addc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AddcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AddcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AddcMouseExited(evt);
            }
        });
        Card_Customers.add(btn_Addc, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 174, -1, -1));
        Card_Customers.add(cSearchCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 174, 410, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 51));
        jLabel33.setText(" Clientes");
        jLabel33.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(108, 81, 233)));
        Card_Customers.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 19, 100, -1));
        Card_Customers.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 59, 1060, 10));

        tableCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Celular", "E-maill"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCustomers.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(tableCustomers);

        Card_Customers.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 214, 960, 350));

        btn_Editc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_Editar.png"))); // NOI18N
        btn_Editc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EditcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditcMouseExited(evt);
            }
        });
        Card_Customers.add(btn_Editc, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 174, -1, -1));

        CollectionCard.add(Card_Customers, "cardCustomers");

        Card_Settings.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CARD SETTINGS");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 51));
        jLabel35.setText(" Configurações");
        jLabel35.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(108, 81, 233)));

        javax.swing.GroupLayout Card_SettingsLayout = new javax.swing.GroupLayout(Card_Settings);
        Card_Settings.setLayout(Card_SettingsLayout);
        Card_SettingsLayout.setHorizontalGroup(
            Card_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card_SettingsLayout.createSequentialGroup()
                .addGroup(Card_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Card_SettingsLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Card_SettingsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Card_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Card_SettingsLayout.setVerticalGroup(
            Card_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card_SettingsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
        );

        CollectionCard.add(Card_Settings, "cardSettings");

        getContentPane().add(CollectionCard, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1310, 679));
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
            changePaneSize(pnl_HeaderMenu, new Dimension(70, pnl_HeaderMenu.getHeight()));
            changePaneSize(pnMenu, new Dimension(70, pnMenu.getHeight()));
            SwingUtilities.updateComponentTreeUI(this);
            bool = false;
        }else{
            changePaneSize(pnl_HeaderMenu, new Dimension(200, pnl_HeaderMenu.getHeight()));
            changePaneSize(pnMenu, new Dimension(200, pnMenu.getHeight()));
            SwingUtilities.updateComponentTreeUI(this);
            bool = true;
        }
        
    }//GEN-LAST:event_btn_ShowHideMenuMouseClicked

    private void btn_addProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addProductMouseClicked
        Register_And_Edit_Products dialog = new Register_And_Edit_Products(this, true);
        dialog.subscribeDataChangeListener(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_btn_addProductMouseClicked

    private void btn_removeProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeProductMouseClicked
        int row = table_Products.getSelectedRow();
        
        if (row > -1) {
            DefaultTableModel dtm = (DefaultTableModel) table_Products.getModel();
            Long id = (Long) dtm.getValueAt(row, 0);
            
            int op;
            op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover esse produto?",
                    "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if(op == 0){
                ProductDao.removeById(id);
                Utils.updateTable(ProductDao.findAll(), table_Products);
            } 
        }
    }//GEN-LAST:event_btn_removeProductMouseClicked

    private void btn_editProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editProductMouseClicked
        int selectedRow = table_Products.getSelectedRow();
        
        if (selectedRow > -1) {
            
            DefaultTableModel dtm = (DefaultTableModel) table_Products.getModel();
            
            Long id = (Long) dtm.getValueAt(selectedRow, 0);
            Product p = ProductDao.findById(id);
            
            Register_And_Edit_Products dialog = new Register_And_Edit_Products(null, true, p);
            dialog.subscribeDataChangeListener(this);
            dialog.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Você deve selecionar um produto para poder editar.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_editProductMouseClicked

    private void btnSaveEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveEmployeeMouseClicked
       new Register_And_Edit_Employee(this, true).setVisible(true);
    }//GEN-LAST:event_btnSaveEmployeeMouseClicked

    private void btnEditEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditEmployeeMouseClicked
        int selectedRow = table_Employees.getSelectedRow();
        
        if (selectedRow > -1) {
            
            DefaultTableModel dtm = (DefaultTableModel) table_Employees.getModel();
            
            String cpf = (String) dtm.getValueAt(selectedRow, 0);
            Employee emp = EmployeeDao.findByCpf(cpf);
            
            Register_And_Edit_Employee dialog = new Register_And_Edit_Employee(null, true, emp);
            dialog.subscribeDataChangeListener(this);
            dialog.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Você deve selecionar um funcionário para poder editar.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_btnEditEmployeeMouseClicked

    private void btnDeleteEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteEmployeeMouseClicked

    private void btn_NewSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewSaleMouseClicked
    new New_Sale().setVisible(true);
    }//GEN-LAST:event_btn_NewSaleMouseClicked

    private void btn_SearchSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchSaleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SearchSaleMouseClicked

    private void btn_DeleteSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DeleteSaleMouseClicked
        int del;
        del = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir registro de venda?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(del == 0){
            } 
    }//GEN-LAST:event_btn_DeleteSaleMouseClicked

    private void menu_saleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_saleMouseClicked
        panelsCardLayout.show(CollectionCard, "cardSales");
        setMenuButtonsColor(menu_sale);
        
        setVisibleTable(tableSales);
        Utils.updateTable(SaleDao.findAll(), tableSales);
    }//GEN-LAST:event_menu_saleMouseClicked
  
    private void menu_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_homeMouseClicked
        panelsCardLayout.show(CollectionCard, "cardHome");
        setMenuButtonsColor(menu_home);
        
        setVisibleTable(null);
        refreshHomeData();
    }//GEN-LAST:event_menu_homeMouseClicked

    private void menu_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_productMouseClicked
        panelsCardLayout.show(CollectionCard, "cardProducts");
        setMenuButtonsColor(menu_product);
        
        setVisibleTable(table_Products);
        Utils.updateTable(ProductDao.findAll(), table_Products);
    }//GEN-LAST:event_menu_productMouseClicked

    private void menu_employeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_employeesMouseClicked
        panelsCardLayout.show(CollectionCard, "cardEmployees");
        setMenuButtonsColor(menu_employees);
        
        setVisibleTable(table_Employees);
        Utils.updateTable(EmployeeDao.findAll(), table_Employees);
    }//GEN-LAST:event_menu_employeesMouseClicked

    private void menu_customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_customersMouseClicked
        panelsCardLayout.show(CollectionCard, "cardCustomers");
        setMenuButtonsColor(menu_customers);
        
        setVisibleTable(tableCustomers);
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

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(!DB.isClosed()) DB.close();
    }//GEN-LAST:event_formWindowClosed

    private void btn_DeletecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DeletecMouseClicked
         int ex;
        ex = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir registro de venda?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(ex == 0){
            }
    }//GEN-LAST:event_btn_DeletecMouseClicked

    private void btn_AddcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddcMouseClicked
        new Register_And_Edit_Customer(null, true).setVisible(true);
    }//GEN-LAST:event_btn_AddcMouseClicked

    private void txtProductsSearchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductsSearchFieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btn_SearchProductsMouseClicked(null);
        }
    }//GEN-LAST:event_txtProductsSearchFieldKeyPressed

    private void btn_NewSaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewSaleMouseEntered
       btn_NewSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarEscuro.png")));
    }//GEN-LAST:event_btn_NewSaleMouseEntered

    private void btn_NewSaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewSaleMouseExited
       btn_NewSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarClaro.png")));
    }//GEN-LAST:event_btn_NewSaleMouseExited

    private void btn_DeleteSaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DeleteSaleMouseEntered
       btn_DeleteSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluir.png")));
    }//GEN-LAST:event_btn_DeleteSaleMouseEntered

    private void btn_DeleteSaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DeleteSaleMouseExited
       btn_DeleteSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluirClaro.png")));
    }//GEN-LAST:event_btn_DeleteSaleMouseExited

    private void btn_SearchSaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchSaleMouseEntered
       btn_SearchSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pesquisar.png")));
    }//GEN-LAST:event_btn_SearchSaleMouseEntered

    private void btn_SearchSaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchSaleMouseExited
       btn_SearchSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pesquisarClaro.png")));
    }//GEN-LAST:event_btn_SearchSaleMouseExited

    private void btnSaveEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveEmployeeMouseEntered
       btnSaveEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarEscuro.png")));
    }//GEN-LAST:event_btnSaveEmployeeMouseEntered

    private void btnSaveEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveEmployeeMouseExited
       btnSaveEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarClaro.png")));
    }//GEN-LAST:event_btnSaveEmployeeMouseExited

    private void btnEditEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditEmployeeMouseEntered
       btnEditEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_EditarEscuro.png")));
    }//GEN-LAST:event_btnEditEmployeeMouseEntered

    private void btnEditEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditEmployeeMouseExited
       btnEditEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_Editar.png")));
    }//GEN-LAST:event_btnEditEmployeeMouseExited

    private void btnDeleteEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeMouseEntered
       btnDeleteEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluir.png")));
    }//GEN-LAST:event_btnDeleteEmployeeMouseEntered

    private void btnDeleteEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeMouseExited
       btnDeleteEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluirClaro.png")));
    }//GEN-LAST:event_btnDeleteEmployeeMouseExited

    private void btn_AddcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddcMouseEntered
        btn_Addc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarEscuro.png")));
    }//GEN-LAST:event_btn_AddcMouseEntered

    private void btn_AddcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddcMouseExited
        btn_Addc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarClaro.png")));
    }//GEN-LAST:event_btn_AddcMouseExited

    private void btn_DeletecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DeletecMouseEntered
        btn_Deletec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluir.png")));
    }//GEN-LAST:event_btn_DeletecMouseEntered

    private void btn_DeletecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DeletecMouseExited
        btn_Deletec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_excluirClaro.png")));
    }//GEN-LAST:event_btn_DeletecMouseExited

    private void btn_SearchcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchcMouseClicked
        
    }//GEN-LAST:event_btn_SearchcMouseClicked

    private void btn_SearchcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchcMouseEntered
        btn_Searchc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pesquisar.png")));
    }//GEN-LAST:event_btn_SearchcMouseEntered

    private void btn_SearchcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchcMouseExited
       btn_Searchc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pesquisarClaro.png")));
    }//GEN-LAST:event_btn_SearchcMouseExited

    private void novaVenda1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novaVenda1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_novaVenda1MouseEntered

    private void novaVenda1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novaVenda1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_novaVenda1MouseExited

    private void novoProduto1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoProduto1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_novoProduto1MouseEntered

    private void novoProduto1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoProduto1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_novoProduto1MouseExited

    private void novoCliente1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoCliente1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_novoCliente1MouseEntered

    private void novoCliente1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoCliente1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_novoCliente1MouseExited

    private void buscarCliente1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarCliente1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarCliente1MouseEntered

    private void buscarCliente1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarCliente1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarCliente1MouseExited

    private void buscarVenda1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarVenda1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarVenda1MouseEntered

    private void buscarVenda1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarVenda1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarVenda1MouseExited

    private void novaVenda2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novaVenda2MouseEntered
        novaVenda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_novaVendaAzul.png")));
    }//GEN-LAST:event_novaVenda2MouseEntered

    private void novaVenda2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novaVenda2MouseExited
       novaVenda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_novaVenda.png")));
    }//GEN-LAST:event_novaVenda2MouseExited

    private void novoProduto2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoProduto2MouseEntered
      novoProduto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_novoProdutoAzul.png")));
    }//GEN-LAST:event_novoProduto2MouseEntered

    private void novoProduto2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoProduto2MouseExited
        novoProduto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_novoProduto.png")));
    }//GEN-LAST:event_novoProduto2MouseExited

    private void novoCliente2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoCliente2MouseEntered
      novoCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_novoClienteAzul.png")));
    }//GEN-LAST:event_novoCliente2MouseEntered

    private void novoCliente2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoCliente2MouseExited
      novoCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_novoCliente.png")));
    }//GEN-LAST:event_novoCliente2MouseExited

    private void buscarCliente2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarCliente2MouseEntered
      buscarCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_buscarClienteAzul.png")));
    }//GEN-LAST:event_buscarCliente2MouseEntered

    private void buscarCliente2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarCliente2MouseExited
      buscarCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_buscarCliente.png")));
    }//GEN-LAST:event_buscarCliente2MouseExited

    private void buscarVenda2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarVenda2MouseEntered
      buscarVenda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_buscarVendaAzul.png"))); 
    }//GEN-LAST:event_buscarVenda2MouseEntered

    private void buscarVenda2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarVenda2MouseExited
      buscarVenda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_buscarVenda.png"))); 
    }//GEN-LAST:event_buscarVenda2MouseExited

    private void btn_SearchProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchProductsMouseClicked
       String str = txtProductsSearchField.getText();

        Utils.updateTable(ProductDao.search(str), table_Products);
    }//GEN-LAST:event_btn_SearchProductsMouseClicked

    private void btn_SearchProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchProductsMouseEntered
        btn_SearchProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pesquisar.png"))); 
    }//GEN-LAST:event_btn_SearchProductsMouseEntered

    private void btn_SearchProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchProductsMouseExited
        btn_SearchProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pesquisarClaro.png"))); 
    }//GEN-LAST:event_btn_SearchProductsMouseExited

    private void btn_EditcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditcMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditcMouseClicked

    private void btn_EditcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditcMouseEntered
               btn_Editc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_EditarEscuro.png")));
    }//GEN-LAST:event_btn_EditcMouseEntered

    private void btn_EditcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditcMouseExited
               btn_Editc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_Editar.png")));
    }//GEN-LAST:event_btn_EditcMouseExited


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
    private javax.swing.JPanel Mid_Header;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Neighbourhood;
    private javax.swing.JPanel Panel_Employees;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel State;
    private javax.swing.JScrollPane Table_Employees;
    private javax.swing.JPanel bgButtonsHome;
    private javax.swing.JPanel bgButtonsHome2;
    private javax.swing.JLabel btnDeleteEmployee;
    private javax.swing.JLabel btnEditEmployee;
    private javax.swing.JLabel btnSaveEmployee;
    private javax.swing.JLabel btn_Addc;
    private javax.swing.JLabel btn_Close;
    private javax.swing.JLabel btn_DeleteSale;
    private javax.swing.JLabel btn_Deletec;
    private javax.swing.JLabel btn_Editc;
    private javax.swing.JLabel btn_Max;
    private javax.swing.JLabel btn_Min;
    private javax.swing.JLabel btn_NewSale;
    private javax.swing.JLabel btn_SearchProducts;
    private javax.swing.JLabel btn_SearchSale;
    private javax.swing.JLabel btn_Searchc;
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
    private javax.swing.JLabel buscarCliente1;
    private javax.swing.JLabel buscarCliente2;
    private javax.swing.JLabel buscarVenda1;
    private javax.swing.JLabel buscarVenda2;
    private javax.swing.JTextField cSearchCustomer;
    private javax.swing.JLabel faturamento2;
    private javax.swing.JLabel faturamento3;
    private javax.swing.JLabel faturamento4;
    private javax.swing.JLabel faturamento5;
    private javax.swing.JLabel faturamentoValor2;
    private javax.swing.JLabel faturamentoValor3;
    private javax.swing.JLabel faturamentoValor4;
    private javax.swing.JLabel faturamentoValor5;
    private javax.swing.JLabel fundoFaturamento;
    private javax.swing.JLabel fundoFaturamento2;
    private javax.swing.JLabel fundoFaturamento6;
    private javax.swing.JLabel fundoFaturamento7;
    private javax.swing.JLabel fundoFaturamento8;
    private javax.swing.JLabel fundoReceita;
    private javax.swing.JLabel fundoTicket;
    private javax.swing.JLabel fundoVendas;
    private javax.swing.JLabel iconFaturamento;
    private javax.swing.JLabel iconReceita;
    private javax.swing.JLabel iconTicket;
    private javax.swing.JLabel iconVendas;
    private javax.swing.JLabel icon_customers;
    private javax.swing.JLabel icon_employees;
    private javax.swing.JLabel icon_home;
    private javax.swing.JLabel icon_products;
    private javax.swing.JLabel icon_sales;
    private javax.swing.JLabel icon_settings;
    private javax.swing.JLabel iconeFaturamento2;
    private javax.swing.JLabel iconeFaturamento3;
    private javax.swing.JLabel iconeFaturamento4;
    private javax.swing.JLabel iconeFaturamento5;
    private javax.swing.JLabel iconeOcultar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel menu_customers;
    private javax.swing.JPanel menu_employees;
    private javax.swing.JPanel menu_home;
    private javax.swing.JPanel menu_product;
    private javax.swing.JPanel menu_sale;
    private javax.swing.JPanel menu_settings;
    private javax.swing.JLabel novaVenda1;
    private javax.swing.JLabel novaVenda2;
    private javax.swing.JLabel novoCliente1;
    private javax.swing.JLabel novoCliente2;
    private javax.swing.JLabel novoProduto1;
    private javax.swing.JLabel novoProduto2;
    private javax.swing.JPanel panelInformacoes;
    private javax.swing.JPanel panelInformacoes1;
    private javax.swing.JPanel pnFaturamento;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnReceita;
    private javax.swing.JPanel pnTicket;
    private javax.swing.JPanel pnVendas;
    private javax.swing.JPanel pnl_Close;
    private javax.swing.JPanel pnl_HeaderMenu;
    private javax.swing.JPanel pnl_IconMenu;
    private javax.swing.JPanel pnl_Max;
    private javax.swing.JPanel pnl_Min;
    private javax.swing.JTextField searchSale;
    private javax.swing.JTable tableCustomers;
    private javax.swing.JTable tableSales;
    private javax.swing.JTable table_Employees;
    private javax.swing.JTable table_Products;
    private javax.swing.JLabel txtBemVindo1;
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
    private javax.swing.JLabel txtFaturamento;
    private javax.swing.JLabel txtFaturamentoValor;
    private javax.swing.JTextField txtProductsSearchField;
    private javax.swing.JLabel txtReceita;
    private javax.swing.JLabel txtReceitaValor;
    private javax.swing.JLabel txtTicket;
    private javax.swing.JLabel txtTicketValor;
    private javax.swing.JLabel txtTotalSales;
    private javax.swing.JLabel txtVendas;
    // End of variables declaration//GEN-END:variables
    
}
