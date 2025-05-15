package com.example.demo.controllers;

import com.example.demo.DAO.portoDAO;
import com.example.demo.DTO.portoDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/porto")
public class portoController {

    private final portoDAO dao = new portoDAO();

    @GetMapping("/inserisci")
    public String inserisci(@RequestParam String nome,
                            @RequestParam String nazionalita,
                            @RequestParam String linea) {
        dao.inserisci(nome, nazionalita, linea);
        return "Porto inserito con successo!";
    }

    @GetMapping("/tutti")
    public List<portoDTO> getAll() {
        return dao.getAllPorti();
    }
}
