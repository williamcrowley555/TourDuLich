/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dal;

import com.tourdulich.dal.impl.DiaDiemDAL;
import com.tourdulich.dto.DiaDiemDTO;
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
public class IDiaDiemDALTest {
    
    public IDiaDiemDALTest() {
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
        IDiaDiemDAL instance = new DiaDiemDAL();
        List<DiaDiemDTO> expResult = null;
        List<DiaDiemDTO> result = instance.findAll();
        assertNotNull(result);
        
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        Long id = 4L;
        IDiaDiemDAL instance = new DiaDiemDAL();
        DiaDiemDTO expResult = new DiaDiemDTO(4L,"Nhà hàng Sang Mèo","Sapa","Không có mèo",null,49L);
        DiaDiemDTO result = instance.findById(id);
        
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getTenDiaDiem(), result.getTenDiaDiem());
        assertEquals(expResult.getDiaChi(), result.getDiaChi());
        assertEquals(expResult.getGioiThieu(), result.getGioiThieu());
        assertEquals(expResult.getHinhAnh(), result.getHinhAnh());
        assertEquals(expResult.getIdTinh(), result.getIdTinh());
      
    }

    @Test
    public void testFindByIdTinh() {
        System.out.println("findByIdTinh");
        Long idTinh = 52L;
        IDiaDiemDAL instance = new DiaDiemDAL();
        DiaDiemDTO expResult = new DiaDiemDTO();
        expResult.setId(521L);
        expResult.setTenDiaDiem("Biển Vũng Tàu");
        expResult.setDiaChi("Bà rịa - Vũng tàu");
        expResult.setGioiThieu("Biển Vũng Tàu");
        expResult.setHinhAnh(null);
        expResult.setIdTinh(52L);
        List<DiaDiemDTO> result = instance.findByIdTinh(idTinh);
        assertEquals(expResult.getId(), result.get(0).getId());
        assertEquals(expResult.getTenDiaDiem(), result.get(0).getTenDiaDiem());
        assertEquals(expResult.getDiaChi(), result.get(0).getDiaChi());
        assertEquals(expResult.getGioiThieu(), result.get(0).getGioiThieu());
        assertEquals(expResult.getHinhAnh(), result.get(0).getHinhAnh());
        assertEquals(expResult.getIdTinh(), result.get(0).getIdTinh()); 
    }

    @Test
    public void testSave() {
        System.out.println("save");
        String tenDiaDiem = "Nhà hàng Sang Mèo";
        String diaChi = "Sapa";
        String gioiThieu = "Không có mèo";
        Long idTinh = 49L;
        
        DiaDiemDTO diaDiem = new DiaDiemDTO();
        
        diaDiem.setTenDiaDiem(tenDiaDiem);
        diaDiem.setDiaChi(diaChi);
        diaDiem.setGioiThieu(gioiThieu);
        diaDiem.setIdTinh(idTinh);
        
        IDiaDiemDAL instance = new DiaDiemDAL();
        Long savedId = instance.save(diaDiem);
               
        DiaDiemDTO result = instance.findById(savedId);
        assertEquals(tenDiaDiem, result.getTenDiaDiem());
        assertEquals(diaChi, result.getDiaChi());
        assertEquals(gioiThieu, result.getGioiThieu());
        assertEquals(idTinh, result.getIdTinh());
    }

    @Test
    public void testUpdate() {
        System.out.println("update");     
        IDiaDiemDAL instance = new DiaDiemDAL();
        Long diaDiemId = 3L;
        String gioiThieu = "Có mèo";
        DiaDiemDTO diaDiem = instance.findById(diaDiemId);
        diaDiem.setGioiThieu(gioiThieu);
        instance.update(diaDiem);
        
        assertEquals(gioiThieu, instance.findById(diaDiemId).getGioiThieu());
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Long id = 3L;
        DiaDiemDAL instance = new DiaDiemDAL();
        instance.delete(id);
        assertEquals(instance.findById(id), null);
    }

    public class IDiaDiemDALImpl implements IDiaDiemDAL {

        public List<DiaDiemDTO> findAll() {
            return null;
        }

        public DiaDiemDTO findById(Long id) {
            return null;
        }

        public List<DiaDiemDTO> findByIdTinh(Long idTinh) {
            return null;
        }

        public Long save(DiaDiemDTO diaDiem) {
            return null;
        }

        public void update(DiaDiemDTO diaDiem) {
        }

        public void delete(Long id) {
        }
    }
    
}
