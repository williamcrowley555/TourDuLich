/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao;

import com.tourdulich.dto.ThongKeTourDTO;
import java.util.List;

/**
 *
 * @author kossp
 */
public interface IThongKeTourDAO extends GenericDAO<ThongKeTourDTO>{
    List<ThongKeTourDTO> findAll();
}
