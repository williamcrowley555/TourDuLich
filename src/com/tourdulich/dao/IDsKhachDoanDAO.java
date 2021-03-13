/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao;

import com.tourdulich.dto.DsKhachDoanDTO;
import java.util.List;

/**
 *
 * @author kossp
 */
public interface IDsKhachDoanDAO {
    List<DsKhachDoanDTO> findAll();
    DsKhachDoanDTO findById(Long id);
    List<Long> findByIdDoan(Long idDoan);
    Long save(DsKhachDoanDTO dsKhachDoan);
    void delete(Long id); 
    void deleteByIdDoanAndIdKhachHang(Long idDoan, Long idKhachHang);
}
