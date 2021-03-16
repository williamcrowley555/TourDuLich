/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.gui.popup;

import com.tourdulich.bll.IVaiTroBLL;
import com.tourdulich.bll.impl.VaiTroBLL;
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
import com.tourdulich.util.InputValidatorUtil;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Hi
 */
public class PopUpVaiTroGUI extends javax.swing.JFrame {
    private String action;
    private IVaiTroBLL vaiTroBLL;
    private VaiTroDTO vaiTro;
   
    public PopUpVaiTroGUI(String action) {
        initComponents();
        
        this.action = action;
        vaiTroBLL = new VaiTroBLL();
        
        CustomWindow();
       
        this.setVisible(true);
    }

    public PopUpVaiTroGUI(String action, VaiTroDTO vaiTro) {
        initComponents();
        this.action = action;
        this.vaiTro = vaiTro;
        vaiTroBLL = new VaiTroBLL();
        CustomWindow();
        setLabelText(vaiTro);
        this.setVisible(true);
    }
    
    public void setLabelText(VaiTroDTO vaiTro)
    {
        txtTenVaiTro.setText(vaiTro.getTenVaiTro());
    }
    
    private VaiTroDTO getFormInfo() {
        VaiTroDTO vaiTro = new VaiTroDTO();
        if(this.vaiTro != null) {
            vaiTro.setId(this.vaiTro.getId());
        }
        vaiTro.setTenVaiTro(txtTenVaiTro.getText().trim());
        return vaiTro;
    }
 
    public PopUpVaiTroGUI() {
        initComponents();
        CustomWindow();
    }
    
    public boolean validateForm() 
    {
       ImageIcon iconCheck = new ImageIcon(getClass().getResource("/com/tourdulich/img/check.png"));
       ImageIcon iconError = new ImageIcon(getClass().getResource("/com/tourdulich/img/error.png"));  
       if(InputValidatorUtil.isValidName(txtTenVaiTro.getText(), true).isEmpty())
       {
           lblValidateTenVaiTro.setIcon(iconCheck);
           lblValidateTenVaiTro.setToolTipText(null);
           return true;
       }
       else {
           lblValidateTenVaiTro.setIcon(iconError);
           lblValidateTenVaiTro.setToolTipText(InputValidatorUtil.isValidName(txtTenVaiTro.getText(), true));
          return false;
       }
    }
    public void center()
    {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    public void CustomWindow()
    {   
        Color flatBlue = new Color(14,142,233);  
        this.setSize(new Dimension(263,237));
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(0,1,1,1, flatBlue));   
        center();
        lblMinimize.setText("\u2014");
        lblExit.setText("X");
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
        lblTenVaiTro = new javax.swing.JLabel();
        txtTenVaiTro = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        lblValidateTenVaiTro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        panelHeader.setBackground(new java.awt.Color(45, 113, 248));
        panelHeader.setPreferredSize(new java.awt.Dimension(561, 40));
        panelHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelHeaderMouseDragged(evt);
            }
        });

        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setBackground(new java.awt.Color(255, 255, 255));
        lblMinimize.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setBackground(new java.awt.Color(255, 255, 255));
        lblExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        lblTenVaiTro.setText("Tên Vai Trò:");
        lblTenVaiTro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTenVaiTro.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        txtTenVaiTro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tourdulich/gui/popup/save_icon.png"))); // NOI18N
        btnLuu.setText(" Lưu");
        btnLuu.setBackground(new java.awt.Color(14, 142, 233));
        btnLuu.setBorder(null);
        btnLuu.setContentAreaFilled(false);
        btnLuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLuu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu.setOpaque(true);
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tourdulich/gui/popup/cancel_icon.png"))); // NOI18N
        btnHuy.setText(" Hủy");
        btnHuy.setBackground(new java.awt.Color(14, 142, 233));
        btnHuy.setBorder(null);
        btnHuy.setContentAreaFilled(false);
        btnHuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setOpaque(true);
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addComponent(lblTenVaiTro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValidateTenVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTenVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTenVaiTro)
                    .addComponent(lblValidateTenVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtTenVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
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

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (validateForm())
        {    
            VaiTroDTO vaiTro = getFormInfo();

            if(this.action.equals("POST")) {             
                    Long newVaiTroId = vaiTroBLL.save(vaiTro);
                    if(newVaiTroId != null) {
                        JOptionPane.showMessageDialog(this, "Lưu thành công!!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Lưu thất bại!!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    }              
            } else if(this.action.equals("PUT")) {              
                    try {
                        vaiTroBLL.update(vaiTro);
                        JOptionPane.showMessageDialog(this, "Lưu thành công!!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    } catch(Exception e) {
                        JOptionPane.showMessageDialog(this, "Lưu thất bại!!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                        e.printStackTrace();
                    }  
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

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
            java.util.logging.Logger.getLogger(PopUpVaiTroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpVaiTroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpVaiTroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpVaiTroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PopUpVaiTroGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupGioiTinh;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblTenVaiTro;
    private javax.swing.JLabel lblValidateTenVaiTro;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JTextField txtTenVaiTro;
    // End of variables declaration//GEN-END:variables

}