/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao.impl;

import com.tourdulich.dao.IDichVuDAO;
import com.tourdulich.dto.DichVuDTO;
import com.tourdulich.mapper.impl.DichVuMapper;
import java.util.List;

/**
 *
 * @author HP
 */
public class DichVuDAO extends AbstractDAO<DichVuDTO> implements IDichVuDAO {

    @Override
    public List<DichVuDTO> findAll() {
        String sql = "SELECT * FROM dich_vu";
        return query(sql, new DichVuMapper());
    }

    @Override
    public DichVuDTO findById(Long id) {
        String sql = "SELECT * FROM dich_vu WHERE id = ?";
        List<DichVuDTO> DichVu = query(sql, new DichVuMapper(), id);
        return DichVu.isEmpty() ? null : DichVu.get(0);
    }

    @Override
    public Long save(DichVuDTO DichVu) {
        String sql = "INSERT INTO dich_vu(ten_dich_vu) VALUES(?)";
        return insert(sql, DichVu.getTenDichVu());
    }

    @Override
    public void update(DichVuDTO DichVu) {
        String sql = "UPDATE dich_vu SET ten_dich_vu = ? WHERE id = ?";
        update(sql, DichVu.getTenDichVu(), DichVu.getId());
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM dich_vu WHERE id = ?";
        update(sql, id);
    }
}
