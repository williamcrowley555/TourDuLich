/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.IThongKeDoanBLL;
import com.tourdulich.dao.IThongKeDoanDAO;
import com.tourdulich.dao.impl.ThongKeDoanDAO;
import com.tourdulich.dto.ThongKeDoanDTO;
import java.util.List;

/**
 *
 * @author kossp
 */
public class ThongKeDoanBLL implements IThongKeDoanBLL {
    
    private IThongKeDoanDAO thongKeDoanDAO;
    
    public ThongKeDoanBLL() {
        this.thongKeDoanDAO = new ThongKeDoanDAO();
    }    

    @Override
    public List<ThongKeDoanDTO> findByIdTour(Long id) {
       return thongKeDoanDAO.findByIdTour(id);
    }
}
