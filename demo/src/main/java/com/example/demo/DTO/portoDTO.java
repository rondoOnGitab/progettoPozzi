package com.example.demo.DTO;

public class portoDTO {
    private int idPorto;
    private String nome;
    private String nazionalita;
    private String linea;

    public portoDTO() {
        this.idPorto = -1;
        this.nome = "nome";
        this.nazionalita = "nazionalita";
        this.linea = "linea";
    }

    public portoDTO(int idPorto, String nome, String nazionalita, String linea) {
        this.idPorto = idPorto;
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.linea = linea;
    }

    public int getIdPorto() {
        return idPorto;
    }

    public void setIdPorto(int idPorto) {
        this.idPorto = idPorto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
}
