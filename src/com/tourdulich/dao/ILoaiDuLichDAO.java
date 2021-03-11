/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao;

import com.tourdulich.dto.LoaiDuLichDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ILoaiDuLichDAO extends GenericDAO<LoaiDuLichDTO> {
    
    List<LoaiDuLichDTO> findAll();
    LoaiDuLichDTO findById(Long id);
    Long save(LoaiDuLichDTO loaiDuLich);
    void update(LoaiDuLichDTO loaiDuLich);
    void delete(Long id);
}
