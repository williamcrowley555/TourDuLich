/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao.impl;

import com.tourdulich.dao.IGiaTourDAO;
import com.tourdulich.dto.GiaTourDTO;
import com.tourdulich.mapper.impl.GiaTourMapper;
import java.util.List;

/**
 *
 * @author kossp
 */
public class GiaTourDAO extends AbstractDAO<GiaTourDTO> implements IGiaTourDAO {
    @Override
    public List<GiaTourDTO> findAll() {
        String sql = "SELECT * FROM gia_tour";
        return query(sql, new GiaTourMapper());
    }

    @Override
    public GiaTourDTO findById(Long id) {
        String sql = "SELECT * FROM gia_tour WHERE id = ?";
        List<GiaTourDTO> giaTour = query(sql, new GiaTourMapper(), id);
        return giaTour.isEmpty() ? null : giaTour.get(0);
    }

    @Override
    public Long save(GiaTourDTO giaTour) {
        String sql = "INSERT INTO gia_tour(id_tour, ngay_bat_dau, ngay_ket_thuc, gia_tien) VALUES(?, ?, ?, ?)";
        return insert(sql, giaTour.getIdTour(), giaTour.getNgayBatDau(), giaTour.getNgayKetThuc(), giaTour.getGiaTien());
    }

    @Override
    public void update(GiaTourDTO giaTour) {
        String sql = "UPDATE gia_tour SET id_tour = ?, ngay_bat_dau = ?, ngay_ket_thuc = ?, gia_tien = ? WHERE id = ?";
        update(sql, giaTour.getIdTour(), giaTour.getNgayBatDau(), giaTour.getNgayKetThuc(), giaTour.getGiaTien(), giaTour.getId());
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM gia_tour WHERE id = ?";
        update(sql, id);
    }    
}