package com.example.demo.DTO;

public class camionDTO {
    private String targa;

    public camionDTO() {
        this.targa = "targa";
    }

    public camionDTO(String targa) {
        this.targa = targa;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
}
