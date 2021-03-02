/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.mapper.impl;

import com.tourdulich.dto.LoaiDuLichDTO;
import com.tourdulich.mapper.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class LoaiDuLichMapper implements RowMapper<LoaiDuLichDTO>{

    @Override
    public LoaiDuLichDTO mapRow(ResultSet rs) {
        try {
            LoaiDuLichDTO LoaiDuLich = new LoaiDuLichDTO();
            LoaiDuLich.setId(rs.getLong("id"));
            LoaiDuLich.setTenLoaiDuLich(rs.getString("ten_loai_du_lich"));
            
            return LoaiDuLich;
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
