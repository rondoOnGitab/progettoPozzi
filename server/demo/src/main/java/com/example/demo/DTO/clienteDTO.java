package main.java.com.example.demo.DTO;

public class clienteDTO {
    private int id;
    private String username;
    private String password;
    private String nome;
    private String cognome;

    public clienteDTO() {
        this.id = -1;
        this.username = "username";
        this.password = "password";
        this.nome = "nome";
        this.cognome = "cognome";
    }

    public clienteDTO(int id, String username, String password, String nome, String cognome) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.cognome = cognome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
