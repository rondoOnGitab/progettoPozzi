package com.example.demo.controllers;

import com.example.demo.DAO.ritiroDAO;
import com.example.demo.DTO.ritiroDTO;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/ritiro")
public class ritiroController {

    private final ritiroDAO dao = new ritiroDAO();

    @GetMapping("/inserisci")
    public String inserisci(@RequestParam int idBuono,
                            @RequestParam String targaCamion,
                            @RequestParam int idAutista,
                            @RequestParam String dataRitiro,
                            @RequestParam int pesoRitirato) {
        // Converte la stringa dataRitiro in oggetto Date
        Date data = Date.valueOf(dataRitiro);
        dao.inserisci(idBuono, targaCamion, idAutista, data, pesoRitirato);
        return "Ritiro inserito con successo!";
    }

    @GetMapping("/tutti")
    public List<ritiroDTO> getAll() {
        return dao.getAllRitiri();
    }
}
