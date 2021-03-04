/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll;

import com.tourdulich.dto.DiaDiemDTO;
import java.util.List;

/**
 *
 * @author kossp
 */
public interface IDiaDiemBLL {
    List<DiaDiemDTO> findAll();
    DiaDiemDTO findById(Long id);
    Long save(DiaDiemDTO diaDiem);
    void update(DiaDiemDTO diaDiem);
    void delete(Long id);     
}
