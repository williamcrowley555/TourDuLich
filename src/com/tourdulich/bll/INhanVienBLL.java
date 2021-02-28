/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll;

import com.tourdulich.dto.NhanVienDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public interface INhanVienBLL {
    
    List<NhanVienDTO> findAll();
    NhanVienDTO findById(Long id);
    NhanVienDTO findBySdt(String sdt);
    Long save(NhanVienDTO nhanVien);
    void update(NhanVienDTO nhanVien);
    void delete(Long id);
    
}
