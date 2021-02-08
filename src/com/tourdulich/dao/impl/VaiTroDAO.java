/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dao.impl;

import com.tourdulich.dao.IVaiTroDAO;
import com.tourdulich.dto.VaiTroDTO;
import com.tourdulich.mapper.impl.VaiTroMapper;
import java.util.List;

/**
 *
 * @author HP
 */
public class VaiTroDAO extends AbstractDAO<VaiTroDTO> implements IVaiTroDAO {

    @Override
    public List<VaiTroDTO> findAll() {
        String sql = "SELECT * FROM vai_tro";
        return query(sql, new VaiTroMapper());
    }

    @Override
    public Long save(VaiTroDTO vaiTro) {
        String sql = "INSERT INTO vai_tro(ten_vai_tro) VALUES(?)";
        return insert(sql, vaiTro.getTenVaiTro());
    }
    
}
