/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.view.registration;

import br.sistemalojaroupas.db.DBException;
import br.sistemalojaroupas.model.dao.EmployeeDao;
import br.sistemalojaroupas.model.dao.OfficeDao;
import br.sistemalojaroupas.model.dao.UserDao;
import br.sistemalojaroupas.model.entities.Address;
import br.sistemalojaroupas.model.entities.Employee;
import br.sistemalojaroupas.model.entities.Office;
import br.sistemalojaroupas.model.entities.User;
import br.sistemalojaroupas.model.services.CepService;
import br.sistemalojaroupas.view.util.ComboBoxRenderer;
import br.sistemalojaroupas.view.util.Utils;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariana
 */
public class Register_And_Edit_Employee extends javax.swing.JDialog {

    private Address address;
    private Employee employee;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Boolean isRegistering;
    /**
     * Creates new form Insert_Employee
     */
    public Register_And_Edit_Employee(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        
        address = new Address();
        
        cbOffice.setRenderer(new ComboBoxRenderer());
        Utils.updateComboBox(OfficeDao.findAll(), cbOffice);
        initializeDateConfig();
        isRegistering = true;
    }
    
    public Register_And_Edit_Employee(java.awt.Frame owner, boolean modal, Employee employee) {
        super(owner, modal);
        initComponents();
        
        this.setBackground(new java.awt.Color(0,0,0,0));
        
        this.employee = employee;
        this.address = employee.getAddress();
        isRegistering = false;
        
        cbOffice.setRenderer(new ComboBoxRenderer());
        Utils.updateComboBox(OfficeDao.findAll(), cbOffice);

        initializeDateConfig();
        
        title.setText("Editar funcionário");
        eName.setText(employee.getName());
        txtfCpf.setValue(employee.getCpf());
        txtfSalary.setValue(employee.getSalary());
        eEmail.setText(employee.getEmail());
        txtfPhone.setValue(employee.getPhone());
        cbOffice.setSelectedItem(employee.getOffice());
        eCity.setText(address.getCity());
        eState.setText(address.getState());
        eStreet.setText(address.getStreet());
        eNeighborhood.setText(address.getNeighborhood());
        eNumber.setText(address.getNumber());
        dcAdmissionDate.setDate(employee.getAdmissionDate());
        dcBirthDate.setDate(employee.getBirthDate());
        eCEP.setText(address.getCep());
        
    }

    public void clearFields() {
        Utils.clearFields(panelPersonalData);
        Utils.clearFields(panelFunctionalData);
    }
    
    private void dateChooserStyle(JDateChooser dc) {
        java.awt.Color bg = new java.awt.Color(0,0,0);
        java.awt.Color fg = new java.awt.Color(255,255,255);
        java.awt.Color buttonsBg = new java.awt.Color(59,44,150);
        
        dc.getCalendarButton().setBackground(buttonsBg);
        dc.getCalendarButton().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendarWhite_14px.png")));
        dc.getDateEditor().getUiComponent().setBackground(bg);
        dc.getDateEditor().getUiComponent().setForeground(fg);
        dc.getDateEditor().setNormalColor(fg);

        dc.getDateEditor().getUiComponent().setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
       
    }
    
    private void initializeDateConfig() {
        Date max = new Date();
        dcAdmissionDate.setMaxSelectableDate(max);
        dcBirthDate.setMaxSelectableDate(max);
        
        try {
            dcAdmissionDate.setMinSelectableDate(sdf.parse("01/01/1970"));
            dcBirthDate.setMinSelectableDate(sdf.parse("01/01/1960"));
        } catch (ParseException ex) {
            
        }
        dateChooserStyle(dcAdmissionDate);
        dateChooserStyle(dcBirthDate);
    }
    
    private Employee instantiateEmployee(Employee employee) {
        
        employee.setName(eName.getText().toUpperCase());
        employee.setEmail(eEmail.getText());
        employee.setCpf(txtfCpf.getText());
        employee.setPhone(txtfPhone.getText());
        employee.setSalary(Utils.tryParseToDouble(txtfSalary.getText().replace(',', '.')));
        
        employee.setBirthDate(dcBirthDate.getDate());
        employee.setAdmissionDate(dcAdmissionDate.getDate());
        
        address.setCep(eCEP.getText());
        address.setCity(eCity.getText());
        address.setNeighborhood(eNeighborhood.getText());
        address.setState(eState.getText());
        address.setStreet(eStreet.getText());
        address.setNumber(eNumber.getText());
        employee.setAddress(address);
        employee.setOffice((Office) cbOffice.getSelectedItem());
        
        return employee;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bnt_save = new javax.swing.JLabel();
        btn_clear = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        panelPersonalData = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        eName = new javax.swing.JTextField();
        eEmail = new javax.swing.JTextField();
        eStreet = new javax.swing.JTextField();
        eNeighborhood = new javax.swing.JTextField();
        eCEP = new javax.swing.JTextField();
        eCity = new javax.swing.JTextField();
        txtfCpf = new javax.swing.JFormattedTextField();
        txtfPhone = new javax.swing.JFormattedTextField();
        jLabel32 = new javax.swing.JLabel();
        eState = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        eNumber = new javax.swing.JTextField();
        btnSearchCEP = new javax.swing.JButton();
        dcBirthDate = new com.toedter.calendar.JDateChooser();
        panelFunctionalData = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtfSalary = new javax.swing.JFormattedTextField();
        btn_addOffice = new javax.swing.JLabel();
        btn_editOffice = new javax.swing.JLabel();
        cbOffice = new javax.swing.JComboBox<>();
        dcAdmissionDate = new com.toedter.calendar.JDateChooser();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(573, 551));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(bnt_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, -1, 30));

        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_limparClaro.png"))); // NOI18N
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clearMouseExited(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, -1, -1));

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
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, -1, -1));

        title.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Cadastro de Funcionário");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 610, 40));

        panelPersonalData.setBackground(new java.awt.Color(0, 0, 51));
        panelPersonalData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS PESSOAIS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(108, 81, 233))); // NOI18N
        panelPersonalData.setToolTipText("");
        panelPersonalData.setMaximumSize(new java.awt.Dimension(571, 300));
        panelPersonalData.setMinimumSize(new java.awt.Dimension(571, 300));
        panelPersonalData.setName("jdhdd"); // NOI18N
        panelPersonalData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setBackground(new java.awt.Color(59, 44, 150));
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Nome:");
        jLabel22.setOpaque(true);
        panelPersonalData.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 30));

        jLabel23.setBackground(new java.awt.Color(59, 44, 150));
        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("CPF:");
        jLabel23.setOpaque(true);
        panelPersonalData.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 80, 30));

        jLabel24.setBackground(new java.awt.Color(59, 44, 150));
        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Data Nasc.:");
        jLabel24.setOpaque(true);
        panelPersonalData.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 80, 30));

        jLabel25.setBackground(new java.awt.Color(59, 44, 150));
        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Tel.:");
        jLabel25.setOpaque(true);
        panelPersonalData.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 30));

        jLabel26.setBackground(new java.awt.Color(59, 44, 150));
        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("E-mail:");
        jLabel26.setOpaque(true);
        panelPersonalData.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        jLabel27.setBackground(new java.awt.Color(59, 44, 150));
        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Logradouro:");
        jLabel27.setOpaque(true);
        panelPersonalData.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, 30));

        jLabel28.setBackground(new java.awt.Color(59, 44, 150));
        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Bairro:");
        jLabel28.setOpaque(true);
        panelPersonalData.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 80, 30));

        jLabel29.setBackground(new java.awt.Color(59, 44, 150));
        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("CEP:");
        jLabel29.setOpaque(true);
        panelPersonalData.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 40, 30));

        jLabel30.setBackground(new java.awt.Color(59, 44, 150));
        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Cidade:");
        jLabel30.setOpaque(true);
        panelPersonalData.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 70, 30));

        eName.setBackground(new java.awt.Color(0, 0, 0));
        eName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eName.setForeground(new java.awt.Color(255, 255, 255));
        eName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eName.setCaretColor(new java.awt.Color(255, 255, 255));
        eName.setOpaque(false);
        panelPersonalData.add(eName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 260, 30));

        eEmail.setBackground(new java.awt.Color(0, 0, 0));
        eEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eEmail.setForeground(new java.awt.Color(255, 255, 255));
        eEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        eEmail.setOpaque(false);
        eEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eEmailActionPerformed(evt);
            }
        });
        panelPersonalData.add(eEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 260, 30));

        eStreet.setBackground(new java.awt.Color(0, 0, 0));
        eStreet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eStreet.setForeground(new java.awt.Color(255, 255, 255));
        eStreet.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eStreet.setCaretColor(new java.awt.Color(255, 255, 255));
        eStreet.setOpaque(false);
        panelPersonalData.add(eStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 350, 30));

        eNeighborhood.setBackground(new java.awt.Color(0, 0, 0));
        eNeighborhood.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eNeighborhood.setForeground(new java.awt.Color(255, 255, 255));
        eNeighborhood.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eNeighborhood.setCaretColor(new java.awt.Color(255, 255, 255));
        eNeighborhood.setOpaque(false);
        panelPersonalData.add(eNeighborhood, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 100, 30));

        eCEP.setBackground(new java.awt.Color(0, 0, 0));
        eCEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eCEP.setForeground(new java.awt.Color(255, 255, 255));
        eCEP.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eCEP.setCaretColor(new java.awt.Color(255, 255, 255));
        eCEP.setOpaque(false);
        eCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eCEPActionPerformed(evt);
            }
        });
        eCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eCEPKeyReleased(evt);
            }
        });
        panelPersonalData.add(eCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 80, 30));

        eCity.setBackground(new java.awt.Color(0, 0, 0));
        eCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eCity.setForeground(new java.awt.Color(255, 255, 255));
        eCity.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eCity.setCaretColor(new java.awt.Color(255, 255, 255));
        eCity.setOpaque(false);
        panelPersonalData.add(eCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 130, 30));

        txtfCpf.setBackground(new java.awt.Color(0, 0, 0));
        txtfCpf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        txtfCpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtfCpf.setCaretColor(new java.awt.Color(255, 255, 255));
        txtfCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtfCpf.setOpaque(false);
        panelPersonalData.add(txtfCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 110, 30));

        txtfPhone.setBackground(new java.awt.Color(0, 0, 0));
        txtfPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        txtfPhone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtfPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtfPhone.setCaretColor(new java.awt.Color(255, 255, 255));
        txtfPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtfPhone.setOpaque(false);
        panelPersonalData.add(txtfPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 110, 30));

        jLabel32.setBackground(new java.awt.Color(59, 44, 150));
        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("UF:");
        jLabel32.setOpaque(true);
        panelPersonalData.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 30));

        eState.setBackground(new java.awt.Color(0, 0, 0));
        eState.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eState.setForeground(new java.awt.Color(255, 255, 255));
        eState.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eState.setCaretColor(new java.awt.Color(255, 255, 255));
        eState.setOpaque(false);
        panelPersonalData.add(eState, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 50, 30));

        jLabel34.setBackground(new java.awt.Color(59, 44, 150));
        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("N°:");
        jLabel34.setOpaque(true);
        panelPersonalData.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 30, 30));

        eNumber.setBackground(new java.awt.Color(0, 0, 0));
        eNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eNumber.setForeground(new java.awt.Color(255, 255, 255));
        eNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eNumber.setCaretColor(new java.awt.Color(255, 255, 255));
        eNumber.setOpaque(false);
        panelPersonalData.add(eNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 70, 30));

        btnSearchCEP.setBackground(new java.awt.Color(108, 81, 233));
        btnSearchCEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_12px.png"))); // NOI18N
        btnSearchCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCEPActionPerformed(evt);
            }
        });
        panelPersonalData.add(btnSearchCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 30, 30));

        dcBirthDate.setBackground(new java.awt.Color(0, 0, 0));
        dcBirthDate.setForeground(new java.awt.Color(255, 255, 255));
        dcBirthDate.setDateFormatString("dd/MM/yyyy");
        dcBirthDate.setOpaque(false);
        panelPersonalData.add(dcBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 110, 30));

        getContentPane().add(panelPersonalData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 580, 300));

        panelFunctionalData.setBackground(new java.awt.Color(0, 0, 51));
        panelFunctionalData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS FUNCIONAIS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(108, 81, 233))); // NOI18N
        panelFunctionalData.setForeground(new java.awt.Color(108, 81, 233));
        panelFunctionalData.setMaximumSize(new java.awt.Dimension(571, 210));
        panelFunctionalData.setMinimumSize(new java.awt.Dimension(571, 210));
        panelFunctionalData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setBackground(new java.awt.Color(59, 44, 150));
        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Cargo:");
        jLabel35.setOpaque(true);
        panelFunctionalData.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 30));

        jLabel36.setBackground(new java.awt.Color(59, 44, 150));
        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Data de admissão:");
        jLabel36.setOpaque(true);
        panelFunctionalData.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 30));

        jLabel37.setBackground(new java.awt.Color(59, 44, 150));
        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Salário:");
        jLabel37.setOpaque(true);
        panelFunctionalData.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 70, 30));

        txtfSalary.setBackground(new java.awt.Color(0, 0, 0));
        txtfSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        txtfSalary.setForeground(new java.awt.Color(255, 255, 255));
        txtfSalary.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtfSalary.setCaretColor(new java.awt.Color(255, 255, 255));
        txtfSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtfSalary.setOpaque(false);
        panelFunctionalData.add(txtfSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 160, 30));

        btn_addOffice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_addOffice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_mais.png"))); // NOI18N
        btn_addOffice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addOffice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addOfficeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_addOfficeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_addOfficeMouseExited(evt);
            }
        });
        panelFunctionalData.add(btn_addOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 30, 30));

        btn_editOffice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_editOffice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit_19px.png"))); // NOI18N
        btn_editOffice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editOffice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editOfficeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editOfficeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editOfficeMouseExited(evt);
            }
        });
        panelFunctionalData.add(btn_editOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 30, 30));

        cbOffice.setBackground(new java.awt.Color(0, 0, 51));
        cbOffice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbOffice.setForeground(new java.awt.Color(255, 255, 255));
        cbOffice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "PP", "P", "M", "G", "GG" }));
        panelFunctionalData.add(cbOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 180, 30));

        dcAdmissionDate.setBackground(new java.awt.Color(0, 0, 0));
        dcAdmissionDate.setForeground(new java.awt.Color(255, 255, 255));
        dcAdmissionDate.setDateFormatString("dd/MM/yyyy");
        dcAdmissionDate.setOpaque(false);
        panelFunctionalData.add(dcAdmissionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, 30));

        getContentPane().add(panelFunctionalData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 580, 138));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tela_cadastro_funcionario_dark2.png"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 632, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eEmailActionPerformed

    private void bnt_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_saveMouseClicked
        bnt_save.requestFocusInWindow();
        boolean hasEmptyField = !Utils.isAllFieldsFilled(panelPersonalData) || !Utils
                .isAllFieldsFilled(panelFunctionalData);
        
        if (hasEmptyField) {
            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            if (employee == null || isRegistering) {
                
                employee = instantiateEmployee(new Employee());
                String cpf = Utils.formatCpf(employee.getCpf());
                
                EmployeeDao.insert(employee);
                User user = new User();
                user.setEmployee(employee);
                user.setUserName(employee.getEmail());
                user.setPassword(cpf);
                user.setPermissions(employee.getOffice().getPermissions());
                
                UserDao.insert(user);
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                
                clearFields();
                employee = null;
            } else {
                instantiateEmployee(employee);
                
                EmployeeDao.update(employee);
                JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                
                this.dispose();
            }
        } catch (DBException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bnt_saveMouseClicked

    private void bnt_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_saveMouseEntered
        // Trocar para ícone escuro
        bnt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvar.png")));
    }//GEN-LAST:event_bnt_saveMouseEntered

    private void bnt_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_saveMouseExited
        // Voltar para ícone original
        bnt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvarClaro.png")));
    }//GEN-LAST:event_bnt_saveMouseExited

    private void btn_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseClicked
        // Limpar todos os campos (criar método depois)
        clearFields();
    }//GEN-LAST:event_btn_clearMouseClicked

    private void btn_clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseEntered
        // Trocar para ícone escuro
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_limpar.png")));
    }//GEN-LAST:event_btn_clearMouseEntered

    private void btn_clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseExited
        // Voltar para ícone original
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_limparClaro.png")));
    }//GEN-LAST:event_btn_clearMouseExited

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

    private void eCEPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eCEPKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSearchCEPActionPerformed(null);
        }
    }//GEN-LAST:event_eCEPKeyReleased

    private void btnSearchCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCEPActionPerformed
        try {
            String cep = eCEP.getText();
            
            address = CepService.findAddress(cep);
            
            eCity.setText(address.getCity());
            eState.setText(address.getState());
            eStreet.setText(address.getStreet());
            eNeighborhood.setText(address.getNeighborhood());
        } catch (IllegalArgumentException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnSearchCEPActionPerformed

    private void eCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eCEPActionPerformed

    private void btn_addOfficeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addOfficeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addOfficeMouseExited

    private void btn_editOfficeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editOfficeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editOfficeMouseEntered

    private void btn_editOfficeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editOfficeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editOfficeMouseExited

    private void btn_addOfficeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addOfficeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addOfficeMouseEntered

    private void btn_addOfficeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addOfficeMouseClicked
        new OfficeRegistration(this, true).setVisible(true);
        Utils.updateComboBox(OfficeDao.findAll(), cbOffice);
    }//GEN-LAST:event_btn_addOfficeMouseClicked

    private void btn_editOfficeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editOfficeMouseClicked
        if (cbOffice.getSelectedIndex() != 0) {
            Office ofc = (Office) cbOffice.getSelectedItem();
            new OfficeRegistration(this, true, ofc).setVisible(true);
            Utils.updateComboBox(OfficeDao.findAll(), cbOffice);
        }
        else {
            JOptionPane.showMessageDialog(null, "Você deve selecionar uma cargo para poder editar.", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_editOfficeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bnt_save;
    private javax.swing.JButton btnSearchCEP;
    private javax.swing.JLabel btn_addOffice;
    private javax.swing.JLabel btn_cancel;
    private javax.swing.JLabel btn_clear;
    private javax.swing.JLabel btn_editOffice;
    private javax.swing.JComboBox<Object> cbOffice;
    private com.toedter.calendar.JDateChooser dcAdmissionDate;
    private com.toedter.calendar.JDateChooser dcBirthDate;
    private javax.swing.JTextField eCEP;
    private javax.swing.JTextField eCity;
    private javax.swing.JTextField eEmail;
    private javax.swing.JTextField eName;
    private javax.swing.JTextField eNeighborhood;
    private javax.swing.JTextField eNumber;
    private javax.swing.JTextField eState;
    private javax.swing.JTextField eStreet;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JPanel panelFunctionalData;
    private javax.swing.JPanel panelPersonalData;
    private javax.swing.JLabel title;
    private javax.swing.JFormattedTextField txtfCpf;
    private javax.swing.JFormattedTextField txtfPhone;
    private javax.swing.JFormattedTextField txtfSalary;
    // End of variables declaration//GEN-END:variables


}
