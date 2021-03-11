/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.util;

import java.text.Normalizer;
import java.util.regex.Pattern;

/**
 *
 * @author Hi
 */
public class RemoveAccentUtil {
     public static String removeAccent(String s) { 
         String temp = Normalizer.normalize(s, Normalizer.Form.NFD); 
         Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+"); 
         temp = pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replaceAll("đ", "d");;
        
     return temp;
     }  
}
