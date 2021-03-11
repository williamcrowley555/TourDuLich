/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.ITourBLL;
import com.tourdulich.dao.ITourDAO;
import com.tourdulich.dao.impl.TourDAO;
import com.tourdulich.dto.TourDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public class TourBLL implements ITourBLL {

    private ITourDAO tourDAO;

    public TourBLL() {
        this.tourDAO = new TourDAO();
    }
    
    @Override
    public List<TourDTO> findAll() {
        return tourDAO.findAll();
    }

    @Override
    public TourDTO findById(Long id) {
        return tourDAO.findById(id);
    }

    @Override
    public Long save(TourDTO tour) {
        return tourDAO.save(tour);
    }

    @Override
    public void update(TourDTO tour) {
        tourDAO.update(tour);
    }

    @Override
    public void delete(Long id) {
        tourDAO.delete(id);
    }
}
