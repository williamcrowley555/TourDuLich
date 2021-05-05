/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll;

import com.tourdulich.bll.impl.ChiPhiDoanBLL;
import com.tourdulich.dto.ChiPhiDoanDTO;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author USER
 */
public class IChiPhiDoanBLLTest {
    public IChiPhiDoanBLLTest(){}
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        List<ChiPhiDoanDTO> expResult = null;
        List<ChiPhiDoanDTO> result = instance.findAll();
        assertNotNull(result);
    }
    
    @Test
    public void testFindById1() {
        System.out.println("findById");
        Long id = 1L;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO result = instance.findById(id);
        assertEquals(id, result.getId());
    }
    
    @Test
    public void testFindById2() {
        System.out.println("findById");
        Long id = 123L;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO result = instance.findById(id);
        assertEquals(id, result.getId());
    }
    
    @Test
    public void testSave1()
    {
        System.out.println("save");
        Long idTour = 411L;
        Long idDoan = 4111L;
        Long idDichVu = 21L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 1);
        Integer chiPhi = 2500000;
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    @Test
    public void testSave2()
    {
        System.out.println("save");
        Long idTour = 5123L;
        Long idDoan = 4111L;
        Long idDichVu = 21L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 1);
        Integer chiPhi = 2500000;
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    @Test
    public void testSave3()
    {
        System.out.println("save");
        Long idTour = 411L;
        Long idDoan = 5123L;
        Long idDichVu = 21L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 1);
        Integer chiPhi = 2500000;
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    @Test
    public void testSave4()
    {
        System.out.println("save");
        Long idTour = 411L;
        Long idDoan = 4111L;
        Long idDichVu = 5123L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 1);
        Integer chiPhi = 2500000;
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    @Test
    public void testSave5()
    {
        System.out.println("save");
        Long idTour = 411L;
        Long idDoan = 4111L;
        Long idDichVu = 21L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 32);
        Integer chiPhi = 2500000;
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    @Test
    public void testSave6()
    {
        System.out.println("save");
        Long idTour = 411L;
        Long idDoan = 4111L;
        Long idDichVu = 21L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 1);
        Integer chiPhi = Integer.parseInt("abc");
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    @Test
    public void testSave7()
    {
        System.out.println("save");
        Long idTour = 411L;
        Long idDoan = 4111L;
        Long idDichVu = 5123L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 1);
        Integer chiPhi = Integer.parseInt("abc");
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    @Test
    public void testSave8()
    {
        System.out.println("save");
        Long idTour = 411L;
        Long idDoan = 5123L;
        Long idDichVu = 5123L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 1);
        Integer chiPhi = 2500000;
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    @Test
    public void testSave9()
    {
        System.out.println("save");
        Long idTour = 5123L;
        Long idDoan = 5123L;
        Long idDichVu = 5123L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 1);
        Integer chiPhi = 2500000;
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    @Test
    public void testSave10()
    {
        System.out.println("save");
        Long idTour = 411L;
        Long idDoan = 4111L;
        Long idDichVu = 5123L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 32);
        Integer chiPhi = 2500000;
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    @Test
    public void testSave11()
    {
        System.out.println("save");
        Long idTour = 5123L;
        Long idDoan = 4111L;
        Long idDichVu = 5123L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 1);
        Integer chiPhi = 2500000;
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    @Test
    public void testSave12()
    {
        System.out.println("save");
        Long idTour = 5123L;
        Long idDoan = 5123L;
        Long idDichVu = 5123L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 32);
        Integer chiPhi = Integer.parseInt("abc");
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    @Test
    public void testSave13()
    {
        System.out.println("save");
        Long idTour = 5123L;
        Long idDoan = 4111L;
        Long idDichVu = 21L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 1);
        Integer chiPhi = Integer.parseInt("abc");
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    public void testSave14()
    {
        System.out.println("save");
        Long idTour = 5123L;
        Long idDoan = 4111L;
        Long idDichVu = 5123L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 32);
        Integer chiPhi = Integer.parseInt("abc");
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    public void testSave15()
    {
        System.out.println("save");
        Long idTour = 411L;
        Long idDoan = 5123L;
        Long idDichVu = 5123L;
        String hoaDon = "HD004";
        LocalDate ngayHoaDon = LocalDate.of(2021, Month.JUNE, 1);
        Integer chiPhi = 2500000;
       
        ChiPhiDoanDTO chiPhiDoan = new ChiPhiDoanDTO();
        chiPhiDoan.setIdDoan(idDoan);
        chiPhiDoan.setIdDichVu(idDichVu);
        chiPhiDoan.setHoaDon(hoaDon);
        chiPhiDoan.setNgayHoaDon(ngayHoaDon);
        chiPhiDoan.setChiPhi(chiPhi);
       
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        Long savedId = instance.save(chiPhiDoan);
        ChiPhiDoanDTO result = instance.findById(savedId);
       
        assertEquals(idDoan, result.getIdDoan());
        assertEquals(idDichVu, result.getIdDichVu());
        assertEquals(hoaDon, result.getHoaDon());
        assertEquals(ngayHoaDon, result.getNgayHoaDon());
        assertEquals(chiPhi, result.getChiPhi());
    }
    
    @Test
    public void testUpdate1() {
        System.out.println("update");
        Long id = 4L;
        Integer chiPhi = 100000;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate2() {
        System.out.println("update");
        Long id = 5123L;
        Integer chiPhi = 100000;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate3() {
        System.out.println("update");
        Long id = Long.parseLong("abc");
        Integer chiPhi = 100000;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate4() {
        System.out.println("update");
        Long id = 4L;
        Integer chiPhi = -5;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate5() {
        System.out.println("update");
        Long id = 4L;
        Integer chiPhi = Integer.parseInt("abc");
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate6() {
        System.out.println("update");
        Long id = 5123L;
        Integer chiPhi = -5;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate7() {
        System.out.println("update");
        Long id = 5123L;
        Integer chiPhi = Integer.parseInt("abc");
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate8() {
        System.out.println("update");
        Long id = Long.parseLong("abc");
        Integer chiPhi = Integer.parseInt("abc");
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate9() {
        System.out.println("update");
        Long id = 4L;
        Integer chiPhi = 100000;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate10() {
        System.out.println("update");
        Long id = 4L;
        Integer chiPhi = 100000;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate11() {
        System.out.println("update");
        Long id = 4L;
        Integer chiPhi = 100000;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate12() {
        System.out.println("update");
        Long id = 4L;
        Integer chiPhi = 100000;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate13() {
        System.out.println("update");
        Long id = 4L;
        Integer chiPhi = 100000;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate14() {
        System.out.println("update");
        Long id = 4L;
        Integer chiPhi = 100000;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
    
    @Test
    public void testUpdate15() {
        System.out.println("update");
        Long id = 4L;
        Integer chiPhi = 100000;
        IChiPhiDoanBLL instance = new ChiPhiDoanBLL();
        ChiPhiDoanDTO chiPhiDoan = instance.findById(id);
        chiPhiDoan.setChiPhi(chiPhi);
        instance.update(chiPhiDoan);
        assertEquals(chiPhi, instance.findById(id).getChiPhi());
    }
}
