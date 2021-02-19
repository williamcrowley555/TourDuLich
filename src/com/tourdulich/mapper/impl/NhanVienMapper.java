/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.mapper.impl;

import com.tourdulich.dto.NhanVienDTO;
import com.tourdulich.mapper.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class NhanVienMapper implements RowMapper<NhanVienDTO>{

    @Override
    public NhanVienDTO mapRow(ResultSet rs) {
        try {
            NhanVienDTO nhanVien = new NhanVienDTO();
            nhanVien.setId(rs.getLong("id"));
            nhanVien.setHo(rs.getString("ho"));
            nhanVien.setTen(rs.getString("ten"));
            nhanVien.setGioiTinh(rs.getBoolean("gioi_tinh"));
            nhanVien.setNgaySinh(rs.getDate("ngay_sinh"));
            nhanVien.setDiaChi(rs.getString("dia_chi"));
            nhanVien.setSdt(rs.getString("sdt"));
            nhanVien.setHinhAnh(rs.getBytes("hinh_anh"));
            nhanVien.setIdVaiTro(rs.getLong("id_vai_tro"));
            
            return nhanVien;
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
