/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll;

import com.tourdulich.bll.impl.DichVuBLL;
import com.tourdulich.dto.DichVuDTO;
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
public class IDichVuBLLTest {
    
    public IDichVuBLLTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
       
        IDichVuBLL instance = new DichVuBLL();
        List<DichVuDTO> expResult = null;
        List<DichVuDTO> result = instance.findAll();
        assertNotNull(result); 
    }

    @Test
    public void testFindById() {
       System.out.println("findById");
        Long id = 21L;
        IDichVuBLL instance = new DichVuBLL();
        DichVuDTO result = instance.findById(id);
        assertEquals(id, result.getId());
    }

    @Test
    public void testSave() {
        System.out.println("save");
        String TenDichVu = "Hồ bơi";
        String MoTa = "Hồ bơi vô cực";
        IDichVuBLL instance = new DichVuBLL();
        DichVuDTO dichVu = new DichVuDTO();
        dichVu.setMoTa(MoTa);
        dichVu.setTenDichVu(TenDichVu);
        Long savedId = instance.save(dichVu);
        assertNotNull(instance.findById(savedId));
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Long dichVuId = 4L;
        String moTa = "Hồ bơi thiên nhiên";
        IDichVuBLL instance = new DichVuBLL();
        DichVuDTO dichVu = instance.findById(dichVuId);
        dichVu.setMoTa(moTa);
        instance.update(dichVu);
        assertEquals(moTa, instance.findById(dichVuId).getMoTa());
    }

    @Test
    public void testDelete() {
       System.out.println("delete");
        Long id = 5L;
        IDichVuBLL instance = new DichVuBLL();
        instance.delete(id);
        DichVuDTO result = instance.findById(id);
        assertNull(result);
    }
}
