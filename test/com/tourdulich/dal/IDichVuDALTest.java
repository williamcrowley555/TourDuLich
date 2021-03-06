/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dal;

import com.tourdulich.dal.impl.DichVuDAL;
import com.tourdulich.dto.DichVuDTO;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Hi
 */
public class IDichVuDALTest {
    
    public IDichVuDALTest() {
    }
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();
 

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        IDichVuDAL instance = new DichVuDAL();
        List<DichVuDTO> expResult = null;
        List<DichVuDTO> result = instance.findAll();
        assertNotNull(result);
    }

    @Test
    public void testFindByIdValid() {
        System.out.println("findByIdValid");
        Long id = 21L;
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO result = instance.findById(id);
        assertEquals(id, result.getId());
        
    }
    
    @Test
    public void testFindByIdInputNull() {
        System.out.println("findByIdInputNull");
        Long id = null;
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO result = instance.findById(id);
        assertNull(result);
    }
    
    @Test
    public void testFindByIdNotExist() {
        System.out.println("findByIdNotExist");
        Long id = 1L;
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO result = instance.findById(id);
        assertNull(result);
    }
    
    @Test
    public void testFindByIdInputString() {
        System.out.println("findByIdInputString");
        thrown.expect(NumberFormatException.class);
        Long id = Long.parseLong("abc");
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO result = instance.findById(id);
        assertEquals(id, result.getId());
    }
    
    @Test
    public void testFindByIdInputFloat() {
        System.out.println("findByIdInputFloat");
        thrown.expect(NumberFormatException.class);
        Long id = Long.parseLong("1.5");
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO result = instance.findById(id);
        assertEquals(id, result.getId());
    }
    
    @Test
    public void testFindByIdInputSpecialCharacters() {
        System.out.println("findByIdInputSpecialCharacters");
        thrown.expect(NumberFormatException.class);
        Long id = Long.parseLong("@b1");
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO result = instance.findById(id);
        assertEquals(id, result.getId());
    }
      
    
    @Test
    public void testSaveValid() {
        System.out.println("saveValid");
        String TenDichVu = "Hồ bơi";
        String MoTa = "Hồ bơi vô cực";
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO dichVu = new DichVuDTO();
        dichVu.setMoTa(MoTa);
        dichVu.setTenDichVu(TenDichVu);
        Long savedId = instance.save(dichVu);
        assertNotNull(instance.findById(savedId));
    }
    
    @Test
    public void testSaveNull() {
        System.out.println("saveNull");
        String TenDichVu = null;
        String MoTa = null;
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO dichVu = new DichVuDTO();
        dichVu.setMoTa(MoTa);
        dichVu.setTenDichVu(TenDichVu);
        Long savedId = instance.save(dichVu);
        assertNull(instance.findById(savedId));
    }
    
    @Test
    public void testSaveNullTenDichVu() {
        System.out.println("saveNullTenDichVu");
        String TenDichVu = null;
        String MoTa = "Hồ bơi vô cực";
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO dichVu = new DichVuDTO();
        dichVu.setMoTa(MoTa);
        dichVu.setTenDichVu(TenDichVu);
        Long savedId = instance.save(dichVu);
        assertNull(instance.findById(savedId));
    }
    
    @Test
    public void testSaveInvalidTenDichVu() {
        System.out.println("saveInvalidTenDichVu");
        String TenDichVu = "@!@#@#!@123";
        String MoTa = "Hồ bơi vô cực";
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO dichVu = new DichVuDTO();
        dichVu.setMoTa(MoTa);
        dichVu.setTenDichVu(TenDichVu);
        Long savedId = instance.save(dichVu);
        assertNull(instance.findById(savedId));
    }
    
    
    
    @Test
    public void testSaveNullMota() {
        System.out.println("saveNullMota");
        String TenDichVu = "Hồ bơi";
        String MoTa = null;
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO dichVu = new DichVuDTO();
        dichVu.setMoTa(MoTa);
        dichVu.setTenDichVu(TenDichVu);
        Long savedId = instance.save(dichVu);
        assertNotNull(instance.findById(savedId));
    }

    @Test
    public void testUpdateMota() {
        System.out.println("updateMota");
        Long dichVuId = 2L;
        String moTa = "Hồ bơi thiên nhiên";
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO dichVu = instance.findById(dichVuId);
        dichVu.setMoTa(moTa);
        instance.update(dichVu);
        assertEquals(moTa, instance.findById(dichVuId).getMoTa());
    }
    
    @Test
    public void testUpdateNullMota() {
        System.out.println("updateNullMota");
        Long dichVuId = 2L;
        String moTa = "Hồ bơi thiên nhiên";
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO dichVu = instance.findById(dichVuId);
        dichVu.setMoTa(moTa);
        instance.update(dichVu);
        assertEquals(moTa, instance.findById(dichVuId).getMoTa());
    }
    
    @Test
    public void testUpdateValidTenDichVu() {
        System.out.println("updateValidTenDichVu");
        Long dichVuId = 19L;
        String tenDichVu = "Bể Bơi";
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO dichVu = instance.findById(dichVuId);
        dichVu.setTenDichVu(tenDichVu);
        instance.update(dichVu);
        assertEquals(tenDichVu, instance.findById(dichVuId).getTenDichVu());
    }
    
    @Test
    public void testUpdateNullTenDichVu() {
        System.out.println("updateNullTenDichVu");
        Long dichVuId = 19L;
        String tenDichVu = null;
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO dichVu = instance.findById(dichVuId);
        String oldTenDichVu = dichVu.getTenDichVu();
        dichVu.setTenDichVu(tenDichVu);
        instance.update(dichVu);
        assertEquals(oldTenDichVu, instance.findById(dichVuId).getTenDichVu());
    }
    
    @Test
    public void testUpdateInvalidTenDichVu() {
        System.out.println("updateInvalidTenDichVu");
        Long dichVuId = 19L;
        String tenDichVu = "123@!$!@$@$";
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO dichVu = instance.findById(dichVuId);
        String oldTenDichVu = dichVu.getTenDichVu();
        dichVu.setTenDichVu(tenDichVu);
        instance.update(dichVu);
        assertEquals(oldTenDichVu, instance.findById(dichVuId).getTenDichVu());
    }
    
    @Test
    public void testUpdateNotExistId() {
        System.out.println("update");
        Long dichVuId = 200L;
        String moTa = "Hồ bơi thiên nhiên";
        IDichVuDAL instance = new DichVuDAL();
        DichVuDTO dichVu = instance.findById(dichVuId);
        assertNull(dichVu);
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
    
    @Test
    public void testDeleteNotExistId() {
        System.out.println("deleteNotExistId");
        Long id = 300L;
        IDichVuDAL instance = new DichVuDAL();
        instance.delete(id);
        DichVuDTO result = instance.findById(id);
        assertNull(result);
    }
 
}
