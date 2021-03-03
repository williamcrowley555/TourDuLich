/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao.impl;

import com.tourdulich.dao.IDsNhanVienDoanDAO;
import com.tourdulich.dto.DsNhanVienDoanDTO;
import com.tourdulich.mapper.impl.DsNhanVienDoanMapper;
import java.util.List;

/**
 *
 * @author HP
 */
public class DsNhanVienDoanDAO extends AbstractDAO<DsNhanVienDoanDTO> implements IDsNhanVienDoanDAO {

    @Override
    public List<DsNhanVienDoanDTO> findAll() {
        String sql = "SELECT * FROM ds_nhan_vien_doan";
        return query(sql, new DsNhanVienDoanMapper());
    }

    @Override
    public DsNhanVienDoanDTO findById(Long id) {
        String sql = "SELECT * FROM ds_nhan_vien_doan WHERE id = ?";
        List<DsNhanVienDoanDTO> dsNhanVienDoan = query(sql, new DsNhanVienDoanMapper(), id);
        return dsNhanVienDoan.isEmpty() ? null : dsNhanVienDoan.get(0);
    }

    @Override
    public Long save(DsNhanVienDoanDTO dsNhanVienDoan) {
        String sql = "INSERT INTO ds_nhan_vien_doan(id_doan, id_nhan_vien) VALUES(?,?)";
        return insert(sql, dsNhanVienDoan.getIdDoan(), dsNhanVienDoan.getIdNhanVien());
    }

    @Override
    public void update(DsNhanVienDoanDTO dsNhanVienDoan) {
        String sql = "UPDATE ds_nhan_vien_doan SET id_doan = ?, id_nhan_vien = ? WHERE id = ?";
        update(sql, dsNhanVienDoan.getIdDoan(), dsNhanVienDoan.getIdNhanVien(), dsNhanVienDoan.getId());
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM ds_nhan_vien_doan WHERE id = ?";
        update(sql, id);
    }
}
