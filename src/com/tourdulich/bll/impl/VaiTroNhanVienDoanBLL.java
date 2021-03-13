/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.IVaiTroNhanVienDoanBLL;
import com.tourdulich.dao.IVaiTroDAO;
import com.tourdulich.dao.IVaiTroNhanVienDoanDAO;
import com.tourdulich.dao.impl.VaiTroDAO;
import com.tourdulich.dao.impl.VaiTroNhanVienDoanDAO;
import com.tourdulich.dto.DiaDiemDTO;
import com.tourdulich.dto.VaiTroDTO;
import com.tourdulich.dto.VaiTroNhanVienDoanDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kossp
 */
public class VaiTroNhanVienDoanBLL implements IVaiTroNhanVienDoanBLL {
    private IVaiTroNhanVienDoanDAO vaiTroNhanVienDoanDAO;
    private IVaiTroDAO vaiTroDAO;
    public VaiTroNhanVienDoanBLL() {
        this.vaiTroNhanVienDoanDAO = new VaiTroNhanVienDoanDAO();
        this.vaiTroDAO = new VaiTroDAO();
    }    
    
    @Override
    public List<VaiTroNhanVienDoanDTO> findAll() {
        return vaiTroNhanVienDoanDAO.findAll();
    }

   @Override
    public VaiTroNhanVienDoanDTO findById(Long id) {
        return vaiTroNhanVienDoanDAO.findById(id);
    }         
    
    @Override
    public Long save(VaiTroNhanVienDoanDTO vaiTroNhanVienDoan) {
        return vaiTroNhanVienDoanDAO.save(vaiTroNhanVienDoan);
    }

    @Override
    public void delete(Long id) {
        vaiTroNhanVienDoanDAO.delete(id);
    }

    @Override
    public List<Long> findByIdNhanVien(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VaiTroDTO> findByIdVaiTroNhanVienDoan(Long idVaiTroNhanVienDoan) {
        List<Long> vaiTroIds = vaiTroNhanVienDoanDAO.findByIdDsNhanVienDoan(idVaiTroNhanVienDoan);
        List<VaiTroDTO> vaiTroList = new ArrayList<>();
        for (Long vaiTroId : vaiTroIds)
        {   
            vaiTroList.add(vaiTroDAO.findById(vaiTroId));      
        }
        return vaiTroList;
    }

    @Override
    public void deleteByIdDsNhanVienDoan(Long idDsNhanVienDoan) {
         vaiTroNhanVienDoanDAO.deleteByIdDsNhanVienDoan(idDsNhanVienDoan);
    }
}
