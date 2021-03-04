/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.IDsKhachDoanBLL;
import com.tourdulich.dao.IDsKhachDoanDAO;
import com.tourdulich.dao.impl.DsKhachDoanDAO;
import com.tourdulich.dto.DsKhachDoanDTO;
import java.util.List;

/**
 *
 * @author kossp
 */
public class DsKhachDoanBLL implements IDsKhachDoanBLL {
    private IDsKhachDoanDAO dsKhachDoanDAO;
    
    public DsKhachDoanBLL() {
        this.dsKhachDoanDAO = new DsKhachDoanDAO();
    }    
    
    @Override
    public List<DsKhachDoanDTO> findAll() {
        return dsKhachDoanDAO.findAll();
    }

   @Override
    public DsKhachDoanDTO findById(Long id) {
        return dsKhachDoanDAO.findById(id);
    }    
    
    @Override
    public Long save(DsKhachDoanDTO dsKhachDoan) {
        return dsKhachDoanDAO.save(dsKhachDoan);
    }

    @Override
    public void delete(Long id) {
        dsKhachDoanDAO.delete(id);
    }
}
