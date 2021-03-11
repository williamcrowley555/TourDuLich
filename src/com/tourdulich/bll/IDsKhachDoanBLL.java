/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll;

import com.tourdulich.dto.DsKhachDoanDTO;
import com.tourdulich.dto.KhachHangDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kossp
 */
public interface IDsKhachDoanBLL {
    List<DsKhachDoanDTO> findAll();
    DsKhachDoanDTO findById(Long id);
    ArrayList<KhachHangDTO> findByIdDoan(Long idDoan);
    Long save(DsKhachDoanDTO dsKhachDoan);
    void delete(Long id);     
    void deleteByIdDoan(Long idDoan);
}
