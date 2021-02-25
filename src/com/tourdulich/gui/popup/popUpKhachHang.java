/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.gui.popup;

import com.tourdulich.bll.INhanVienBLL;
import com.tourdulich.bll.IVaiTroBLL;
import com.tourdulich.bll.impl.NhanVienBLL;
import com.tourdulich.bll.impl.VaiTroBLL;
import com.tourdulich.dto.NhanVienDTO;
import com.tourdulich.dto.VaiTroDTO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import com.tourdulich.gui.menu.MyComboBoxEditor;
import com.tourdulich.gui.menu.MyComboBoxRenderer;
import com.tourdulich.util.ImageUtil;
import com.tourdulich.util.InputValidatorUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hi
 */
public class popUpKhachHang extends javax.swing.JFrame {
    private File selectedImg = null;
    private String action;
    private NhanVienDTO nhanVien = null;
    private INhanVienBLL nhanVienBLL;
    private IVaiTroBLL vaiTroBLL;
    
    public popUpKhachHang(String action) {
        initComponents();
        
        this.action = action;    
        nhanVienBLL = new NhanVienBLL();
        vaiTroBLL = new VaiTroBLL();
        
        CustomWindow();
        myTextArea();
      
        
        this.setVisible(true);    
    }
    
    public popUpKhachHang(String action, NhanVienDTO nhanVien) {
        initComponents();
        this.action = action;  
        this.nhanVien = nhanVien;
        nhanVienBLL = new NhanVienBLL();
        vaiTroBLL = new VaiTroBLL(); 
 
        CustomWindow();
        myTextArea();
     
       
        setLabelText(nhanVien);
        
        this.setVisible(true);    
    }
    
    public void setLabelText(NhanVienDTO nhanVien)
    {
        txtHo.setText(nhanVien.getHo());
        txtTen.setText(nhanVien.getTen());
        if(nhanVien.getGioiTinh()) {
            radioNam.setSelected(true);
        } else {
            radioNu.setSelected(true);
        }
        DCNgaySinh.setDate(nhanVien.getNgaySinh());
        txtDiaChi.setText(nhanVien.getDiaChi());
        txtSDT.setText(nhanVien.getSdt());
        if(nhanVien.getHinhAnh() != null) {
            System.out.println(nhanVien.getHinhAnh()); 
           lblAnh.setIcon(ImageUtil.resizeImg(nhanVien.getHinhAnh(), lblAnh));
        }
         
    }
    public boolean Validate()
    {   
        boolean Ho, Ten, Sdt, DiaChi = true; 
        if (InputValidatorUtil.isValidName(txtHo.getText(), true).isEmpty())  
        return true;
        
        return false;
       
    }
    private NhanVienDTO getFormInfo() throws IOException {
        NhanVienDTO nhanVien = new NhanVienDTO();
        if(this.nhanVien != null) {
            nhanVien.setId(this.nhanVien.getId());
        }
        nhanVien.setHo(txtHo.getText());
        nhanVien.setTen(txtTen.getText());
        nhanVien.setGioiTinh(radioNam.isSelected() ? true : false);
        nhanVien.setNgaySinh(DCNgaySinh.getDate());
        nhanVien.setDiaChi(txtDiaChi.getText());
        nhanVien.setSdt(txtSDT.getText());
        if (this.selectedImg != null) {
            nhanVien.setHinhAnh(ImageUtil.getByteArray(this.selectedImg));
        } else {
            if (this.nhanVien != null) {
                if(this.nhanVien.getHinhAnh() != null) {
                    nhanVien.setHinhAnh(this.nhanVien.getHinhAnh());
                }
            }
        }
      
     
        return nhanVien;
    }
    
    public void setComboBox(JComboBox<String> comboBox, String[] listItems) {
        comboBox.setModel(new DefaultComboBoxModel<>(listItems));
    } 
    
    public String[] getVaiTroItems() {
        List<VaiTroDTO> vaiTroLists = vaiTroBLL.findAll();
        String[] vaiTroItems = new String[vaiTroLists.size()];
        int index = 0;
        for(VaiTroDTO vt : vaiTroLists) {
            vaiTroItems[index] = vt.getId() + " - " + vt.getTenVaiTro();
            ++ index;
        }
        return vaiTroItems;
    }
    
    public String getVaiTroItemName(VaiTroDTO vaiTro) {
        return vaiTro.getId() + " - " + vaiTro.getTenVaiTro();
    }
    
    public popUpKhachHang() {
        initComponents();
        CustomWindow();
    }
   
    public void CustomWindow()
    {   
        Color flatBlue = new Color(14,142,233);  
        this.setSize(new Dimension(615,344));
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(0,1,1,1, flatBlue));   
        center();
        lblMinimize.setText("\u2014");
        lblExit.setText("X");
       
    }
    
    public void myTextArea()
    {
        txtDiaChi.setWrapStyleWord(true);
        txtDiaChi.setLineWrap(true);
    }
    public JComboBox myComboBox(JComboBox box, Color color)
    {   
        box.setRenderer(new MyComboBoxRenderer());
        box.setEditor(new MyComboBoxEditor());
        
        box.setUI(new BasicComboBoxUI() 
        {
            @Override
            protected ComboPopup createPopup() 
            {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                basicComboPopup.setBorder(new MatteBorder(2,2,2,2,color));
                return basicComboPopup;
            }
            
            @Override 
            protected JButton createArrowButton() 
            {
                Color matteGrey = new Color(223,230,233);
                Color flatBlue = new Color(14,142,233);
        
                BasicArrowButton custom = new BasicArrowButton(
                BasicArrowButton.SOUTH, null, null, Color.WHITE, null);
                custom.setBorder(new MatteBorder(0,0,0,0,flatBlue));
                return custom;
            }
        }); 

       return box;
    }
    
    public void center()
    {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGioiTinh = new javax.swing.ButtonGroup();
        panelHeader = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        btnChonAnh = new javax.swing.JButton();
        lblHo = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        radioNam = new javax.swing.JRadioButton();
        radioNu = new javax.swing.JRadioButton();
        lblTen = new javax.swing.JLabel();
        lblCmnd = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        lblSDT = new javax.swing.JLabel();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        lblNgaySinh = new javax.swing.JLabel();
        AreaScrollPane = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        DCNgaySinh = new com.github.lgooddatepicker.components.DatePicker();
        txtCmnd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelHeader.setBackground(new java.awt.Color(45, 113, 248));
        panelHeader.setPreferredSize(new java.awt.Dimension(561, 40));
        panelHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelHeaderMouseDragged(evt);
            }
        });

        lblMinimize.setBackground(new java.awt.Color(255, 255, 255));
        lblMinimize.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        lblExit.setBackground(new java.awt.Color(255, 255, 255));
        lblExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(517, Short.MAX_VALUE)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlBody.setBackground(new java.awt.Color(255, 255, 255));

        lblAnh.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        btnChonAnh.setBackground(new java.awt.Color(204, 204, 204));
        btnChonAnh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChonAnh.setText("Chọn ảnh");
        btnChonAnh.setContentAreaFilled(false);
        btnChonAnh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChonAnh.setOpaque(true);
        btnChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonAnhActionPerformed(evt);
            }
        });

        lblHo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHo.setText("Họ:");

        txtHo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        lblDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDiaChi.setText("Địa Chỉ:");

        txtTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTen.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        lblGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGioiTinh.setText("Giới Tính:");

        btnGroupGioiTinh.add(radioNam);
        radioNam.setSelected(true);
        radioNam.setText("Nam");
        radioNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNamActionPerformed(evt);
            }
        });

        btnGroupGioiTinh.add(radioNu);
        radioNu.setText("Nữ");
        radioNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNuActionPerformed(evt);
            }
        });

        lblTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTen.setText("Tên:");

        lblCmnd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCmnd.setText("Cmnd:");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSDT.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        lblSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSDT.setText("Sđt:");

        btnLuu.setBackground(new java.awt.Color(14, 142, 233));
        btnLuu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tourdulich/gui/popup/save_icon.png"))); // NOI18N
        btnLuu.setText(" Lưu");
        btnLuu.setBorder(null);
        btnLuu.setContentAreaFilled(false);
        btnLuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLuu.setOpaque(true);
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(14, 142, 233));
        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tourdulich/gui/popup/cancel_icon.png"))); // NOI18N
        btnHuy.setText(" Hủy");
        btnHuy.setBorder(null);
        btnHuy.setContentAreaFilled(false);
        btnHuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHuy.setOpaque(true);
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        lblNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNgaySinh.setText("Ngày Sinh:");

        AreaScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        AreaScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        txtDiaChi.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(204, 204, 204)));
        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AreaScrollPane.setViewportView(txtDiaChi);

        txtCmnd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCmnd.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        txtCmnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCmndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChonAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDiaChi)
                            .addComponent(lblNgaySinh)
                            .addComponent(DCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AreaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBodyLayout.createSequentialGroup()
                                .addComponent(lblHo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBodyLayout.createSequentialGroup()
                                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTen))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(txtSDT))))
                        .addGap(70, 70, 70)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                                .addComponent(lblGioiTinh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioNam))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(radioNu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                                .addComponent(lblCmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCmnd)))))
                .addGap(20, 20, 20))
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCmnd)
                            .addComponent(lblHo)
                            .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGioiTinh)
                            .addComponent(radioNam))
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBodyLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(radioNu)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)))
                        .addComponent(lblNgaySinh)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBodyLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(pnlBodyLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AreaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlBodyLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
            .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
       this.dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void panelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseDragged
        setLocation (evt.getXOnScreen()-(getWidth()/2),evt.getYOnScreen()-10);
    }//GEN-LAST:event_panelHeaderMouseDragged

    private void radioNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNamActionPerformed

    private void radioNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNuActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        NhanVienDTO newNhanVien = null;
        try {
            newNhanVien = getFormInfo();
        } catch (IOException ex) {
            Logger.getLogger(popUpKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(this.action.equals("POST")) {
            Long newNhanVienId = nhanVienBLL.save(newNhanVien);
            if(newNhanVienId != null) {
               
                JOptionPane.showMessageDialog(this, "Lưu thành công!!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                
            } else {
                JOptionPane.showMessageDialog(this, "Lưu thất bại!!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } else if(this.action.equals("PUT")) {
            try {
              
                nhanVienBLL.update(newNhanVien);
                JOptionPane.showMessageDialog(this, "Lưu thành công!!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                
            } catch(Exception e) {
                JOptionPane.showMessageDialog(this, "Lưu thất bại!!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonAnhActionPerformed
        selectedImg = ImageUtil.showJFileChooser(lblAnh);
    }//GEN-LAST:event_btnChonAnhActionPerformed

    private void txtCmndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCmndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCmndActionPerformed

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
            java.util.logging.Logger.getLogger(popUpKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popUpKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popUpKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popUpKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new popUpKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AreaScrollPane;
    private com.github.lgooddatepicker.components.DatePicker DCNgaySinh;
    private javax.swing.JButton btnChonAnh;
    private javax.swing.ButtonGroup btnGroupGioiTinh;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblCmnd;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHo;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTen;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNu;
    private javax.swing.JTextField txtCmnd;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}