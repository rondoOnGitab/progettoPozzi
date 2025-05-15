package com.example.demo.DTO;

public class naveDTO {
    private int idNave;
    private String nome;

    public naveDTO() {
        this.idNave = -1;
        this.nome = "nome";
    }

    public naveDTO(int idNave, String nome) {
        this.idNave = idNave;
        this.nome = nome;
    }

    public int getIdNave() {
        return idNave;
    }

    public void setIdNave(int idNave) {
        this.idNave = idNave;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
