package com.example.demo.controllers;

import com.example.demo.DAO.viaggioDAO;
import com.example.demo.DTO.viaggioDTO;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/viaggio")
public class viaggioController {

    private final viaggioDAO dao = new viaggioDAO();

    @GetMapping("/inserisci")
    public String inserisci(@RequestParam int idNave,
                            @RequestParam String dataPartenza,
                            @RequestParam int idPortoPartenza,
                            @RequestParam int idPortoArrivo,
                            @RequestParam String dataAllibramento) {
        // Converte le date da stringa a oggetti Date
        Date dataP = Date.valueOf(dataPartenza);
        Date dataA = Date.valueOf(dataAllibramento);
        
        dao.inserisci(idNave, dataP, idPortoPartenza, idPortoArrivo, dataA);
        return "Viaggio inserito con successo!";
    }

    @GetMapping("/tutti")
    public List<viaggioDTO> getAll() {
        return dao.getAllViaggi();
    }

}
