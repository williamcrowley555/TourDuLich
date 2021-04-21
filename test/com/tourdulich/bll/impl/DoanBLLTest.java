/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.bll.impl;

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
 * @author Khoa Nguyen
 */
public class DoanBLLTest {
    
    public DoanBLLTest() {
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
     * Test of findAll method, of class DoanBLL.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        DoanBLL instance = new DoanBLL();
        List<DoanDTO> expResult = null;
        List<DoanDTO> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class DoanBLL.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Long id = null;
        DoanBLL instance = new DoanBLL();
        DoanDTO expResult = null;
        DoanDTO result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class DoanBLL.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        DoanDTO doan = null;
        DoanBLL instance = new DoanBLL();
        Long expResult = null;
        Long result = instance.save(doan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DoanBLL.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        DoanDTO doan = null;
        DoanBLL instance = new DoanBLL();
        instance.update(doan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAmount method, of class DoanBLL.
     */
    @Test
    public void testUpdateAmount() {
        System.out.println("updateAmount");
        Long id = null;
        Integer amount = null;
        DoanBLL instance = new DoanBLL();
        instance.updateAmount(id, amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DoanBLL.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Long id = null;
        DoanBLL instance = new DoanBLL();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByIdTour method, of class DoanBLL.
     */
    @Test
    public void testFindByIdTour() {
        System.out.println("findByIdTour");
        Long id = null;
        DoanBLL instance = new DoanBLL();
        List<DoanDTO> expResult = null;
        List<DoanDTO> result = instance.findByIdTour(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
