/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao.impl;

import com.tourdulich.dao.IDsNhanVienDoanDAO;
import com.tourdulich.dto.DsNhanVienDoanDTO;
import com.tourdulich.dto.NhanVienDTO;
import com.tourdulich.mapper.impl.DsNhanVienDoanMapper;
import com.tourdulich.mapper.impl.IdKhachDoanMapper;
import com.tourdulich.mapper.impl.IdMapper;
import com.tourdulich.mapper.impl.IdNhanVienDoanMapper;
import java.time.LocalDate;
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

    @Override
    public List<Long> getFreeNhanVien(LocalDate date, Long idTour) {
        String sql = "SELECT DISTINCT ds_nhan_vien_doan.id_nhan_vien FROM doan\n" +
                    "JOIN ds_nhan_vien_doan \n" +
                    "ON ds_nhan_vien_doan.id_doan = doan.id\n" +
                    "WHERE ? NOT BETWEEN doan.ngay_khoi_hanh AND doan.ngay_ket_thuc AND doan.id_tour = ?";
       return query(sql, new IdMapper(), date, idTour);

    }

    @Override
    public List<Long> findByIdDoan(Long idDoan) {
       String sql = "SELECT * FROM ds_nhan_vien_doan WHERE id_doan = ?";
       return query(sql, new IdNhanVienDoanMapper(), idDoan);
    }

    @Override
    public void deleteByIdDoan(Long idDoan) {
        String sql = "DELETE FROM ds_nhan_vien_doan WHERE id_doan = ?";
        update(sql, idDoan);
    }

    @Override
    public DsNhanVienDoanDTO findIdNhanVienDoan(Long idDoan, Long idNhanVien) {
        String sql = "SELECT * FROM ds_nhan_vien_doan WHERE id_doan = ? AND id_nhan_vien = ?";
        List<DsNhanVienDoanDTO> dsNhanVienDoan = query(sql, new DsNhanVienDoanMapper(), idDoan, idNhanVien);
        return dsNhanVienDoan.isEmpty() ? null : dsNhanVienDoan.get(0);
    }

    

   

   
}
