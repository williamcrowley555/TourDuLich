/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dal;

import com.tourdulich.mapper.RowMapper;
import java.util.List;


/**
 *
 * @author HP
 */
public interface GenericDAL<T> {
    
    <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
    Long insert(String sql, Object... parameters);
    void update(String sql, Object... parameters);
}
