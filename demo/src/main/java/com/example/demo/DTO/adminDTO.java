package com.example.demo.DTO;

public class adminDTO {
    private int id;
    private String username;
    private String password;
    private String email;

    public adminDTO() {
        this.id = -1;
        this.username = "username";
        this.password = "password";
        this.email = "email";
    }

    public adminDTO(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

