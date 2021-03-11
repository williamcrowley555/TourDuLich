/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import com.tourdulich.bll.IDsKhachDoanBLL;
import com.tourdulich.dao.IDsKhachDoanDAO;
import com.tourdulich.dao.IKhachHangDAO;
import com.tourdulich.dao.impl.DsKhachDoanDAO;
import com.tourdulich.dao.impl.KhachHangDAO;
import com.tourdulich.dto.DsKhachDoanDTO;
import com.tourdulich.dto.KhachHangDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kossp
 */
public class DsKhachDoanBLL implements IDsKhachDoanBLL {
    private IDsKhachDoanDAO dsKhachDoanDAO;
    private IKhachHangDAO khachHangDAO;
    public DsKhachDoanBLL() {
        this.dsKhachDoanDAO = new DsKhachDoanDAO();
        this.khachHangDAO = new KhachHangDAO();
    }    
    
    @Override
    public List<DsKhachDoanDTO> findAll() {
        return dsKhachDoanDAO.findAll();
    }

   @Override
    public DsKhachDoanDTO findById(Long id) {
        return dsKhachDoanDAO.findById(id);
    }    
    
    @Override
    public Long save(DsKhachDoanDTO dsKhachDoan) {
        return dsKhachDoanDAO.save(dsKhachDoan);
    }

    @Override
    public void delete(Long id) {
        dsKhachDoanDAO.delete(id);
    }

    @Override
    public ArrayList<KhachHangDTO> findByIdDoan(Long idDoan) {
        List<Long> khachHangIds = dsKhachDoanDAO.findByIdDoan(idDoan);
        ArrayList<KhachHangDTO> khachHangList = new ArrayList<KhachHangDTO>();
        for (Long khachHangId : khachHangIds)
        {
            khachHangList.add(khachHangDAO.findById(khachHangId));
        }
        return khachHangList;
    }
}
