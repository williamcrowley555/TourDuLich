/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.IDsNhanVienDoanBLL;
import com.tourdulich.dao.IDsNhanVienDoanDAO;
import com.tourdulich.dao.impl.DsNhanVienDoanDAO;
import com.tourdulich.dto.DsNhanVienDoanDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public class DsNhanVienDoanBLL implements IDsNhanVienDoanBLL {

    private IDsNhanVienDoanDAO dsNhanVienDoanDAO;

    public DsNhanVienDoanBLL() {
        this.dsNhanVienDoanDAO = new DsNhanVienDoanDAO();
    }
    
    @Override
    public List<DsNhanVienDoanDTO> findAll() {
        return dsNhanVienDoanDAO.findAll();
    }

    @Override
    public DsNhanVienDoanDTO findById(Long id) {
        return dsNhanVienDoanDAO.findById(id);
    }

    @Override
    public Long save(DsNhanVienDoanDTO dsNhanVienDoan) {
        return dsNhanVienDoanDAO.save(dsNhanVienDoan);
    }

    @Override
    public void update(DsNhanVienDoanDTO dsNhanVienDoan) {
        dsNhanVienDoanDAO.update(dsNhanVienDoan);
    }

    @Override
    public void delete(Long id) {
        dsNhanVienDoanDAO.delete(id);
    }
}
