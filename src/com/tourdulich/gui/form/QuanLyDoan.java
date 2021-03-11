/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.gui.form;

import com.tourdulich.bll.IDoanBLL;
import com.tourdulich.bll.ITourBLL;
import com.tourdulich.bll.impl.DoanBLL;
import com.tourdulich.bll.impl.TourBLL;
import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import com.tourdulich.gui.menu.MyScrollBarUI;
import com.tourdulich.gui.popup.popUpCapVaiTro;
import com.tourdulich.gui.popup.popUpDoan;
import com.tourdulich.gui.popup.popUpDsNguoiDi;
import com.tourdulich.util.DoanTableLoaderUtil;
import com.tourdulich.util.TableSetupUtil;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author RavenPC
 */
public class QuanLyDoan extends javax.swing.JPanel {

    /**
     * Creates new form Panel1
     */
    private popUpDsNguoiDi popUpNguoiDi;
    private popUpCapVaiTro popUpCapVaiTro;
    private popUpDoan popUp = null;
    String[] columnNames = {
                            "Id",
                            "Tên Đoàn",
                            "Ngày Khởi Hành",
                            "Ngày Kết Thúc",
                            "Id Tour",
                            "Số Lượng",
                            "Giá tiền"};
    
    private IDoanBLL doanBLL;
    private ITourBLL tourBLL;
   // private popUpDoan popUp = null;
    TableRowSorter<TableModel> rowSorter = null;
    
    public QuanLyDoan() {
        initComponents();
        doanBLL = new DoanBLL();
        tourBLL = new TourBLL();
//        Vector header = createHeader(columnNames);
//        DefaultTableModel model = (DefaultTableModel) tblDoan.getModel();
//        model = new DefaultTableModel(header, 0);
//       
//        Vector row = new Vector();
//        row.add("1");
//        row.add("Đoàn NA01");
//        row.add("6/2/2021");
//        row.add("7/2/2021");
//        row.add("1");
//        row.add(30);

//        model.addRow(row);
//        tblDoan.setModel(model);
        loadTableData();
        
        headerColor(14,142,233,tblDoan);
        scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());
    }
    
    public void loadTableData() {
        tblDoan.setModel(new DoanTableLoaderUtil().setTable(doanBLL.findAll(), this.columnNames)) ;
        this.rowSorter = TableSetupUtil.setTableFilter(tblDoan, txtTimKiem);
        headerColor(14,142,233,tblDoan);
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
        itemXoa = new javax.swing.JMenuItem();
        itemQuanLyKhachTrongDoan = new javax.swing.JMenuItem();
        itemQuanLyNhanVienTrongDoan = new javax.swing.JMenuItem();
        pnlHead = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnTaoDSNguoiDi = new javax.swing.JButton();
        btnCapVaiTro = new javax.swing.JButton();
        pnlBody = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tblDoan = new javax.swing.JTable();

        itemSua.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tourdulich/img/edit_icon.png"))); // NOI18N
        itemSua.setText("Sửa");
        itemSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSuaActionPerformed(evt);
            }
        });
        rightClickMenu.add(itemSua);

        itemXoa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tourdulich/img/delete_icon.png"))); // NOI18N
        itemXoa.setText("Xóa");
        itemXoa.setToolTipText("");
        itemXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemXoaActionPerformed(evt);
            }
        });
        rightClickMenu.add(itemXoa);

        itemQuanLyKhachTrongDoan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemQuanLyKhachTrongDoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tourdulich/img/edit_icon.png"))); // NOI18N
        itemQuanLyKhachTrongDoan.setText("Quản Lý Khách Trong Đoàn");
        itemQuanLyKhachTrongDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemQuanLyKhachTrongDoanActionPerformed(evt);
            }
        });
        rightClickMenu.add(itemQuanLyKhachTrongDoan);

        itemQuanLyNhanVienTrongDoan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemQuanLyNhanVienTrongDoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tourdulich/img/edit_icon.png"))); // NOI18N
        itemQuanLyNhanVienTrongDoan.setText("Quản Lý Nhân Viên Trong Đoàn");
        itemQuanLyNhanVienTrongDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemQuanLyNhanVienTrongDoanActionPerformed(evt);
            }
        });
        rightClickMenu.add(itemQuanLyNhanVienTrongDoan);

        setLayout(new java.awt.BorderLayout());

        pnlHead.setBackground(new java.awt.Color(255, 255, 255));
        pnlHead.setPreferredSize(new java.awt.Dimension(808, 150));

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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnThemMouseReleased(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Quản Lý Đoàn");

        btnTaoDSNguoiDi.setBackground(new java.awt.Color(14, 142, 233));
        btnTaoDSNguoiDi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTaoDSNguoiDi.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoDSNguoiDi.setText("Tạo DS Người Đi");
        btnTaoDSNguoiDi.setContentAreaFilled(false);
        btnTaoDSNguoiDi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTaoDSNguoiDi.setOpaque(true);
        btnTaoDSNguoiDi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTaoDSNguoiDiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTaoDSNguoiDiMouseReleased(evt);
            }
        });
        btnTaoDSNguoiDi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoDSNguoiDiActionPerformed(evt);
            }
        });

        btnCapVaiTro.setBackground(new java.awt.Color(14, 142, 233));
        btnCapVaiTro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCapVaiTro.setForeground(new java.awt.Color(255, 255, 255));
        btnCapVaiTro.setText("Cấp Vai Trò Nhân Viên");
        btnCapVaiTro.setContentAreaFilled(false);
        btnCapVaiTro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapVaiTro.setOpaque(true);
        btnCapVaiTro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCapVaiTroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCapVaiTroMouseReleased(evt);
            }
        });
        btnCapVaiTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapVaiTroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHeadLayout = new javax.swing.GroupLayout(pnlHead);
        pnlHead.setLayout(pnlHeadLayout);
        pnlHeadLayout.setHorizontalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTaoDSNguoiDi, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapVaiTro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlHeadLayout.setVerticalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaoDSNguoiDi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        add(pnlHead, java.awt.BorderLayout.PAGE_START);

        pnlBody.setBackground(new java.awt.Color(255, 255, 255));

        tblDoan.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblDoanMouseReleased(evt);
            }
        });
        scroll.setViewportView(tblDoan);

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addComponent(scroll)
                .addContainerGap())
        );

        add(pnlBody, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnThemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemMouseReleased

    private void btnThemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMousePressed
        // TODO add your handling code here:
        if (this.popUp == null) {
            this.popUp = new popUpDoan("POST");
            
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

    private void itemSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSuaActionPerformed
        int rowindex = tblDoan.getSelectedRow();
        Long id = Long.parseLong(tblDoan.getValueAt(rowindex,0).toString());
        if (this.popUp == null) {
            popUp = new popUpDoan("PUT", doanBLL.findById(id));
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

    private void itemXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemXoaActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa dòng này?");
        if(response == JOptionPane.YES_OPTION) {
            int rowindex = tblDoan.getSelectedRow();
            Long id = Long.parseLong(tblDoan.getValueAt(rowindex,0).toString());
            try {
                doanBLL.delete(id);
                JOptionPane.showMessageDialog(this, "Xóa thành công!!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch(Exception e) {
                JOptionPane.showMessageDialog(this, "Xóa thất bại!!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
        loadTableData();
    }//GEN-LAST:event_itemXoaActionPerformed

    private void tblDoanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoanMouseReleased
        // TODO add your handling code here:
        int r = tblDoan.rowAtPoint(evt.getPoint());
        if (r >= 0 && r < tblDoan.getRowCount()) {
            tblDoan.setRowSelectionInterval(r, r);
        } else {
           tblDoan.clearSelection();
        }
        int rowindex = tblDoan.getSelectedRow();
        if (rowindex < 0)
            return;
        if (evt.isPopupTrigger() && evt.getComponent() instanceof JTable ) {
            
            rightClickMenu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblDoanMouseReleased

    private void itemQuanLyKhachTrongDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemQuanLyKhachTrongDoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemQuanLyKhachTrongDoanActionPerformed

    private void itemQuanLyNhanVienTrongDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemQuanLyNhanVienTrongDoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemQuanLyNhanVienTrongDoanActionPerformed

    private void btnTaoDSNguoiDiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaoDSNguoiDiMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaoDSNguoiDiMousePressed

    private void btnTaoDSNguoiDiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaoDSNguoiDiMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaoDSNguoiDiMouseReleased

    private void btnTaoDSNguoiDiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoDSNguoiDiActionPerformed
        // TODO add your handling code here:    
        if (this.popUpNguoiDi == null) {
             popUpNguoiDi = new popUpDsNguoiDi("POST");
             popUpNguoiDi.setVisible(true);
            
        } else {
            this.popUpNguoiDi.toFront();
            this.popUpNguoiDi.center();
        }
        popUpNguoiDi.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            popUpNguoiDi = null;
            loadTableData();
        }
    });
    }//GEN-LAST:event_btnTaoDSNguoiDiActionPerformed

    private void btnCapVaiTroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapVaiTroMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapVaiTroMousePressed

    private void btnCapVaiTroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapVaiTroMouseReleased
     
    }//GEN-LAST:event_btnCapVaiTroMouseReleased

    private void btnCapVaiTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapVaiTroActionPerformed
         if (this.popUpCapVaiTro == null) {
             popUpCapVaiTro = new popUpCapVaiTro("POST");
             popUpCapVaiTro.setVisible(true);
            
        } else {
            this.popUpCapVaiTro.toFront();
            this.popUpCapVaiTro.center();
        }
        popUpCapVaiTro.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            popUpCapVaiTro = null;
            loadTableData();
        }
    });
    }//GEN-LAST:event_btnCapVaiTroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapVaiTro;
    private javax.swing.JButton btnTaoDSNguoiDi;
    private javax.swing.JButton btnThem;
    private javax.swing.JMenuItem itemQuanLyKhachTrongDoan;
    private javax.swing.JMenuItem itemQuanLyNhanVienTrongDoan;
    private javax.swing.JMenuItem itemSua;
    private javax.swing.JMenuItem itemXoa;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPopupMenu rightClickMenu;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tblDoan;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
