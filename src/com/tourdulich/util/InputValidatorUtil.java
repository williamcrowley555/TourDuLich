/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.util;

import java.sql.Types;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HP
 */
public class InputValidatorUtil {
    
    public static String isValidName(String name, boolean whitespace) {
        String space = whitespace ? "\\s" : "";
        String regex = "[^A-Za-z" + space + "]";
        boolean result = name.matches(regex);
        if(result) {
            String extraMessage = whitespace ? "" : ", khoảng trắng";
            return " không bao gồm số, ký tự đặc biệt" + extraMessage;
        }
        return "";
    }
    
    public static String isValidEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex) ? "" : "Email không hợp lệ";
    }
    
    public static String isInteger(String number) {
        try {
            Integer num = Integer.parseInt(number);
        } catch(Exception e) {
            return "Số nhập vào phải là số nguyên";
        }
        return "";
    }
    
    public static String isVailidNumber(String number) {
        String regex = "[^0-9]";
        boolean result = number.matches(regex);
        if(result) {
            return "Số không hợp lệ";
        }
        
        String message = isInteger(number);
        if(!message.isEmpty()) return message;
        
        return "";
    }
    
    public static String isVailidNumber(String number, Integer min, Integer max) {
        String regex = "[^0-9]";
        boolean result = number.matches(regex);
        if(result) {
            return "Số không hợp lệ";
        }
        
        String message = isInteger(number);
        if(!message.isEmpty()) return message;
        
        Integer num = Integer.parseInt(number);
        if(min != null) {
            if(num < min) {
                return "Số nhập vào tối thiểu là " + min;
            }
        }
        if(max != null) {
            if(num > max) {
                return "Số nhập vào tối đa là " + max;
            }
        }
        return "";
    }
    
    public static void main(String[] args) {
        String rs = isValidEmail("helloWorld@gmail.com");
        if(rs.isEmpty()) System.out.println("OK");
        else System.out.println(rs);
    }
}
