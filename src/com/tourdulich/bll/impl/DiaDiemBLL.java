/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.IDiaDiemBLL;
import com.tourdulich.dao.IDiaDiemDAO;
import com.tourdulich.dao.impl.DiaDiemDAO;
import com.tourdulich.dto.DiaDiemDTO;
import java.util.List;

/**
 *
 * @author kossp
 */
public class DiaDiemBLL implements IDiaDiemBLL {
    
    private IDiaDiemDAO diaDiemDAO;
    
    public DiaDiemBLL() {
        this.diaDiemDAO = new DiaDiemDAO();
    }
    
    @Override
    public List<DiaDiemDTO> findAll() {
        return diaDiemDAO.findAll();
    }

   @Override
    public DiaDiemDTO findById(Long id) {
        return diaDiemDAO.findById(id);
    }
    
    @Override
    public Long save(DiaDiemDTO diaDiem) {
        return diaDiemDAO.save(diaDiem);
    }

    @Override
    public void update(DiaDiemDTO diaDiem) {
        diaDiemDAO.update(diaDiem);
    }

    @Override
    public void delete(Long id) {
        diaDiemDAO.delete(id);
    }

    @Override
    public List<DiaDiemDTO> findByIdTinh(Long idTinh) {
        return diaDiemDAO.findByIdTinh(idTinh);
    }
}
