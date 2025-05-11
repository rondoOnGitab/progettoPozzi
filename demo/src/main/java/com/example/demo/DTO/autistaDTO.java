package com.example.demo.DTO;

public class autistaDTO {
    private int idAutista;
    private String nome;
    private String cognome;

    public autistaDTO() {
        this.idAutista = -1;
        this.nome = "nome";
        this.cognome = "cognome";
    }

    public autistaDTO(int idAutista, String nome, String cognome) {
        this.idAutista = idAutista;
        this.nome = nome;
        this.cognome = cognome;
    }

    public int getIdAutista() {
        return idAutista;
    }

    public void setIdAutista(int idAutista) {
        this.idAutista = idAutista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
