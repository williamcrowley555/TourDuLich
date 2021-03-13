/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao.impl;

import com.tourdulich.dao.IVaiTroNhanVienDoanDAO;
import com.tourdulich.dto.VaiTroNhanVienDoanDTO;
import com.tourdulich.mapper.impl.IdVaiTroMapper;
import com.tourdulich.mapper.impl.VaiTroNhanVienDoanMapper;
import java.util.List;

/**
 *
 * @author kossp
 */
public class VaiTroNhanVienDoanDAO extends AbstractDAO<VaiTroNhanVienDoanDTO> implements IVaiTroNhanVienDoanDAO {
    @Override
    public List<VaiTroNhanVienDoanDTO> findAll() {
        String sql = "SELECT * FROM vai_tro_nhan_vien_doan";
        return query(sql, new VaiTroNhanVienDoanMapper());
    }

    @Override
    public VaiTroNhanVienDoanDTO findById(Long id) {
        String sql = "SELECT * FROM vai_tro_nhan_vien_doan WHERE id = ?";
        List<VaiTroNhanVienDoanDTO> vaiTroNhanVienDoan = query(sql, new VaiTroNhanVienDoanMapper(), id);
        return vaiTroNhanVienDoan.isEmpty() ? null : vaiTroNhanVienDoan.get(0);
    }

    @Override
    public Long save(VaiTroNhanVienDoanDTO vaiTroNhanVienDoan) {
        String sql = "INSERT INTO vai_tro_nhan_vien_doan(id_ds_nv_doan, id_vai_tro) VALUES(?, ?)";
        return insert(sql, vaiTroNhanVienDoan.getIdDsNvDoan(), vaiTroNhanVienDoan.getIdVaiTro());
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM vai_tro_nhan_vien_doan WHERE id = ?";
        update(sql, id);
    }            

    @Override
    public List<Long> findByIdDsNhanVienDoan(Long idDsNhanVienDoan) {
         String sql = "SELECT * FROM vai_tro_nhan_vien_doan WHERE id_ds_nv_doan = ?";
        return query(sql, new IdVaiTroMapper(), idDsNhanVienDoan);
    }

    @Override
    public void deleteByIdDsNhanVienDoan(Long idDsNhanVienDoan) {
        String sql = "DELETE FROM vai_tro_nhan_vien_doan WHERE id_ds_nv_doan = ?";
        update(sql, idDsNhanVienDoan);
    }
 
}
