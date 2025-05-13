package com.example.demo.controllers;

import com.example.demo.DAO.polizzaDAO;
import com.example.demo.DTO.polizzaDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polizza")
public class polizzaController {

    private final polizzaDAO dao = new polizzaDAO();

    // Inserisce una nuova polizza
    @GetMapping("/inserisci")
    public String inserisci(@RequestParam int idViaggio,
                            @RequestParam int idPortoCarico,
                            @RequestParam int idPortoDestinazione,
                            @RequestParam String tipologiaMerce,
                            @RequestParam int pesoKg,
                            @RequestParam String fornitore,
                            @RequestParam int giorniFranchigia,
                            @RequestParam double tariffaGiornaliera) {

        dao.inserisci(idViaggio, idPortoCarico, idPortoDestinazione, tipologiaMerce,
                      pesoKg, fornitore, giorniFranchigia, tariffaGiornaliera);

        return "Polizza inserita con successo!";
    }

    // Restituisce tutte le polizze
    @GetMapping("/tutte")
    public List<polizzaDTO> getAll() {
        return dao.getAllPolizze();
    }
}
