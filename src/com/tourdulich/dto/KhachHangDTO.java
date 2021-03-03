/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dto;

import java.time.LocalDate;
import java.util.Date;



/**
 *
 * @author HP
 */
public class KhachHangDTO {
    
    private Long id;
    private String ho;
    private String ten;
    private Boolean gioiTinh;
    private String cmnd;
    private String sdt;
    private String diaChi;
    private byte[] hinhAnh;
    private LocalDate ngaySinh;
    
    public KhachHangDTO(){}

    public KhachHangDTO(Long id, String ho, String ten, Boolean gioiTinh, String cmnd, String sdt, String diaChi, byte[] hinhAnh, LocalDate ngaySinh) {
        this.id = id;
        this.ho = ho;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.hinhAnh = hinhAnh;
        this.ngaySinh = ngaySinh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public byte[] getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(byte[] hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "NhanVienDTO{" + "id=" + id + ", ho=" + ho + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", cmnd=" + cmnd + ", sdt=" + sdt + ", diaChi=" + diaChi + ", hinhAnh=" + hinhAnh + ", ngaySinh=" + ngaySinh + '}';
    }

    
}