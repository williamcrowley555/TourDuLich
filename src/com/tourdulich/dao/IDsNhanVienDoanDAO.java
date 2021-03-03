/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao;

import com.tourdulich.dto.DsNhanVienDoanDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IDsNhanVienDoanDAO extends GenericDAO<DsNhanVienDoanDTO> {
    
    List<DsNhanVienDoanDTO> findAll();
    DsNhanVienDoanDTO findById(Long id);
    Long save(DsNhanVienDoanDTO dsNhanVienDoan);
    void update(DsNhanVienDoanDTO dsNhanVienDoan);
    void delete(Long id);
}
