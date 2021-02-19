/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.util;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HP
 */
public class ImageUtil {
    
    public static void showJFileChooser(JLabel thumbnailLbl){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.Images", "jpg", "png", "gif");
        fileChooser.addChoosableFileFilter(fileFilter);
        
        int fileState = fileChooser.showSaveDialog(null);
        if(fileState == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            thumbnailLbl.setIcon(resizeImg(filePath, thumbnailLbl));
        } else if(fileState == JFileChooser.CANCEL_OPTION) {
            System.out.println("No Image Selected!");
        }
    }
    
    public static ImageIcon resizeImg(String imgPath, JLabel thumbnaiLbl) {
        ImageIcon imgIcon = new ImageIcon(imgPath);
        Image img = imgIcon.getImage().getScaledInstance(thumbnaiLbl.getWidth(), thumbnaiLbl.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }
}
