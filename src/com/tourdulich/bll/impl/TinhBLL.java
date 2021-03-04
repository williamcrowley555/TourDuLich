/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.ITinhBLL;
import com.tourdulich.dao.ITinhDAO;
import com.tourdulich.dao.impl.TinhDAO;
import com.tourdulich.dto.TinhDTO;
import java.util.List;

/**
 *
 * @author kossp
 */
public class TinhBLL implements ITinhBLL {    
    private ITinhDAO tinhDAO;
    
    public TinhBLL() {
        this.tinhDAO = new TinhDAO();
    }    
    
    @Override
    public List<TinhDTO> findAll() {
        return tinhDAO.findAll();
    }

   @Override
    public TinhDTO findById(Long id) {
        return tinhDAO.findById(id);
    }          
    
    @Override
    public Long save(TinhDTO tinh) {
        return tinhDAO.save(tinh);
    }

    @Override
    public void update(TinhDTO tinh) {
        tinhDAO.update(tinh);
    }

    @Override
    public void delete(Long id) {
        tinhDAO.delete(id);
    }
}
