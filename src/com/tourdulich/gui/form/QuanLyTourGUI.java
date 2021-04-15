/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.gui.form;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import com.tourdulich.gui.menu.MyScrollBarUI;
import com.tourdulich.bll.ITourBLL;
import com.tourdulich.bll.ILoaiDuLichBLL;
import com.tourdulich.bll.impl.TourBLL;
import com.tourdulich.bll.impl.LoaiDuLichBLL;
import com.tourdulich.gui.popup.PopUpTableDiaDiemGUI;
import com.tourdulich.gui.popup.PopUpTourGUI;
import com.tourdulich.util.TableSetupUtil;
import com.tourdulich.util.TourTableLoaderUtil;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author RavenPC
 */
public class QuanLyTourGUI extends javax.swing.JPanel {

    /**
     * Creates new form Panel1
     */
    String[] columnNames = {
        "Id",
        "Tên Tour",
        "Tên Loại Du Lịch",
        "Đặc Điểm"
        };
    
    private ITourBLL tourBLL;
    private ILoaiDuLichBLL loaiDuLichBLL;
    private PopUpTourGUI popUp;
    private PopUpTableDiaDiemGUI popUpDiaDiem;
    TableRowSorter<TableModel> rowSorter = null;
    
    public QuanLyTourGUI() {
        initComponents();
        tourBLL = new TourBLL();
        loaiDuLichBLL = new LoaiDuLichBLL();
        
        loadTableData();
        
//        Vector header = createHeader(columnNames);
//        DefaultTableModel model = (DefaultTableModel) tblTour.getModel();
//        model = new DefaultTableModel(header, 0);
       
//        Vector row = new Vector();
//        row.add("1");
//        row.add("Tour Miền Nam");
//        row.add("1");
//        row.add("7 ngày");
    
        
         
//        model.addRow(row);
//        tblTour.setModel(model);
        headerColor(14,142,233,tblTour);
        scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());
        
    }
    
    public Vector createHeader(Object[] columnNames){
        Vector header = new Vector();
        for(Object colName : columnNames){
            header.add(colName);
        }
        return header;
    }
    
    public void headerColor(int r, int b, int g, JTable table)
    {
        Color color = new Color(r,b,g);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(color);
        headerRenderer.setForeground(color.WHITE);
        

        for (int i = 0; i < table.getModel().getColumnCount(); i++) {
        table.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }       
         
        table.setFont(new Font("Tahoma", Font.PLAIN, 16));
    }
    
    public void loadTableData() {
        tblTour.setModel(new TourTableLoaderUtil().setTable(tourBLL.findAll(), this.columnNames)) ;
        this.rowSorter = TableSetupUtil.setTableFilter(tblTour, txtTimKiem);
        headerColor(14,142,233,tblTour);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightClickMenu = new javax.swing.JPopupMenu();
        itemSua = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnDanhSachDiaDiem = new javax.swing.JButton();
        lblTimKiem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tblTour = new javax.swing.JTable();

        itemSua.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tourdulich/img/edit_icon.png"))); // NOI18N
        itemSua.setText("Sửa");
        itemSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSuaActionPerformed(evt);
            }
        });
        rightClickMenu.add(itemSua);

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(808, 150));

        btnThem.setBackground(new java.awt.Color(14, 142, 233));
        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.setContentAreaFilled(false);
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.setOpaque(true);
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemMousePressed(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimKiem.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(14, 142, 233)));
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Quản Lý Tour");

        btnDanhSachDiaDiem.setBackground(new java.awt.Color(14, 142, 233));
        btnDanhSachDiaDiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDanhSachDiaDiem.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachDiaDiem.setText("Danh sách địa điểm");
        btnDanhSachDiaDiem.setContentAreaFilled(false);
        btnDanhSachDiaDiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDanhSachDiaDiem.setOpaque(true);
        btnDanhSachDiaDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDanhSachDiaDiemMousePressed(evt);
            }
        });
        btnDanhSachDiaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachDiaDiemActionPerformed(evt);
            }
        });

        lblTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tourdulich/img/search_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDanhSachDiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDanhSachDiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblTour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblTourMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblTourMouseReleased(evt);
            }
        });
        scroll.setViewportView(tblTour);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnThemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMousePressed
           if (this.popUp == null) {
            this.popUp = new PopUpTourGUI("POST");
            
        } else {
            this.popUp.toFront();
            this.popUp.center();
        }
        popUp.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            popUp = null;
           loadTableData();
        }
    });
    }//GEN-LAST:event_btnThemMousePressed

    private void tblTourMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTourMousePressed
        // TODO add your handling code here:
        int r = tblTour.rowAtPoint(evt.getPoint());
        if (r >= 0 && r < tblTour.getRowCount()) {
            tblTour.setRowSelectionInterval(r, r);
        } else {
           tblTour.clearSelection();
        }
        int rowindex = tblTour.getSelectedRow();
        if (rowindex < 0)
            return;
        if (evt.isPopupTrigger() && evt.getComponent() instanceof JTable ) {
            
            rightClickMenu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblTourMousePressed

    private void btnDanhSachDiaDiemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachDiaDiemMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDanhSachDiaDiemMousePressed

    private void btnDanhSachDiaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachDiaDiemActionPerformed
        int selectedRow = tblTour.getSelectedRow();
        if (this.popUpDiaDiem == null) {
            if(selectedRow >=0)
            {
            this.popUpDiaDiem = new PopUpTableDiaDiemGUI(tblTour.getModel().getValueAt(tblTour.getSelectedRow(), 0).toString());
            popUpDiaDiem.center();
            popUpDiaDiem.setVisible(true);
            popUpDiaDiem.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                       popUpDiaDiem = null;
                       loadTableData();
                    }
                    });
            } else 
                JOptionPane.showMessageDialog(this, "Hãy chọn 1 tour", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        } else {
            this.popUpDiaDiem.toFront();
            this.popUpDiaDiem.center();
        }
    }//GEN-LAST:event_btnDanhSachDiaDiemActionPerformed

    private void tblTourMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTourMouseReleased
        // TODO add your handling code here:
        int r = tblTour.rowAtPoint(evt.getPoint());
        if (r >= 0 && r < tblTour.getRowCount()) {
            tblTour.setRowSelectionInterval(r, r);
        } else {
           tblTour.clearSelection();
        }
        int rowindex = tblTour.getSelectedRow();
        if (rowindex < 0)
            return;
        if (evt.isPopupTrigger() && evt.getComponent() instanceof JTable ) {
            
            rightClickMenu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblTourMouseReleased

    private void itemSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSuaActionPerformed
        int rowindex = tblTour.getSelectedRow();
        Long id = Long.parseLong(tblTour.getValueAt(rowindex,0).toString());
        if (this.popUp == null) {
            popUp = new PopUpTourGUI("PUT", tourBLL.findById(id));
        } else {
            this.popUp.toFront();
            this.popUp.center();
        }
        popUp.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                popUp = null;
                loadTableData();
            }
        });
    }//GEN-LAST:event_itemSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDanhSachDiaDiem;
    private javax.swing.JButton btnThem;
    private javax.swing.JMenuItem itemSua;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPopupMenu rightClickMenu;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tblTour;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
