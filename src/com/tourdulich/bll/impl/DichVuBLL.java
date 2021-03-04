/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.IDichVuBLL;
import com.tourdulich.dao.IDichVuDAO;
import com.tourdulich.dao.impl.DichVuDAO;
import com.tourdulich.dto.DichVuDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public class DichVuBLL implements IDichVuBLL {

    private IDichVuDAO dichVuDAO;

    public DichVuBLL() {
        this.dichVuDAO = new DichVuDAO();
    }
    
    @Override
    public List<DichVuDTO> findAll() {
        return dichVuDAO.findAll();
    }

    @Override
    public DichVuDTO findById(Long id) {
        return dichVuDAO.findById(id);
    }

    @Override
    public Long save(DichVuDTO dichVu) {
        return dichVuDAO.save(dichVu);
    }

    @Override
    public void update(DichVuDTO dichVu) {
        dichVuDAO.update(dichVu);
    }

    @Override
    public void delete(Long id) {
        dichVuDAO.delete(id);
    }
}
