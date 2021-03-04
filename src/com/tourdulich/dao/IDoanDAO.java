/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao;

import com.tourdulich.dto.DoanDTO;
import java.util.List;

/**
 *
 * @author kossp
 */
public interface IDoanDAO {
    List<DoanDTO> findAll();
    DoanDTO findById(Long id);
    Long save(DoanDTO doan);
    void update(DoanDTO doan);
    void delete(Long id);    
}
