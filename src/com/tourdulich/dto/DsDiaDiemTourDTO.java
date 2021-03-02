/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourdulich.dto;

/**
 *
 * @author HP
 */
public class DsDiaDiemTourDTO {
    
    private Long idTour;
    private Long idDiaDiem;

    public DsDiaDiemTourDTO() {
    }

    public DsDiaDiemTourDTO(Long idTour, Long idDiaDiem) {
        this.idTour = idTour;
        this.idDiaDiem = idDiaDiem;
    }

    public Long getIdTour() {
        return idTour;
    }

    public void setIdTour(Long idTour) {
        this.idTour = idTour;
    }

    public Long getIdDiaDiem() {
        return idDiaDiem;
    }

    public void setIdDiaDiem(Long idDiaDiem) {
        this.idDiaDiem = idDiaDiem;
    }

    @Override
    public String toString() {
        return "DsDiaDiemTourDTO{" + "idTour=" + idTour + ", idDiaDiem=" + idDiaDiem + '}';
    }
}
