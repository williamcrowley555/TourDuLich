/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao.impl;

import com.tourdulich.dao.IDsKhachDoanDAO;
import com.tourdulich.dto.DsKhachDoanDTO;
import com.tourdulich.mapper.impl.DsKhachDoanMapper;
import java.util.List;

/**
 *
 * @author kossp
 */
public class DsKhachDoanDAO extends AbstractDAO<DsKhachDoanDTO> implements IDsKhachDoanDAO{
    @Override
    public List<DsKhachDoanDTO> findAll() {
        String sql = "SELECT * FROM dsKhachDoan";
        return query(sql, new DsKhachDoanMapper());
    }

    @Override
    public DsKhachDoanDTO findById(Long id) {
        String sql = "SELECT * FROM dsKhachDoan WHERE id = ?";
        List<DsKhachDoanDTO> dsKhachDoan = query(sql, new DsKhachDoanMapper(), id);
        return dsKhachDoan.isEmpty() ? null : dsKhachDoan.get(0);
    }

    @Override
    public Long save(DsKhachDoanDTO dsKhachDoan) {
        String sql = "INSERT INTO dsKhachDoan(id_doan, id_khach) VALUES(?, ?)";
        return insert(sql, dsKhachDoan.getIdDoan(), dsKhachDoan.getIdKhach());
    }


    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM dsKhachDoan WHERE id = ?";
        update(sql, id);
    }        
}
