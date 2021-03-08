/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.IDsNhanVienDoanBLL;
import com.tourdulich.dao.IDsNhanVienDoanDAO;
import com.tourdulich.dao.INhanVienDAO;
import com.tourdulich.dao.impl.DsNhanVienDoanDAO;
import com.tourdulich.dao.impl.NhanVienDAO;
import com.tourdulich.dto.DsNhanVienDoanDTO;
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

    public DsNhanVienDoanBLL() {
        this.dsNhanVienDoanDAO = new DsNhanVienDoanDAO();
        this.nhanVienDAO = new NhanVienDAO();
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
    public Long save(DsNhanVienDoanDTO dsNhanVienDoan) {
        return dsNhanVienDoanDAO.save(dsNhanVienDoan);
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
    public List<NhanVienDTO> getFreeNhanVien(LocalDate date, Long idTour) {
         List<Long> nhanVienIds = dsNhanVienDoanDAO.getFreeNhanVien(date, idTour);
         List<NhanVienDTO> nhanVienList = new ArrayList<NhanVienDTO>();
         for (Long nhanVienId : nhanVienIds)
         {
            nhanVienList.add(nhanVienDAO.findById(nhanVienId));     
         }
         return nhanVienList;
    }
}
