/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao.impl;

import com.tourdulich.dao.IDsDiaDiemTourDAO;
import com.tourdulich.dto.DsDiaDiemTourDTO;
import com.tourdulich.mapper.impl.DsDiaDiemTourMapper;
import java.util.List;

/**
 *
 * @author HP
 */
public class DsDiaDiemTourDAO extends AbstractDAO<DsDiaDiemTourDTO> implements IDsDiaDiemTourDAO {

    @Override
    public List<DsDiaDiemTourDTO> findAll() {
        String sql = "SELECT * FROM ds_dia_diem_tour";
        return query(sql, new DsDiaDiemTourMapper());
    }

    @Override
    public DsDiaDiemTourDTO findById(Long idTour) {
        String sql = "SELECT * FROM ds_dia_diem_tour WHERE id_tour = ?";
        List<DsDiaDiemTourDTO> dsDiaDiemTour = query(sql, new DsDiaDiemTourMapper(), idTour);
        return dsDiaDiemTour.isEmpty() ? null : dsDiaDiemTour.get(0);
    }

    @Override
    public Long save(DsDiaDiemTourDTO dsDiaDiemTour) {
        String sql = "INSERT INTO ds_dia_diem_tour(id_tour,id_dia_diem) VALUES(?,?)";
        return insert(sql, dsDiaDiemTour.getIdTour(), dsDiaDiemTour.getIdDiaDiem());
    }

    @Override
    public void update(DsDiaDiemTourDTO dsDiaDiemTour) {
        String sql = "UPDATE ds_dia_diem_tour SET id_dia_diem = ? WHERE idTour = ?";
        update(sql, dsDiaDiemTour.getIdDiaDiem(), dsDiaDiemTour.getIdTour());
    }

    @Override
    public void delete(Long idTour) {
        String sql = "DELETE FROM ds_dia_diem_tour WHERE idTour = ?";
        update(sql, idTour);
    }
}
