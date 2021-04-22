/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll;

import com.tourdulich.dto.DoanDTO;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class IDoanBLLTest {
    
    public IDoanBLLTest() {
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
        IDoanBLL instance = new IDoanBLLImpl();
        List<DoanDTO> expResult = null;
        List<DoanDTO> result = instance.findAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        Long id = null;
        IDoanBLL instance = new IDoanBLLImpl();
        DoanDTO expResult = null;
        DoanDTO result = instance.findById(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByIdTour() {
        System.out.println("findByIdTour");
        Long id = null;
        IDoanBLL instance = new IDoanBLLImpl();
        List<DoanDTO> expResult = null;
        List<DoanDTO> result = instance.findByIdTour(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSave() {
        System.out.println("save");
        DoanDTO doan = null;
        IDoanBLL instance = new IDoanBLLImpl();
        Long expResult = null;
        Long result = instance.save(doan);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        DoanDTO doan = null;
        IDoanBLL instance = new IDoanBLLImpl();
        instance.update(doan);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateAmount() {
        System.out.println("updateAmount");
        Long id = null;
        Integer amount = null;
        IDoanBLL instance = new IDoanBLLImpl();
        instance.updateAmount(id, amount);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Long id = null;
        IDoanBLL instance = new IDoanBLLImpl();
        instance.delete(id);
        fail("The test case is a prototype.");
    }

    public class IDoanBLLImpl implements IDoanBLL {

        public List<DoanDTO> findAll() {
            return null;
        }

        public DoanDTO findById(Long id) {
            return null;
        }

        public List<DoanDTO> findByIdTour(Long id) {
            return null;
        }

        public Long save(DoanDTO doan) {
            return null;
        }

        public void update(DoanDTO doan) {
        }

        public void updateAmount(Long id, Integer amount) {
        }

        public void delete(Long id) {
        }
    }
    
}
