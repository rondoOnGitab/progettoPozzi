package com.example.demo.controllers;

import com.example.demo.DAO.autistaDAO;
import com.example.demo.DTO.autistaDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autisti")
public class autistaController {

    private final autistaDAO dao = new autistaDAO();

    // Inserisce un nuovo autista
    @GetMapping("/inserisci")
    public String inserisci(@RequestParam String nome, @RequestParam String cognome) {
        dao.inserisci(nome, cognome);
        return "Autista inserito con successo!";
    }

    // Ritorna tutti gli autisti presenti nel DB
    @GetMapping("/tutti")
    public List<autistaDTO> getAll() {
        return dao.getAllAutisti();
    }
}
