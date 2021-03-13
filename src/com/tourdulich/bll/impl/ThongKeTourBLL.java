/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

import com.tourdulich.bll.IThongKeTourBLL;
import com.tourdulich.dao.IThongKeTourDAO;
import com.tourdulich.dao.impl.ThongKeTourDAO;
import com.tourdulich.dto.ThongKeTourDTO;
import java.util.List;

/**
 *
 * @author kossp
 */
public class ThongKeTourBLL implements IThongKeTourBLL{
private IThongKeTourDAO thongKeTourDAO;

    public ThongKeTourBLL() {
        this.thongKeTourDAO = new ThongKeTourDAO();
    }

    @Override
    public List<ThongKeTourDTO> findAll() {
        return thongKeTourDAO.findAll();
    }    
}
