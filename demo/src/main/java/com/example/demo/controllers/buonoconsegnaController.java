package com.example.demo.controllers;

import com.example.demo.DAO.buonoconsegnaDAO;
import com.example.demo.DTO.buonoconsegnaDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buoni")
public class buonoconsegnaController {

    private final buonoconsegnaDAO dao = new buonoconsegnaDAO();

    // Inserisce un nuovo buono consegna
    @GetMapping("/inserisci")
    public String inserisci(@RequestParam int idPolizza, @RequestParam int pesoKg, @RequestParam String cliente) {
        dao.inserisci(idPolizza, pesoKg, cliente);
        return "Buono consegna inserito con successo!";
    }

    // Ritorna tutti i buoni consegna presenti nel DB
    @GetMapping("/tutti")
    public List<buonoconsegnaDTO> getAll() {
        return dao.getAllBuoni();
    }
}
