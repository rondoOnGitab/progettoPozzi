package com.example.demo.DTO;

import java.sql.Date;

public class ritiroDTO {
    private int idRitiro;
    private int idBuono;
    private String targaCamion;
    private int idAutista;
    private Date dataRitiro;
    private int pesoRitirato;

    public ritiroDTO() {
        this.idRitiro = -1;
        this.idBuono = -1;
        this.targaCamion = "targa";
        this.idAutista = -1;
        this.dataRitiro = Date.valueOf("2000-01-01");
        this.pesoRitirato = 0;
    }

    public ritiroDTO(int idRitiro, int idBuono, String targaCamion, int idAutista, Date dataRitiro, int pesoRitirato) {
        this.idRitiro = idRitiro;
        this.idBuono = idBuono;
        this.targaCamion = targaCamion;
        this.idAutista = idAutista;
        this.dataRitiro = dataRitiro;
        this.pesoRitirato = pesoRitirato;
    }

    public int getIdRitiro() {
        return idRitiro;
    }

    public void setIdRitiro(int idRitiro) {
        this.idRitiro = idRitiro;
    }

    public int getIdBuono() {
        return idBuono;
    }

    public void setIdBuono(int idBuono) {
        this.idBuono = idBuono;
    }

    public String getTargaCamion() {
        return targaCamion;
    }

    public void setTargaCamion(String targaCamion) {
        this.targaCamion = targaCamion;
    }

    public int getIdAutista() {
        return idAutista;
    }

    public void setIdAutista(int idAutista) {
        this.idAutista = idAutista;
    }

    public Date getDataRitiro() {
        return dataRitiro;
    }

    public void setDataRitiro(Date dataRitiro) {
        this.dataRitiro = dataRitiro;
    }

    public int getPesoRitirato() {
        return pesoRitirato;
    }

    public void setPesoRitirato(int pesoRitirato) {
        this.pesoRitirato = pesoRitirato;
    }
}
