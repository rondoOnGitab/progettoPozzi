package com.example.demo.controllers;

import com.example.demo.DAO.camionDAO;
import com.example.demo.DTO.camionDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/camion")
public class camionController {

    private final camionDAO dao = new camionDAO();

    // Inserisce un nuovo camion
    @GetMapping("/inserisci")
    public String inserisci(@RequestParam String targa) {
        dao.inserisci(targa);
        return "Camion inserito con successo!";
    }

    // Ritorna tutti i camioni presenti nel DB
    @GetMapping("/tutti")
    public List<camionDTO> getAll() {
        return dao.getAllCamion();
    }
}
