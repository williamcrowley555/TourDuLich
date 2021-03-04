/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dto;

/**
 *
 * @author kossp
 */
public class ChiPhiDoanDTO {
    private Long id;
    private Long idDoan;
    private Long idDichVu;
    private int chiPhi;
    
    public ChiPhiDoanDTO(){}

    public ChiPhiDoanDTO(Long id, Long idDoan, Long idDichVu, int chiPhi) {
        this.id = id;
        this.idDoan = idDoan;
        this.idDichVu = idDichVu;
        this.chiPhi = chiPhi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdDoan() {
        return idDoan;
    }

    public void setIdDoan(Long idDoan) {
        this.idDoan = idDoan;
    }

    public Long getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(Long idDichVu) {
        this.idDichVu = idDichVu;
    }

    public int getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(int chiPhi) {
        this.chiPhi = chiPhi;
    }
    
    @Override
    public String toString() {
        return "ChiPhiDoanDTO{" + "id=" + id + ", idDoan=" + idDoan + ", idDichVu=" + idDichVu + ", chiPhi=" + chiPhi + '}';
    }    
}
