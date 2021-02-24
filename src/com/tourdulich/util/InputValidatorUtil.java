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
        if (name.isEmpty()) return " không được để trống";
        String space = whitespace ? "\\s" : "";
        String regex = "[^A-Za-z" + space + "]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.find();
        if(result) {
            String extraMessage = whitespace ? "" : ", khoảng trắng";
            return " không bao gồm số, ký tự đặc biệt" + extraMessage;
        }
        return "";
    }
    
    public static String isValidAddress(String name) {
        if (name.isEmpty()) return " không được để trống";
        String regex = "[^A-Za-z0-9.,\\s\\/]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.find();
        if(result) {
            return "Dịa chỉ không hợp lệ";
        }
        return "";
    }
    
    public static String isValidEmail(String email) {
        if (email.isEmpty()) return " không được để trống";
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
        if (number.isEmpty()) return " không được để trống";
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
        if (number.isEmpty()) return " không được để trống";
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
    
    public static String isVailidPhoneNumber(String phoneNumber) {
        if (phoneNumber.isEmpty()) return " không được để trống";
        String regex = "0{1}\\d{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean result = matcher.find();
        if(!result) {
            return "Số điện thoại không hợp lệ";
        }
        
        String message = isInteger(phoneNumber);
        if(!message.isEmpty()) return message;
        
        return "";
    }
}
