/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.INhanVienBLL;
import com.tourdulich.dao.INhanVienDAO;
import com.tourdulich.dao.impl.NhanVienDAO;
import com.tourdulich.dto.NhanVienDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public class NhanVienBLL implements INhanVienBLL {
    
    private INhanVienDAO nhanVienDAO;

    public NhanVienBLL() {
        this.nhanVienDAO = new NhanVienDAO();
    }

    @Override
    public List<NhanVienDTO> findAll() {
        return nhanVienDAO.findAll();
    }

    @Override
    public NhanVienDTO findById(Long id) {
        return nhanVienDAO.findById(id);
    }

    @Override
    public NhanVienDTO findBySdt(String sdt) {
        return nhanVienDAO.findBySdt(sdt);
    }

    @Override
    public Long save(NhanVienDTO nhanVien) {
        return nhanVienDAO.save(nhanVien);
    }

    @Override
    public void update(NhanVienDTO nhanVien) {
        nhanVienDAO.update(nhanVien);
    }

    @Override
    public void delete(Long id) {
        nhanVienDAO.delete(id);
    }
}
