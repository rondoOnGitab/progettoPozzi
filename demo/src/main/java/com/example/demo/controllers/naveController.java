package com.example.demo.controllers;

import com.example.demo.DAO.naveDAO;
import com.example.demo.DTO.naveDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/navi")
public class naveController {

    private final naveDAO dao = new naveDAO();

    // Inserisce una nuova nave
    @GetMapping("/inserisci")
    public String inserisci(@RequestParam String nome) {
        dao.inserisci(nome);
        return "Nave inserita con successo!";
    }

    // Ritorna tutte le navi presenti nel DB
    @GetMapping("/tutte")
    public List<naveDTO> getAll() {
        return dao.getAllNavi();
    }
}
