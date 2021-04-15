/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll;

import com.tourdulich.bll.impl.DiaDiemBLL;
import com.tourdulich.dto.DiaDiemDTO;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Khoa Nguyen
 */
public class IDiaDiemBLLTest {
    
    public IDiaDiemBLLTest() {
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

    /**
     * Test of findAll method, of class IDiaDiemBLL.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
      
        IDiaDiemBLL instance = new DiaDiemBLL();
        List<DiaDiemDTO> expResult = null;
        List<DiaDiemDTO> result = instance.findAll();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class IDiaDiemBLL.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Long id = 4L;
        IDiaDiemBLL instance = new DiaDiemBLL();
        DiaDiemDTO expResult = new DiaDiemDTO(4L,"Nhà hàng Sang Mèo","Sapa","Không có mèo",null,49L);
        
        DiaDiemDTO result = instance.findById(id);
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getTenDiaDiem(), result.getTenDiaDiem());
        assertEquals(expResult.getDiaChi(), result.getDiaChi());
        assertEquals(expResult.getGioiThieu(), result.getGioiThieu());
        assertEquals(expResult.getHinhAnh(), result.getHinhAnh());
        assertEquals(expResult.getIdTinh(), result.getIdTinh());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findByIdTinh method, of class IDiaDiemBLL.
     */
    @Test
    public void testFindByIdTinh() {
        System.out.println("findByIdTinh");
        Long idTinh = 52L;
        IDiaDiemBLL instance = new DiaDiemBLL();
        DiaDiemDTO expResult = new DiaDiemDTO();
        expResult.setId(521L);
        expResult.setTenDiaDiem("Biển Vũng Tàu");
        expResult.setDiaChi("Bà rịa - Vũng tàu");
        expResult.setGioiThieu("Biển Vũng Tàu");
        expResult.setHinhAnh(null);
        expResult.setIdTinh(52L);
        //List<DiaDiemDTO> expResult = new ArrayList<DiaDiemDTO>();
        List<DiaDiemDTO> result = instance.findByIdTinh(idTinh);
        assertEquals(expResult.getId(), result.get(0).getId());
        assertEquals(expResult.getTenDiaDiem(), result.get(0).getTenDiaDiem());
        assertEquals(expResult.getDiaChi(), result.get(0).getDiaChi());
        assertEquals(expResult.getGioiThieu(), result.get(0).getGioiThieu());
        assertEquals(expResult.getHinhAnh(), result.get(0).getHinhAnh());
        assertEquals(expResult.getIdTinh(), result.get(0).getIdTinh());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class IDiaDiemBLL.
     */
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
        
        IDiaDiemBLL instance = new DiaDiemBLL();
        Long savedId = instance.save(diaDiem);
        DiaDiemDTO result = instance.findById(savedId);
        
        assertEquals(tenDiaDiem, result.getTenDiaDiem());
        assertEquals(diaChi, result.getDiaChi());
        assertEquals(gioiThieu, result.getGioiThieu());
        assertEquals(idTinh, result.getIdTinh());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class IDiaDiemBLL.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        IDiaDiemBLL instance = new DiaDiemBLL();
        
        Long diaDiemId = 3L;
        String gioiThieu = "Có mèo";
        DiaDiemDTO diaDiem = instance.findById(diaDiemId);
        diaDiem.setGioiThieu(gioiThieu);
        instance.update(diaDiem);
        
        assertEquals(gioiThieu, instance.findById(diaDiemId).getGioiThieu());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class IDiaDiemBLL.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Long id = 8L;
        IDiaDiemBLL instance = new DiaDiemBLL();
        instance.delete(id);
        DiaDiemDTO result = instance.findById(id);
        assertEquals(result, null);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class IDiaDiemBLLImpl implements IDiaDiemBLL {

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
