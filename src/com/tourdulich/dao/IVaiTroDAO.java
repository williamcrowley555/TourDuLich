/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao;

import com.tourdulich.dto.VaiTroDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IVaiTroDAO extends GenericDAO<VaiTroDTO> {
    
    List<VaiTroDTO> findAll();
    VaiTroDTO findById(Long id);
    Long save(VaiTroDTO vaiTro);
    void update(VaiTroDTO vaiTro);
    void delete(Long id);
}
