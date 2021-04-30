/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.util;

import java.time.LocalDate;
import java.time.Month;
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
public class InputValidatorUtilTest {
    
    public InputValidatorUtilTest() {
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
    public void testIsValidPattern() {
        System.out.println("isValidPattern");
        String value = "Công viên";
        String regex = "[^A-Za-z0-9\\-\\s]";
        String message = "Invalid";
        String expResult = "";
        String result = InputValidatorUtil.isValidPattern(value, regex, message);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsValidName() {
        System.out.println("isValidName");
        String name = "Minh Khôi";
        boolean whitespace = true;
        String expResult = "";
        String result = InputValidatorUtil.isValidName(name, whitespace);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsValidAddress() {
        System.out.println("isValidAddress");
        String name = "Bình Chánh";
        String expResult = "";
        String result = InputValidatorUtil.isValidAddress(name);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsValidInvoiceNumber() {
        System.out.println("isValidInvoiceNumber");
        String invoiceNumber = "HD009";
        String expResult = "";
        String result = InputValidatorUtil.isValidInvoiceNumber(invoiceNumber);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsValidBirthDate() {
        System.out.println("isValidBirthDate");
        LocalDate birthDate = LocalDate.of(2000, Month.NOVEMBER, 16);
        int smallestAge = 6;
        String expResult = "";
        String result = InputValidatorUtil.isValidBirthDate(birthDate, smallestAge);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsValidStartDate() {
        System.out.println("isValidStartDate");
        LocalDate startDate = LocalDate.of(2021, Month.APRIL, 22);
        String expResult = "";
        String result = InputValidatorUtil.isValidStartDate(startDate);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsValidEndDate() {
        System.out.println("isValidEndDate");
        LocalDate startDate = LocalDate.of(2021, Month.APRIL, 22);
        LocalDate endDate = LocalDate.of(2021, Month.APRIL, 28);;
        String expResult = "";
        String result = InputValidatorUtil.isValidEndDate(startDate, endDate);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsValidEmail() {
        System.out.println("isValidEmail");
        String email = "haminhkhoi69@gmail.com";
        String expResult = "";
        String result = InputValidatorUtil.isValidEmail(email);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsInteger() {
        System.out.println("isInteger");
        String number = "69";
        String expResult = "";
        String result = InputValidatorUtil.isInteger(number);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsLong() {
        System.out.println("isLong");
        String number = "69";
        String expResult = "";
        String result = InputValidatorUtil.isLong(number);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsVailidNumber_String() {
        System.out.println("isVailidNumber");
        String number = "69";
        String expResult = "";
        String result = InputValidatorUtil.isVailidNumber(number);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsVailidNumber_3args() {
        System.out.println("isVailidNumber");
        String number = "69";
        Integer min = 1;
        Integer max = 100;
        String expResult = "";
        String result = InputValidatorUtil.isVailidNumber(number, min, max);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsValidMoney() {
        System.out.println("isValidMoney");
        String money = "6000";
        String expResult = "";
        String result = InputValidatorUtil.isValidMoney(money);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsVailidPhoneNumber() {
        System.out.println("isVailidPhoneNumber");
        String phoneNumber = "09332572030";
        String expResult = "";
        String result = InputValidatorUtil.isVailidPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testIsVailidIdentityID() {
        System.out.println("isVailidIdentityID");
        String id = "025985777";
        String expResult = "";
        String result = InputValidatorUtil.isVailidIdentityID(id);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }
    
}
