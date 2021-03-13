/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao.impl;

import com.tourdulich.dao.IDiaDiemDAO;
import com.tourdulich.dto.DiaDiemDTO;
import com.tourdulich.mapper.impl.DiaDiemMapper;
import java.util.List;

/**
 *
 * @author kossp
 */
public class DiaDiemDAO extends AbstractDAO<DiaDiemDTO> implements IDiaDiemDAO {
@Override
    public List<DiaDiemDTO> findAll() {
        String sql = "SELECT * FROM dia_diem";
        return query(sql, new DiaDiemMapper());
    }

    @Override
    public DiaDiemDTO findById(Long id) {
        String sql = "SELECT * FROM dia_diem WHERE id = ?";
        List<DiaDiemDTO> diaDiem = query(sql, new DiaDiemMapper(), id);
        return diaDiem.isEmpty() ? null : diaDiem.get(0);
    }

    @Override
    public Long save(DiaDiemDTO diaDiem) {
        String sql = "INSERT INTO dia_diem(ten_dia_diem, dia_chi, gioi_thieu, hinh_anh, id_tinh) VALUES(?, ?, ?, ?, ?)";
        return insert(sql, diaDiem.getTenDiaDiem(), diaDiem.getDiaChi(), diaDiem.getGioiThieu(), diaDiem.getHinhAnh(), diaDiem.getIdTinh());
    }

    @Override
    public void update(DiaDiemDTO diaDiem) {
        String sql = "UPDATE dia_diem SET ten_dia_diem = ?, dia_chi = ?, gioi_thieu = ?, hinh_anh = ?, id_tinh = ? WHERE id = ?";
        update(sql, diaDiem.getTenDiaDiem(), diaDiem.getDiaChi(), diaDiem.getGioiThieu(), diaDiem.getHinhAnh(), diaDiem.getIdTinh(), diaDiem.getId());
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM dia_diem WHERE id = ?";
        update(sql, id);
    }    

    @Override
    public List<DiaDiemDTO> findByIdTinh(Long idTinh) {
        String sql = "SELECT * FROM dia_diem WHERE id_tinh = ?";
        return query(sql, new DiaDiemMapper(), idTinh);
    }
}
