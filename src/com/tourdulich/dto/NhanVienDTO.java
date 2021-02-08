/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dto;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class NhanVienDTO {
    
    private Long id;
    private String ho;
    private String ten;
    private Boolean gioiTinh;
    private LocalDate ngaySinh;
    private String diaChi;
    private String sdt;
    private Byte[] hinhAnh;
    private Long idVaiTro;
    
    public NhanVienDTO(){}

    public NhanVienDTO(Long id, String ho, String ten, Boolean gioiTinh, LocalDate ngaySinh, String diaChi, String sdt, Byte[] hinhAnh, Long idVaiTro) {
        this.id = id;
        this.ho = ho;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.hinhAnh = hinhAnh;
        this.idVaiTro = idVaiTro;
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

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Byte[] getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(Byte[] hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public Long getIdVaiTro() {
        return idVaiTro;
    }

    public void setIdVaiTro(Long idVaiTro) {
        this.idVaiTro = idVaiTro;
    }

    @Override
    public String toString() {
        return "NhanVienDTO{" + "id=" + id + ", ho=" + ho + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", sdt=" + sdt + ", hinhAnh=" + hinhAnh + ", idVaiTro=" + idVaiTro + '}';
    }
}