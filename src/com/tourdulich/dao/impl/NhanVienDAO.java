/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao.impl;

import com.tourdulich.dao.INhanVienDAO;
import com.tourdulich.dto.NhanVienDTO;
import com.tourdulich.mapper.impl.NhanVienMapper;
import java.util.List;

/**
 *
 * @author HP
 */
public class NhanVienDAO extends AbstractDAO<NhanVienDTO> implements INhanVienDAO {

    @Override
    public List<NhanVienDTO> findAll() {
        String sql = "SELECT * FROM nhan_vien";
        return query(sql, new NhanVienMapper());
    }

    @Override
    public NhanVienDTO findById(Long id) {
        String sql = "SELECT * FROM nhan_vien WHERE id = ?";
        List<NhanVienDTO> nhanVien = query(sql, new NhanVienMapper(), id);
        return nhanVien.isEmpty() ? null : nhanVien.get(0);
                
    }

    @Override
    public NhanVienDTO findBySdt(String sdt) {
        String sql = "SELECT * FROM nhan_vien WHERE sdt = ?";
        List<NhanVienDTO> nhanVien = query(sql, new NhanVienMapper(), sdt);
        return nhanVien.isEmpty() ? null : nhanVien.get(0);
    }

    @Override
    public Long save(NhanVienDTO nhanVien) {
        String sql = "INSERT INTO nhan_vien(ho, ten, gioi_tinh, ngay_sinh, dia_chi, sdt, hinh_anh, id_vai_tro) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        return insert(sql, nhanVien.getHo(), nhanVien.getTen(), nhanVien.getGioiTinh(), nhanVien.getNgaySinh(), nhanVien.getDiaChi(), 
                nhanVien.getSdt(), nhanVien.getHinhAnh(), nhanVien.getIdVaiTro());
    }

    @Override
    public void update(NhanVienDTO nhanVien) {
        String sql = "UPDATE nhan_vien SET ho = ?, ten = ?, gioi_tinh = ?, ngay_sinh = ?, dia_chi = ?, sdt = ?, "
                + "hinh_anh = ?, id_vai_tro = ? WHERE id = ?";
        update(sql, nhanVien.getHo(), nhanVien.getTen(), nhanVien.getGioiTinh(), nhanVien.getNgaySinh(), nhanVien.getDiaChi(), 
                nhanVien.getSdt(), nhanVien.getHinhAnh(), nhanVien.getIdVaiTro(), nhanVien.getId());
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM nhan_vien WHERE id = ?";
        update(sql, id);
    }
}
