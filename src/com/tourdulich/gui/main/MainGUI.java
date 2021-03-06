/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.gui.main;

import com.tourdulich.bll.INhanVienBLL;
import com.tourdulich.bll.impl.NhanVienBLL;
import com.tourdulich.dto.NhanVienDTO;
import com.tourdulich.gui.form.QuanLyChiPhiGUI;
import com.tourdulich.gui.others.ComponentResizer;
import com.tourdulich.gui.form.QuanLyDiaDiemGUI;
import com.tourdulich.gui.form.QuanLyDichVuGUI;
import com.tourdulich.gui.form.QuanLyDoanGUI;
import com.tourdulich.gui.form.QuanLyGiaTourGUI;
import com.tourdulich.gui.form.QuanLyKhachHangGUI;
import com.tourdulich.gui.form.QuanLyLoaiDuLichGUI;
import com.tourdulich.gui.form.QuanLyNhanVienGUI;
import com.tourdulich.gui.form.QuanLyTourGUI;
import com.tourdulich.gui.form.QuanLyVaiTroGUI;
import com.tourdulich.gui.form.ThongKeTheoDoanGUI;
import com.tourdulich.gui.form.ThongKeTheoTourGUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import com.tourdulich.gui.menu.MenuItem;
import com.tourdulich.gui.menu.MyScrollBarUI;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.util.List;

/**
 *
 * @author RavenPC
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private boolean menuHided = false;
    private boolean maximized = false;
    ImageIcon iconShowMenu = new ImageIcon(getClass().getResource("/com/tourdulich/img/show_menu_icon.png"));
    ImageIcon iconHideMenu = new ImageIcon(getClass().getResource("/com/tourdulich/img/hide_menu_icon.png"));
    ImageIcon iconRestoreDown = new ImageIcon(getClass().getResource("/com/tourdulich/img/restore_down.png"));
    ImageIcon iconTour = new ImageIcon(getClass().getResource("/com/tourdulich/img/tour_icon.png"));
    ImageIcon iconLoaiDuLich = new ImageIcon(getClass().getResource("/com/tourdulich/img/loai_du_lich_icon.png"));
    ImageIcon iconGiaTour = new ImageIcon(getClass().getResource("/com/tourdulich/img/gia_tour_icon.png"));
    ImageIcon iconDoan = new ImageIcon(getClass().getResource("/com/tourdulich/img/doan_icon.png"));
    ImageIcon iconChiPhi = new ImageIcon(getClass().getResource("/com/tourdulich/img/chi_phi_icon.png"));
    ImageIcon iconDichVu = new ImageIcon(getClass().getResource("/com/tourdulich/img/dich_vu_icon.png"));
    ImageIcon iconLoaiDichVu = new ImageIcon(getClass().getResource("/com/tourdulich/img/loai_dich_vu_icon.png"));
    ImageIcon iconDiaDiem = new ImageIcon(getClass().getResource("/com/tourdulich/img/dia_diem_icon.png"));
    ImageIcon iconKhachHang = new ImageIcon(getClass().getResource("/com/tourdulich/img/khach_hang_icon.png"));
    ImageIcon iconKhachSan = new ImageIcon(getClass().getResource("/com/tourdulich/img/hotel_icon.png"));
    ImageIcon iconNhaHang = new ImageIcon(getClass().getResource("/com/tourdulich/img/nha_hang_icon.png"));
    ImageIcon iconPhuongTien = new ImageIcon(getClass().getResource("/com/tourdulich/img/phuong_tien_icon.png"));
    ImageIcon iconNhanVien = new ImageIcon(getClass().getResource("/com/tourdulich/img/nhan_vien_icon.png"));
    ImageIcon iconVaiTro = new ImageIcon(getClass().getResource("/com/tourdulich/img/vai_tro_icon.png"));
    ImageIcon iconThongKe = new ImageIcon(getClass().getResource("/com/tourdulich/img/thong_ke_icon.png"));
    
   
        
        //--submenu loai du lich--
                MenuItem menuLoaiDuLich = new MenuItem(iconLoaiDuLich, "Quản Lý loại hình du lịch", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {     
                        panelBody.removeAll();
                        panelBody.add(new QuanLyLoaiDuLichGUI());
                        panelBody.repaint();
                        panelBody.revalidate();
                        Selected(menuTour);
                    }
                });
        
        //--submenu gia tour--
                MenuItem menuGiaTour = new MenuItem(iconGiaTour, "Quản Lý Giá Tour", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {     
                        panelBody.removeAll();
                        panelBody.add(new QuanLyGiaTourGUI());
                        panelBody.repaint();
                        panelBody.revalidate();
                        Selected(menuTour);
                    }
                });
        
        MenuItem menuTour = new MenuItem(iconTour, "Quản Lý Tour", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {     
                panelBody.removeAll();
                panelBody.add(new QuanLyTourGUI());
                panelBody.repaint();
                panelBody.revalidate();
              
                Selected(menuTour);
            }
        }, menuLoaiDuLich, menuGiaTour);
     
        
        //--submenu doan--
                MenuItem menuChiPhi = new MenuItem(iconChiPhi, "Quản Lý Chi Phí", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {     
                        panelBody.removeAll();
                        panelBody.add(new QuanLyChiPhiGUI());
                        panelBody.repaint();
                        panelBody.revalidate();
                        Selected(menuDoan);
                    }
                });
                
        MenuItem menuDoan = new MenuItem(iconDoan, "Quản Lý Đoàn", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new QuanLyDoanGUI());
                panelBody.repaint();
                panelBody.revalidate();
                Selected(menuDoan);
            }
        }, menuChiPhi);
             
        
        MenuItem menuDichVu = new MenuItem(iconDichVu, "Quản Lý Dịch Vụ", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new QuanLyDichVuGUI());
                panelBody.repaint();
                panelBody.revalidate();
              
                Selected(menuDichVu);
            }
        });
        
        MenuItem menuDiaDiem = new MenuItem(iconDiaDiem, "Quản Lý Địa Điểm", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new QuanLyDiaDiemGUI());
                panelBody.repaint();
                panelBody.revalidate();
                Selected(menuDiaDiem);
            }
        });
        
        MenuItem menuKhachHang = new MenuItem(iconKhachHang, "Quản Lý Khách Hàng", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new QuanLyKhachHangGUI());
                panelBody.repaint();
                panelBody.revalidate();
                Selected(menuKhachHang);
            }
        });
        
        
        //----Sub menu vai tro -----
                MenuItem menuVaiTro = new MenuItem(iconVaiTro, "Quản Lý Vai Trò", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        panelBody.removeAll();
                        panelBody.add(new QuanLyVaiTroGUI());
                        panelBody.repaint();
                        panelBody.revalidate();
                        Selected(menuNhanVien);
                    }
                });
        
        MenuItem menuNhanVien = new MenuItem(iconNhanVien, "Quản Lý Nhân Viên", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
                panelBody.add(new QuanLyNhanVienGUI());
                panelBody.repaint();
                panelBody.revalidate();
                
                
                Selected(menuNhanVien);
            }
        }, menuVaiTro);
        
       
        //----Sub menu TK -----
                MenuItem menuTkTheoTour= new MenuItem(iconTour, "Theo Tour",new ActionListener() {
                  @Override
                    public void actionPerformed(ActionEvent ae) {
                    panelBody.removeAll();
                    panelBody.add(new ThongKeTheoTourGUI());
                    panelBody.repaint();
                    panelBody.revalidate();
                    Selected(menuThongKe);
                    }
                });
                
                MenuItem menuTkTheoDoan= new MenuItem(iconDoan, "Theo Đoàn",new ActionListener() {
                  @Override
                    public void actionPerformed(ActionEvent ae) {
                    panelBody.removeAll();
                    panelBody.add(new ThongKeTheoDoanGUI());
                    panelBody.repaint();
                    panelBody.revalidate();
                    Selected(menuThongKe);
                    }
                });
                
       MenuItem menuThongKe = new MenuItem(iconThongKe, "Thống Kê",new ActionListener() {
       @Override
            public void actionPerformed(ActionEvent ae) {
              
                
                Selected(menuThongKe);
            }
        }, menuTkTheoTour,menuTkTheoDoan);
         
    public MainGUI() {
        initComponents();
       
        invisibleMenuScrollBar(8);
        panelBody.add(new QuanLyTourGUI());
        panelBody.repaint();
        panelBody.revalidate();
        CustomWindow();
        addMenu(menuTour, menuDoan, menuDichVu,menuDiaDiem,menuKhachHang,menuNhanVien,menuThongKe);
        Selected(menuTour);
        
//        TESTING
        INhanVienBLL nhanVienBLL = new NhanVienBLL();
        NhanVienDTO nhanVien = new NhanVienDTO();
//INSERT DATA
//        vaiTro.setTenVaiTro("Bảo vệ");
//        vaiTroBLL.save(vaiTro);
////UPDATE DATA
//        vaiTro.setId(6L);
//        vaiTro.setTenVaiTro("Tai xe");
//        vaiTroBLL.update(vaiTro);
//DELETE DATA
//        vaiTroBLL.delete(7L);

//DISPLAY DATA
//        List<NhanVienDTO> list = nhanVienBLL.findAll();
//        for(NhanVienDTO vt : list) {
//            System.out.println(vt.toString() + "\n");
//        }
    }
    
    public void invisibleMenuScrollBar(int speed)
    {
          JScrollBar scrollBar = new JScrollBar(JScrollBar.VERTICAL) {

                    @Override
                    public boolean isVisible() {
                        return true;
                    }
                };
        menuScroll.setVerticalScrollBar(scrollBar);
        menuScroll.setVerticalScrollBarPolicy(menuScroll.VERTICAL_SCROLLBAR_NEVER);
        menuScroll.getVerticalScrollBar().setUnitIncrement(speed);
    }
    public void center()
    {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    public void CustomWindow()
    {   
        Color flatBlue = new Color(14,142,233);
        this.setMinimumSize(new Dimension(800,600));
        this.setSize(new Dimension(1280,720));
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(0,2,2,2, flatBlue));   
        center();
        ComponentResizer cr = new ComponentResizer();
        lblMinimize.setText("\u2014");
        lblExit.setText("X");
        lblMaximize_Restore.setText("\u2750");
        cr.registerComponent(this);
    }
    
    
    
    public void Maximize_Restore(boolean state)
    {
       if (state)
       {
            lblMaximize_Restore.setText("\u2750");
            lblMaximize_Restore.setIcon(null);
            maximized = false;
            this.setPreferredSize(new Dimension(800,600));
            this.setExtendedState(JFrame.NORMAL);
       }
       else 
       {
           lblMaximize_Restore.setIcon(iconRestoreDown);
           lblMaximize_Restore.setText("");
           this.setExtendedState(JFrame.MAXIMIZED_BOTH);
           maximized = true;   
       }
    }
    
    public void resetSelect()
    {
       Color lightGray = new Color(240,240,240);
       menuTour.setColor(lightGray);
       menuDoan.setColor(lightGray);
       menuDichVu.setColor(lightGray);
       menuDiaDiem.setColor(lightGray);
       menuKhachHang.setColor(lightGray);
       menuNhanVien.setColor(lightGray);
       menuThongKe.setColor(lightGray);
    }
   
    public void Selected(MenuItem item)
    {   
        resetSelect();
        item.setColor(Color.WHITE);
    }
    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblMaximize_Restore = new javax.swing.JLabel();
        lblShow_HideMenu = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        menuScroll = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        pnlAccount = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelBody = new javax.swing.JPanel();

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

        lblMaximize_Restore.setBackground(new java.awt.Color(255, 255, 255));
        lblMaximize_Restore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMaximize_Restore.setForeground(new java.awt.Color(255, 255, 255));
        lblMaximize_Restore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaximize_Restore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaximize_RestoreMouseClicked(evt);
            }
        });

        lblShow_HideMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShow_HideMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tourdulich/img/hide_menu_icon.png"))); // NOI18N
        lblShow_HideMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblShow_HideMenuMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addComponent(lblShow_HideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 654, Short.MAX_VALUE)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblMaximize_Restore, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMaximize_Restore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblShow_HideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);

        panelMenu.setBackground(new java.awt.Color(115, 120, 230));
        panelMenu.setPreferredSize(new java.awt.Dimension(300, 384));

        menuScroll.setBorder(null);

        menus.setBackground(new java.awt.Color(255, 255, 255));
        menus.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        menuScroll.setViewportView(menus);

        pnlAccount.setBackground(new java.awt.Color(0, 153, 255));
        pnlAccount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tourdulich/img/avatar_icon.png"))); // NOI18N
        jLabel1.setText("Xin chào Admin");

        javax.swing.GroupLayout pnlAccountLayout = new javax.swing.GroupLayout(pnlAccount);
        pnlAccount.setLayout(pnlAccountLayout);
        pnlAccountLayout.setHorizontalGroup(
            pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
        );
        pnlAccountLayout.setVerticalGroup(
            pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(pnlAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addComponent(pnlAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelBody, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(853, 426));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMaximize_RestoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaximize_RestoreMouseClicked
        // TODO add your handling code here:
        Maximize_Restore(maximized);
    }//GEN-LAST:event_lblMaximize_RestoreMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void panelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseDragged
           setLocation (evt.getXOnScreen()-(getWidth()/2),evt.getYOnScreen()-10);
    }//GEN-LAST:event_panelHeaderMouseDragged

    private void lblShow_HideMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShow_HideMenuMousePressed
        // TODO add your handling code here:
        if (menuHided)
        {
        panelMenu.setVisible(true);
        menuHided = false;
        lblShow_HideMenu.setIcon(iconHideMenu);
        }
        else {
             panelMenu.setVisible(false);
             menuHided = true; 
             lblShow_HideMenu.setIcon(iconShowMenu);
             }
    }//GEN-LAST:event_lblShow_HideMenuMousePressed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMaximize_Restore;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblShow_HideMenu;
    private javax.swing.JScrollPane menuScroll;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel pnlAccount;
    // End of variables declaration//GEN-END:variables
}
