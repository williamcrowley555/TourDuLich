/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao;

import com.tourdulich.dto.DsDiaDiemTourDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IDsDiaDiemTourDAO extends GenericDAO<DsDiaDiemTourDTO> {
    
    List<DsDiaDiemTourDTO> findAll();
    DsDiaDiemTourDTO findById(Long id);
    Long save(DsDiaDiemTourDTO dsDiaDiemTour);
    void update(DsDiaDiemTourDTO dsDiaDiemTour);
    void delete(Long id);
}
