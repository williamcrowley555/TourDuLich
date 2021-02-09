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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Long save(NhanVienDTO nhanVien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(NhanVienDTO nhanVien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
