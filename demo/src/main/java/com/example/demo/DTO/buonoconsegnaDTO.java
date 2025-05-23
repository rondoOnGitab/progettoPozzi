package com.example.demo.DTO;

public class buonoconsegnaDTO {
    private int idBuono;
    private int idPolizza;
    private int pesoKg;
    private int cliente;

    public buonoconsegnaDTO() {
        this.idBuono = -1;
        this.idPolizza = -1;
        this.pesoKg = 0;
        this.cliente = -1;
    }

    public buonoconsegnaDTO(int idBuono, int idPolizza, int pesoKg, int cliente) {
        this.idBuono = idBuono;
        this.idPolizza = idPolizza;
        this.pesoKg = pesoKg;
        this.cliente = cliente;
    }

    public int getIdBuono() {
        return idBuono;
    }

    public void setIdBuono(int idBuono) {
        this.idBuono = idBuono;
    }

    public int getIdPolizza() {
        return idPolizza;
    }

    public void setIdPolizza(int idPolizza) {
        this.idPolizza = idPolizza;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }
}
