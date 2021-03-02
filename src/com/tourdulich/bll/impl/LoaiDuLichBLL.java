/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.ILoaiDuLichBLL;
import com.tourdulich.dao.ILoaiDuLichDAO;
import com.tourdulich.dao.impl.LoaiDuLichDAO;
import com.tourdulich.dto.LoaiDuLichDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public class LoaiDuLichBLL implements ILoaiDuLichBLL {

    private ILoaiDuLichDAO loaiDuLichDAO;

    public LoaiDuLichBLL() {
        this.loaiDuLichDAO = new LoaiDuLichDAO();
    }
    
    @Override
    public List<LoaiDuLichDTO> findAll() {
        return loaiDuLichDAO.findAll();
    }

    @Override
    public LoaiDuLichDTO findById(Long id) {
        return loaiDuLichDAO.findById(id);
    }

    @Override
    public Long save(LoaiDuLichDTO LoaiDuLich) {
        return loaiDuLichDAO.save(LoaiDuLich);
    }

    @Override
    public void update(LoaiDuLichDTO LoaiDuLich) {
        loaiDuLichDAO.update(LoaiDuLich);
    }

    @Override
    public void delete(Long id) {
        loaiDuLichDAO.delete(id);
    }
}
