package com.example.demo.DTO;

public class polizzaDTO {
    private int idPolizza;
    private int idViaggio;
    private int idPortoCarico;
    private int idPortoDestinazione;
    private String tipologiaMerce;
    private int pesoKg;
    private String fornitore;
    private int giorniFranchigia;
    private double tariffaGiornaliera;

    public polizzaDTO() {
        this.idPolizza = -1;
        this.idViaggio = -1;
        this.idPortoCarico = -1;
        this.idPortoDestinazione = -1;
        this.tipologiaMerce = "tipologiaMerce";
        this.pesoKg = 0;
        this.fornitore = "fornitore";
        this.giorniFranchigia = 0;
        this.tariffaGiornaliera = 0.0;
    }

    public polizzaDTO(int idPolizza, int idViaggio, int idPortoCarico, int idPortoDestinazione, String tipologiaMerce,
                      int pesoKg, String fornitore, int giorniFranchigia, double tariffaGiornaliera) {
        this.idPolizza = idPolizza;
        this.idViaggio = idViaggio;
        this.idPortoCarico = idPortoCarico;
        this.idPortoDestinazione = idPortoDestinazione;
        this.tipologiaMerce = tipologiaMerce;
        this.pesoKg = pesoKg;
        this.fornitore = fornitore;
        this.giorniFranchigia = giorniFranchigia;
        this.tariffaGiornaliera = tariffaGiornaliera;
    }

    public int getIdPolizza() {
        return idPolizza;
    }

    public void setIdPolizza(int idPolizza) {
        this.idPolizza = idPolizza;
    }

    public int getIdViaggio() {
        return idViaggio;
    }

    public void setIdViaggio(int idViaggio) {
        this.idViaggio = idViaggio;
    }

    public int getIdPortoCarico() {
        return idPortoCarico;
    }

    public void setIdPortoCarico(int idPortoCarico) {
        this.idPortoCarico = idPortoCarico;
    }

    public int getIdPortoDestinazione() {
        return idPortoDestinazione;
    }

    public void setIdPortoDestinazione(int idPortoDestinazione) {
        this.idPortoDestinazione = idPortoDestinazione;
    }

    public String getTipologiaMerce() {
        return tipologiaMerce;
    }

    public void setTipologiaMerce(String tipologiaMerce) {
        this.tipologiaMerce = tipologiaMerce;
    }

    public int getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getFornitore() {
        return fornitore;
    }

    public void setFornitore(String fornitore) {
        this.fornitore = fornitore;
    }

    public int getGiorniFranchigia() {
        return giorniFranchigia;
    }

    public void setGiorniFranchigia(int giorniFranchigia) {
        this.giorniFranchigia = giorniFranchigia;
    }

    public double getTariffaGiornaliera() {
        return tariffaGiornaliera;
    }

    public void setTariffaGiornaliera(double tariffaGiornaliera) {
        this.tariffaGiornaliera = tariffaGiornaliera;
    }
}
