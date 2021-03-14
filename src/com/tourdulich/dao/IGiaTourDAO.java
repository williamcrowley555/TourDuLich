/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao;

import com.tourdulich.dto.GiaTourDTO;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author kossp
 */
public interface IGiaTourDAO {
    List<GiaTourDTO> findAll();
    List<GiaTourDTO> findByIdTourAndStartDate(Long idTour, LocalDate startDate);
    GiaTourDTO findById(Long id);
    Long save(GiaTourDTO giaTour);
    void update(GiaTourDTO giaTour);
    void delete(Long id);       
}
