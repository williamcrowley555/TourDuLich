/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.IDsNhanVienDoanBLL;
import com.tourdulich.dao.IDsNhanVienDoanDAO;
import com.tourdulich.dao.INhanVienDAO;
import com.tourdulich.dao.IVaiTroNhanVienDoanDAO;
import com.tourdulich.dao.impl.DsNhanVienDoanDAO;
import com.tourdulich.dao.impl.NhanVienDAO;
import com.tourdulich.dao.impl.VaiTroNhanVienDoanDAO;
import com.tourdulich.dto.DsNhanVienDoanDTO;
import com.tourdulich.dto.KhachHangDTO;
import com.tourdulich.dto.NhanVienDTO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class DsNhanVienDoanBLL implements IDsNhanVienDoanBLL {
    private INhanVienDAO nhanVienDAO; 
    private IDsNhanVienDoanDAO dsNhanVienDoanDAO;
    private IVaiTroNhanVienDoanDAO vaiTroNhanVienDoanDAO;

    public DsNhanVienDoanBLL() {
        this.nhanVienDAO = new NhanVienDAO();
        this.dsNhanVienDoanDAO = new DsNhanVienDoanDAO();
        this.vaiTroNhanVienDoanDAO = new VaiTroNhanVienDoanDAO();
    }
    
    @Override
    public List<DsNhanVienDoanDTO> findAll() {
        return dsNhanVienDoanDAO.findAll();
    }

    @Override
    public DsNhanVienDoanDTO findById(Long id) {
        return dsNhanVienDoanDAO.findById(id);
    }

    @Override
    public Long save(DsNhanVienDoanDTO NhanVienDoan) {
        return dsNhanVienDoanDAO.save(NhanVienDoan);
    }

    @Override
    public void update(DsNhanVienDoanDTO dsNhanVienDoan) {
        dsNhanVienDoanDAO.update(dsNhanVienDoan);
    }

    @Override
    public void delete(Long id) {
        dsNhanVienDoanDAO.delete(id);
    }

    @Override
    public ArrayList<NhanVienDTO> getFreeNhanVien(LocalDate date, Long idTour) {
         List<Long> nhanVienIds = dsNhanVienDoanDAO.getFreeNhanVien(date, idTour);
         ArrayList<NhanVienDTO> nhanVienList = new ArrayList<NhanVienDTO>();
         for (Long nhanVienId : nhanVienIds)
         {
            nhanVienList.add(nhanVienDAO.findById(nhanVienId));     
         }
         return nhanVienList;
    }

    @Override
    public ArrayList<NhanVienDTO> findByIdDoan(Long idDoan) {
        
        List<Long> nhanVienIds = dsNhanVienDoanDAO.findByIdDoan(idDoan);
        ArrayList<NhanVienDTO> nhanVienList = new ArrayList<NhanVienDTO>();
        for (Long nhanVienId : nhanVienIds)
        {
            nhanVienList.add(nhanVienDAO.findById(nhanVienId));
        }
        return nhanVienList;
    }

    @Override
    public DsNhanVienDoanDTO findByIdNhanVienDoan(Long idDoan, Long idNhanVien) {
        return dsNhanVienDoanDAO.findIdNhanVienDoan(idDoan, idNhanVien);
    }

    @Override
    public void deleteByIdDoanAndIdNhanVien(Long idDoan, Long idNhanVien) {
        Long idDsNhanVienDoan = dsNhanVienDoanDAO.findByIdDoanAndIdNhanVien(idDoan, idNhanVien).getId();
        vaiTroNhanVienDoanDAO.deleteByIdDsNhanVienDoan(idDsNhanVienDoan);
        dsNhanVienDoanDAO.deleteByIdDoanAndIdNhanVien(idDoan, idNhanVien);
    }
}
