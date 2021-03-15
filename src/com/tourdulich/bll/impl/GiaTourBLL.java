/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.IGiaTourBLL;
import com.tourdulich.dao.IGiaTourDAO;
import com.tourdulich.dao.impl.GiaTourDAO;
import com.tourdulich.dto.GiaTourDTO;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author kossp
 */
public class GiaTourBLL implements IGiaTourBLL {
    private IGiaTourDAO giaTourDAO;
    
    public GiaTourBLL() {
        this.giaTourDAO = new GiaTourDAO();
    }    
    
    @Override
    public List<GiaTourDTO> findAll() {
        return giaTourDAO.findAll();
    }

   @Override
    public GiaTourDTO findById(Long id) {
        return giaTourDAO.findById(id);
    }        
    
    @Override
    public Long save(GiaTourDTO giaTour) {
        return giaTourDAO.save(giaTour);
    }

    @Override
    public void update(GiaTourDTO giaTour) {
        giaTourDAO.update(giaTour);
    }

    @Override
    public void delete(Long id) {
        giaTourDAO.delete(id);
    }

    @Override
    public List<GiaTourDTO> findByIdTourAndDatesBetween(Long idTour, LocalDate startDate, LocalDate endDate) {
         return giaTourDAO.findByIdTourAndDatesBetween(idTour, startDate, endDate);
    }

    @Override
    public List<GiaTourDTO> findByIdTour(Long idTour) {
        return giaTourDAO.findByIdTour(idTour);
    }
}
