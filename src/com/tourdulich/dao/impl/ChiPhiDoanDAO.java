/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao.impl;

import com.tourdulich.dao.IChiPhiDoanDAO;
import com.tourdulich.dto.ChiPhiDoanDTO;
import com.tourdulich.mapper.impl.ChiPhiDoanMapper;
import java.util.List;

/**
 *
 * @author kossp
 */
public class ChiPhiDoanDAO extends AbstractDAO<ChiPhiDoanDTO> implements IChiPhiDoanDAO{
    @Override
    public List<ChiPhiDoanDTO> findAll() {
        String sql = "SELECT * FROM chi_phi_doan";
        return query(sql, new ChiPhiDoanMapper());
    }

    @Override
    public ChiPhiDoanDTO findById(Long id) {
        String sql = "SELECT * FROM chi_phi_doan WHERE id = ?";
        List<ChiPhiDoanDTO> chiPhiDoan = query(sql, new ChiPhiDoanMapper(), id);
        return chiPhiDoan.isEmpty() ? null : chiPhiDoan.get(0);
    }

    @Override
    public Long save(ChiPhiDoanDTO chiPhiDoan) {
        String sql = "INSERT INTO chi_phi_doan(id_doan, id_dich_vu, chi_phi) VALUES(?, ?, ?)";
        return insert(sql, chiPhiDoan.getIdDoan(), chiPhiDoan.getIdDichVu(), chiPhiDoan.getChiPhi());
    }

    @Override
    public void update(ChiPhiDoanDTO chiPhiDoan) {
        String sql = "UPDATE chi_phi_doan SET id_doan = ?, id_dich_vu = ?, chi_phi = ? WHERE id = ?";
        update(sql, chiPhiDoan.getIdDoan(), chiPhiDoan.getIdDichVu(), chiPhiDoan.getChiPhi(), chiPhiDoan.getId());
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM chi_phi_doan WHERE id = ?";
        update(sql, id);
    }
}
