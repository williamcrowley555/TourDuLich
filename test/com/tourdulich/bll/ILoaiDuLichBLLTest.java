/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll;

import com.tourdulich.bll.impl.LoaiDuLichBLL;
import com.tourdulich.dto.LoaiDuLichDTO;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hi
 */
public class ILoaiDuLichBLLTest {
    
    public ILoaiDuLichBLLTest() {
    }
    
  

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        ILoaiDuLichBLL instance = new LoaiDuLichBLL();
        List<LoaiDuLichDTO> expResult = null;
        List<LoaiDuLichDTO> result = instance.findAll();
        assertNotNull(result);
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        Long id = 1L;
        ILoaiDuLichBLL instance = new LoaiDuLichBLL();
        LoaiDuLichDTO result = instance.findById(id);
        assertEquals(id, result.getId());
    }

    @Test
    public void testSave() {
        System.out.println("save");
        String tenLoaiDuLich = "Du lịch trong nước";
        LoaiDuLichDTO loaiDuLich = new LoaiDuLichDTO();
        loaiDuLich.setTenLoaiDuLich(tenLoaiDuLich);
        ILoaiDuLichBLL instance = new LoaiDuLichBLL();
        Long saveId = instance.save(loaiDuLich);
        LoaiDuLichDTO result = instance.findById(saveId);   
        assertEquals(saveId, result.getId());
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Long loaiDuLichId = 8L;
        String tenLoaiDuLich = "Du lịch ngoài nước";
        ILoaiDuLichBLL instance = new LoaiDuLichBLL();
        LoaiDuLichDTO loaiDuLich = instance.findById(loaiDuLichId);
        loaiDuLich.setTenLoaiDuLich(tenLoaiDuLich);
        instance.update(loaiDuLich);
        LoaiDuLichDTO result = instance.findById(loaiDuLichId);
        assertEquals(tenLoaiDuLich, result.getTenLoaiDuLich());
    }

    @Test
    public void testDelete() {
        System.out.println("delete");  
        Long id = 8L;
        ILoaiDuLichBLL instance = new LoaiDuLichBLL();
        instance.delete(id);
        LoaiDuLichDTO result = instance.findById(id);
        assertNull(result);
    }

  
    
}
