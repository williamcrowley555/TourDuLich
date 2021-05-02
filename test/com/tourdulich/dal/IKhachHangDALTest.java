/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dal;

import com.tourdulich.dal.impl.KhachHangDAL;
import com.tourdulich.dto.KhachHangDTO;
import java.time.LocalDate;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class IKhachHangDALTest {
    
    
   @Rule
    public ExpectedException thrown = ExpectedException.none();
   
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        IKhachHangDAL instance = new KhachHangDAL();
        List<KhachHangDTO> expResult = null;
        List<KhachHangDTO> result = instance.findAll();
        assertNotNull(result);
    }

    @Test
    public void testFindByIdValid() {
        System.out.println("findByIdValid");
        Long id = 2L;
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO result = instance.findById(id);
        assertEquals(id, result.getId());
    }
    
     @Test
    public void testFindByIdInputNull() {
        System.out.println("findByIdInputNull");
        Long id = null;
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO result = instance.findById(id);
        assertNull(result);
    }
    
    @Test
    public void testFindByIdNotExist() {
        System.out.println("findByIdNotExist");
        Long id = 1999L;
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO result = instance.findById(id);
        assertNull(result);
    }
    
    @Test
    public void testFindByIdInputString() {
        System.out.println("findByIdInputString");
        thrown.expect(NumberFormatException.class);
        Long id = Long.parseLong("abc");
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO result = instance.findById(id);
        assertEquals(id, result.getId());
    }
    
    @Test
    public void testFindByIdInputFloat() {
        System.out.println("findByIdInputFloat");
        thrown.expect(NumberFormatException.class);
        Long id = Long.parseLong("1.5");
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO result = instance.findById(id);
        assertEquals(id, result.getId());
    }
    
    @Test
    public void testFindByIdInputSpecialCharacters() {
        System.out.println("findByIdInputSpecialCharacters");
        thrown.expect(NumberFormatException.class);
        Long id = Long.parseLong("@b1");
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO result = instance.findById(id);
        assertEquals(id, result.getId());
    }
    
    @Test
    public void testFindBySdt() {
        System.out.println("findBySdt");
        String sdt = "0265423595";
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO result = instance.findBySdt(sdt);
        assertEquals(sdt, result.getSdt());
    }

    @Test
    public void testFindBySdtNotExist() {
        System.out.println("findBySdtNotExist");
        String sdt = "0265423000";
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO result = instance.findBySdt(sdt);
        assertNull(result);
    }
    
    @Test
    public void testSaveValid() {
        System.out.println("saveValid");
        String ho = "Nguyễn";
        String ten = "Minh Mẫn";
        Boolean gioiTinh = true;
        String cmnd = "025995456001";
        String sdt = "0268548207";
        String diaChi = "24 đường Đông Du, Phường Bến Nghé, Quận 1, TP Hồ Chí Minh";
        LocalDate ngaySinh = LocalDate.of(1995,8,19);
        
        KhachHangDTO khachHang = new KhachHangDTO();
        khachHang.setHo(ho);
        khachHang.setTen(ten);
        khachHang.setGioiTinh(gioiTinh);
        khachHang.setCmnd(cmnd);
        khachHang.setSdt(sdt);
        khachHang.setDiaChi(diaChi);
        khachHang.setNgaySinh(ngaySinh);
        
        IKhachHangDAL instance = new KhachHangDAL();
        Long savedId = instance.save(khachHang);
        assertNotNull(instance.findById(savedId));
    }
    
    @Test
    public void testSaveNullData() {
        System.out.println("saveNullData");
        String ho = null;
        String ten = null;
        Boolean gioiTinh = true;
        String cmnd = null;
        String sdt = null;
        String diaChi = null;
        LocalDate ngaySinh = LocalDate.now();
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO khachHang = new KhachHangDTO();
        khachHang.setHo(ho);
        khachHang.setTen(ten);
        khachHang.setGioiTinh(gioiTinh);
        khachHang.setCmnd(cmnd);
        khachHang.setSdt(sdt);
        khachHang.setDiaChi(diaChi);
        khachHang.setNgaySinh(ngaySinh);
        Long savedId = instance.save(khachHang);
        assertNull(instance.findById(savedId));
    }
    
    @Test
    public void testSaveNullHo() {
        System.out.println("saveNullHo");
        String ho = null;
        String ten = "Minh Mẫn";
        Boolean gioiTinh = true;
        String cmnd = "025995456008";
        String sdt = "0268548208";
        String diaChi = "24 đường Đông Du, Phường Bến Nghé, Quận 1, TP Hồ Chí Minh";
        LocalDate ngaySinh = LocalDate.of(1995,8,19);
        
        KhachHangDTO khachHang = new KhachHangDTO();
        khachHang.setHo(ho);
        khachHang.setTen(ten);
        khachHang.setGioiTinh(gioiTinh);
        khachHang.setCmnd(cmnd);
        khachHang.setSdt(sdt);
        khachHang.setDiaChi(diaChi);
        khachHang.setNgaySinh(ngaySinh);
        
        IKhachHangDAL instance = new KhachHangDAL();
        Long savedId = instance.save(khachHang);
        assertNull(instance.findById(savedId));
    }
    
    @Test
    public void testSaveNullTen() {
        System.out.println("saveNullTen");
        String ho = "Nguyễn";
        String ten = null;
        Boolean gioiTinh = true;
        String cmnd = "025995456009";
        String sdt = "0268548209";
        String diaChi = "24 đường Đông Du, Phường Bến Nghé, Quận 1, TP Hồ Chí Minh";
        LocalDate ngaySinh = LocalDate.of(1995,8,19);
        
        KhachHangDTO khachHang = new KhachHangDTO();
        khachHang.setHo(ho);
        khachHang.setTen(ten);
        khachHang.setGioiTinh(gioiTinh);
        khachHang.setCmnd(cmnd);
        khachHang.setSdt(sdt);
        khachHang.setDiaChi(diaChi);
        khachHang.setNgaySinh(ngaySinh);
        
        IKhachHangDAL instance = new KhachHangDAL();
        Long savedId = instance.save(khachHang);
        assertNull(instance.findById(savedId));
    }
    
    @Test
    public void testSaveNullCmnd() {
        System.out.println("saveNullCmnd");
        String ho = "Nguyễn";
        String ten = "Minh Mẫn";
        Boolean gioiTinh = true;
        String cmnd = null;
        String sdt = "0268548207";
        String diaChi = "24 đường Đông Du, Phường Bến Nghé, Quận 1, TP Hồ Chí Minh";
        LocalDate ngaySinh = LocalDate.of(1995,8,19);
        
        KhachHangDTO khachHang = new KhachHangDTO();
        khachHang.setHo(ho);
        khachHang.setTen(ten);
        khachHang.setGioiTinh(gioiTinh);
        khachHang.setCmnd(cmnd);
        khachHang.setSdt(sdt);
        khachHang.setDiaChi(diaChi);
        khachHang.setNgaySinh(ngaySinh);
        
        IKhachHangDAL instance = new KhachHangDAL();
        Long savedId = instance.save(khachHang);
        assertNull(instance.findById(savedId));
    }
    
    @Test
    public void testSaveNullSdt() {
        System.out.println("saveNullSdt");
        String ho = "Nguyễn";
        String ten = "Minh Mẫn";
        Boolean gioiTinh = true;
        String cmnd = "025995456001";
        String sdt = null;
        String diaChi = "24 đường Đông Du, Phường Bến Nghé, Quận 1, TP Hồ Chí Minh";
        LocalDate ngaySinh = LocalDate.of(1995,8,19);
        
        KhachHangDTO khachHang = new KhachHangDTO();
        khachHang.setHo(ho);
        khachHang.setTen(ten);
        khachHang.setGioiTinh(gioiTinh);
        khachHang.setCmnd(cmnd);
        khachHang.setSdt(sdt);
        khachHang.setDiaChi(diaChi);
        khachHang.setNgaySinh(ngaySinh);
        
        IKhachHangDAL instance = new KhachHangDAL();
        Long savedId = instance.save(khachHang);
        assertNull(instance.findById(savedId));
    }
    
    @Test
    public void testSaveNullDiaChi() {
        System.out.println("saveNullDiaChi");
        String ho = "Nguyễn";
        String ten = "Quang Minh";
        Boolean gioiTinh = true;
        String cmnd = "087995456012";
        String sdt = "0868548217";
        String diaChi = null;
        LocalDate ngaySinh = LocalDate.of(1995,8,19);
        
        KhachHangDTO khachHang = new KhachHangDTO();
        khachHang.setHo(ho);
        khachHang.setTen(ten);
        khachHang.setGioiTinh(gioiTinh);
        khachHang.setCmnd(cmnd);
        khachHang.setSdt(sdt);
        khachHang.setDiaChi(diaChi);
        khachHang.setNgaySinh(ngaySinh);
        
        IKhachHangDAL instance = new KhachHangDAL();
        Long savedId = instance.save(khachHang);
        assertNull(instance.findById(savedId));
    }
    
    @Test
    public void testSaveInvalidHo() {
        System.out.println("saveInvalidHo");
        String ho = "@";
        String ten = "Minh Mẫn";
        Boolean gioiTinh = true;
        String cmnd = "063995456012";
        String sdt = "0658548517";
        String diaChi = "24 đường Đông Du, Phường Bến Nghé, Quận 1, TP Hồ Chí Minh";
        LocalDate ngaySinh = LocalDate.of(1995,8,19);
        
        KhachHangDTO khachHang = new KhachHangDTO();
        khachHang.setHo(ho);
        khachHang.setTen(ten);
        khachHang.setGioiTinh(gioiTinh);
        khachHang.setCmnd(cmnd);
        khachHang.setSdt(sdt);
        khachHang.setDiaChi(diaChi);
        khachHang.setNgaySinh(ngaySinh);
        
        IKhachHangDAL instance = new KhachHangDAL();
        Long savedId = instance.save(khachHang);
        assertNull(instance.findById(savedId));
    }
    
    @Test
    public void testSaveInvalidTen() {
        System.out.println("saveInvalidTen");
        String ho = "Nguyễn";
        String ten = "@";
        Boolean gioiTinh = true;
        String cmnd = "063995456014";
        String sdt = "0658548517";
        String diaChi = "24 đường Đông Du, Phường Bến Nghé, Quận 1, TP Hồ Chí Minh";
        LocalDate ngaySinh = LocalDate.of(1995,8,19);
        
        KhachHangDTO khachHang = new KhachHangDTO();
        khachHang.setHo(ho);
        khachHang.setTen(ten);
        khachHang.setGioiTinh(gioiTinh);
        khachHang.setCmnd(cmnd);
        khachHang.setSdt(sdt);
        khachHang.setDiaChi(diaChi);
        khachHang.setNgaySinh(ngaySinh);
        
        IKhachHangDAL instance = new KhachHangDAL();
        Long savedId = instance.save(khachHang);
        assertNull(instance.findById(savedId));
    }
    
    @Test
    public void testSaveInvalidCmnd() {
        System.out.println("saveInvalidCmnd");
        String ho = "Nguyễn";
        String ten = "Minh Mẫn";
        Boolean gioiTinh = true;
        String cmnd = "dsb";
        String sdt = "0658548517";
        String diaChi = "24 đường Đông Du, Phường Bến Nghé, Quận 1, TP Hồ Chí Minh";
        LocalDate ngaySinh = LocalDate.of(1995,8,19);
        
        KhachHangDTO khachHang = new KhachHangDTO();
        khachHang.setHo(ho);
        khachHang.setTen(ten);
        khachHang.setGioiTinh(gioiTinh);
        khachHang.setCmnd(cmnd);
        khachHang.setSdt(sdt);
        khachHang.setDiaChi(diaChi);
        khachHang.setNgaySinh(ngaySinh);
        
        IKhachHangDAL instance = new KhachHangDAL();
        Long savedId = instance.save(khachHang);
        assertNull(instance.findById(savedId));
    }
    
    @Test
    public void testSaveInvalidSdt() {
        System.out.println("saveInvalidSdt");
        String ho = "Nguyễn";
        String ten = "Minh Mẫn";
        Boolean gioiTinh = true;
        String cmnd = "0658548517";
        String sdt = "sg";
        String diaChi = "24 đường Đông Du, Phường Bến Nghé, Quận 1, TP Hồ Chí Minh";
        LocalDate ngaySinh = LocalDate.of(1995,8,19);
        
        KhachHangDTO khachHang = new KhachHangDTO();
        khachHang.setHo(ho);
        khachHang.setTen(ten);
        khachHang.setGioiTinh(gioiTinh);
        khachHang.setCmnd(cmnd);
        khachHang.setSdt(sdt);
        khachHang.setDiaChi(diaChi);
        khachHang.setNgaySinh(ngaySinh);
        
        IKhachHangDAL instance = new KhachHangDAL();
        Long savedId = instance.save(khachHang);
        assertNull(instance.findById(savedId));
    }
    
    @Test
    public void testUpdateHo() {
        System.out.println("update");
        IKhachHangDAL instance = new KhachHangDAL();
        
        Long id = 5L;       
        String ho = "Hồ";
        KhachHangDTO khachHang = instance.findById(id);
        khachHang.setHo(ho);
        instance.update(khachHang);
        
        assertEquals(ho, instance.findById(id).getHo());
    }

    @Test
    public void testUpdateNullHo() {
        System.out.println("updateNullHo");
        Long khachHangId = 35L;
        String ho = null;
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO khachHang = instance.findById(khachHangId);
        String oldHo = khachHang.getHo();
        khachHang.setHo(ho);
        instance.update(khachHang);
        assertEquals(oldHo, instance.findById(khachHangId).getHo());
    }
    
    @Test
    public void testUpdateNullTen() {
        System.out.println("updateNullTen");
        Long khachHangId = 35L;
        String ten = null;
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO khachHang = instance.findById(khachHangId);
        String oldTen = khachHang.getTen();
        khachHang.setTen(ten);
        instance.update(khachHang);
        assertEquals(oldTen, instance.findById(khachHangId).getTen());
    }
    
    @Test
    public void testUpdateNullCmnd() {
        System.out.println("updateNullCmnd");
        Long khachHangId = 35L;
        String cmnd = null;
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO khachHang = instance.findById(khachHangId);
        String oldCmnd = khachHang.getCmnd();
        khachHang.setCmnd(cmnd);
        instance.update(khachHang);
        assertEquals(oldCmnd, instance.findById(khachHangId).getCmnd());
    }
    
    @Test
    public void testUpdateNullSdt() {
        System.out.println("updateNullSdt");
        Long khachHangId = 35L;
        String sdt = null;
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO khachHang = instance.findById(khachHangId);
        String oldTen = khachHang.getSdt();
        khachHang.setSdt(sdt);
        instance.update(khachHang);
        assertEquals(oldTen, instance.findById(khachHangId).getSdt());
    }
    
    @Test
    public void testUpdateNullDiaChi() {
        System.out.println("updateNullDiaChi");
        Long khachHangId = 35L;
        String diaChi = null;
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO khachHang = instance.findById(khachHangId);
        String oldTen = khachHang.getDiaChi();
        khachHang.setDiaChi(diaChi);
        instance.update(khachHang);
        assertEquals(oldTen, instance.findById(khachHangId).getDiaChi());
    }
    
    @Test
    public void testUpdateInvalidHo() {
        System.out.println("updateInvalidHo");
        Long dichVuId = 35L;
        String ho = "@";
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO khachHang = instance.findById(dichVuId);
        String oldTenKhachHang = khachHang.getHo();
        khachHang.setHo(ho);
        instance.update(khachHang);
        assertEquals(oldTenKhachHang, instance.findById(dichVuId).getHo());
    }
    
    @Test
    public void testUpdateInvalidTen() {
        System.out.println("updateInvalidTen");
        Long dichVuId = 35L;
        String ten = "@";
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO khachHang = instance.findById(dichVuId);
        String oldTenKhachHang = khachHang.getTen();
        khachHang.setTen(ten);
        instance.update(khachHang);
        assertEquals(oldTenKhachHang, instance.findById(dichVuId).getTen());
    }
    
    @Test
    public void testUpdateInvalidCmnd() {
        System.out.println("updateInvalidCmnd");
        Long khachHangId = 35L;
        String cmnd =  "@";
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO khachHang = instance.findById(khachHangId);
        String oldCmnd = khachHang.getCmnd();
        khachHang.setCmnd(cmnd);
        instance.update(khachHang);
        assertEquals(oldCmnd, instance.findById(khachHangId).getCmnd());
    }
    
    @Test
    public void testUpdateInvalidSdt() {
        System.out.println("updateInvalidSdt");
        Long khachHangId = 35L;
        String sdt =  "@";
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO khachHang = instance.findById(khachHangId);
        String oldTen = khachHang.getSdt();
        khachHang.setSdt(sdt);
        instance.update(khachHang);
        assertEquals(oldTen, instance.findById(khachHangId).getSdt());
    }
    
    @Test
    public void testUpdateInvalidDiaChi() {
        System.out.println("updateInvalidDiaChi");
        Long khachHangId = 35L;
        String diaChi =  "@";
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO khachHang = instance.findById(khachHangId);
        String oldTen = khachHang.getDiaChi();
        khachHang.setDiaChi(diaChi);
        instance.update(khachHang);
        assertEquals(oldTen, instance.findById(khachHangId).getDiaChi());
    }
    
    @Test
    public void testUpdateNotExistId() {
        System.out.println("updateNotExistId");
        Long khachHangId = 200L;
        IKhachHangDAL instance = new KhachHangDAL();
        KhachHangDTO khachHang = instance.findById(khachHangId);
        assertNull(khachHang);
    }
    
    @Test
    public void testDelete() {
        System.out.println("delete");
        Long id = 6L;
        IKhachHangDAL instance = new KhachHangDAL();
        instance.delete(id);
        KhachHangDTO result = instance.findById(id);
        assertNull(result);
    }   
    
     @Test
    public void testDeleteNotExistId() {
        System.out.println("deleteNotExistId");
        Long id = 300L;
        IKhachHangDAL instance = new KhachHangDAL();
        instance.delete(id);
        KhachHangDTO result = instance.findById(id);
        assertNull(result);
    }
}