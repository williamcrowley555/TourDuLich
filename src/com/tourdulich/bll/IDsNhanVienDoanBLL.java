/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll;

import com.tourdulich.dto.DsNhanVienDoanDTO;
import com.tourdulich.dto.KhachHangDTO;
import com.tourdulich.dto.NhanVienDTO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IDsNhanVienDoanBLL {
    List<DsNhanVienDoanDTO> findAll();
    DsNhanVienDoanDTO findById(Long id);
    Long save(DsNhanVienDoanDTO dsNhanVienDoan);
    List <NhanVienDTO> getFreeNhanVien(LocalDate date, Long idTour);
    ArrayList<NhanVienDTO> findByIdDoan(Long idDoan);
    void update(DsNhanVienDoanDTO dsNhanVienDoan);
    void delete(Long id);
}
