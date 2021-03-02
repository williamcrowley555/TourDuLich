/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.IDsDiaDiemTourBLL;
import com.tourdulich.dao.IDsDiaDiemTourDAO;
import com.tourdulich.dao.impl.DsDiaDiemTourDAO;
import com.tourdulich.dto.DsDiaDiemTourDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public class DsDiaDiemTourBLL implements IDsDiaDiemTourBLL {

    private IDsDiaDiemTourDAO dsDiaDiemTourDAO;

    public DsDiaDiemTourBLL() {
        this.dsDiaDiemTourDAO = new DsDiaDiemTourDAO();
    }
    
    @Override
    public List<DsDiaDiemTourDTO> findAll() {
        return dsDiaDiemTourDAO.findAll();
    }

    @Override
    public DsDiaDiemTourDTO findById(Long idTour) {
        return dsDiaDiemTourDAO.findById(idTour);
    }

    @Override
    public Long save(DsDiaDiemTourDTO dsDiaDiemTour) {
        return dsDiaDiemTourDAO.save(dsDiaDiemTour);
    }

    @Override
    public void update(DsDiaDiemTourDTO dsDiaDiemTour) {
        dsDiaDiemTourDAO.update(dsDiaDiemTour);
    }

    @Override
    public void delete(Long idTour) {
        dsDiaDiemTourDAO.delete(idTour);
    }
}
