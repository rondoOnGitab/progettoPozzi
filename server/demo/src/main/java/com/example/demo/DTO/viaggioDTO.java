package com.example.demo.DTO;

import java.sql.Date;

public class viaggioDTO {
    private int idViaggio;
    private int idNave;
    private Date dataPartenza;
    private int idPortoPartenza;
    private int idPortoArrivo;
    private Date dataAllibramento;

    public viaggioDTO() {
        this.idViaggio = -1;
        this.idNave = -1;
        this.dataPartenza = Date.valueOf("2000-01-01");
        this.idPortoPartenza = -1;
        this.idPortoArrivo = -1;
        this.dataAllibramento = Date.valueOf("2000-01-01");
    }

    public viaggioDTO(int idViaggio, int idNave, Date dataPartenza, int idPortoPartenza, int idPortoArrivo, Date dataAllibramento) {
        this.idViaggio = idViaggio;
        this.idNave = idNave;
        this.dataPartenza = dataPartenza;
        this.idPortoPartenza = idPortoPartenza;
        this.idPortoArrivo = idPortoArrivo;
        this.dataAllibramento = dataAllibramento;
    }

    public int getIdViaggio() {
        return idViaggio;
    }

    public void setIdViaggio(int idViaggio) {
        this.idViaggio = idViaggio;
    }

    public int getIdNave() {
        return idNave;
    }

    public void setIdNave(int idNave) {
        this.idNave = idNave;
    }

    public Date getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(Date dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public int getIdPortoPartenza() {
        return idPortoPartenza;
    }

    public void setIdPortoPartenza(int idPortoPartenza) {
        this.idPortoPartenza = idPortoPartenza;
    }

    public int getIdPortoArrivo() {
        return idPortoArrivo;
    }

    public void setIdPortoArrivo(int idPortoArrivo) {
        this.idPortoArrivo = idPortoArrivo;
    }

    public Date getDataAllibramento() {
        return dataAllibramento;
    }

    public void setDataAllibramento(Date dataAllibramento) {
        this.dataAllibramento = dataAllibramento;
    }
}
