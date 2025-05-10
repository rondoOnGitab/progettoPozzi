package com.example.demo.DTO;

public class naveDTO {
    private int id;
    private String nome;

    public naveDTO(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public naveDTO(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "NaveDTO{id=" + id + ", nome='" + nome + "'}";
    }
}
