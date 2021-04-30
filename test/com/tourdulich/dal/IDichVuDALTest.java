/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dal;

import com.tourdulich.dal.impl.DichVuDAL;
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
public class IDichVuDALTest {
    
    public IDichVuDALTest() {
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
        IDichVuDAL instance = new DichVuDAL();
        List<DichVuDTO> expResult = null;
        List<DichVuDTO> result = instance.findAll();
        assertNotNull(result);
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        Long id = 210L;
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO result = instance.findById(id);
       // assertEquals(id, result.getId());
        assertEquals(result, null);
    }

    @Test
    public void testSave() {
        System.out.println("save");
        String TenDichVu = "Hồ bơi";
        String MoTa = "Hồ bơi vô cực";
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO dichVu = new DichVuDTO();
        dichVu.setMoTa(MoTa);
        dichVu.setTenDichVu(TenDichVu);
        Long savedId = instance.save(dichVu);
        assertNull(instance.findById(savedId));
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Long dichVuId = 2L;
        String moTa = "Hồ bơi thiên nhiên";
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO dichVu = instance.findById(dichVuId);
        dichVu.setMoTa(moTa);
        instance.update(dichVu);
        assertEquals(moTa, instance.findById(dichVuId).getMoTa());
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Long id = 3L;
        IDichVuDAL instance = new DichVuDAL();
        instance.delete(id);
        DichVuDTO result = instance.findById(id);
        assertNull(result);
    }
 
}
