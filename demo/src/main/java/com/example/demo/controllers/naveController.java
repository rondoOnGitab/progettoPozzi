package com.example.demo.controllers;

import com.example.demo.DAO.naveDAO;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/navi")
public class naveController {

    private final naveDAO dao = new naveDAO();

    @GetMapping("/inserisci")
    public String inserisci(@RequestParam String nome) {
        dao.inserisci(nome);
        return "OK";
    }
}
