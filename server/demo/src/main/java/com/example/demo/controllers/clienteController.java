package main.java.com.example.demo.controllers;

import com.example.demo.DAO.clienteDAO;
import com.example.demo.DTO.clienteDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class clienteController {

    private final clienteDAO dao = new clienteDAO();

    // 🔹 Registrazione cliente
    @GetMapping("/registrazione")
    public String inserisci(@RequestParam String username,
                            @RequestParam String password,
                            @RequestParam String nome,
                            @RequestParam String cognome) {
        dao.registrazione(username, password, nome, cognome);
        return "Cliente registrato con successo!";
    }

    // 🔹 Login cliente
    @GetMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {
        clienteDTO cliente = dao.login(username, password);
        if (cliente != null) {
            return "Login riuscito! Benvenuto " + cliente.getNome() + " " + cliente.getCognome();
        } else {
            return "Login fallito: credenziali errate.";
        }
    }

    // 🔹 Visualizza tutti i clienti
    @GetMapping("/tutti")
    public List<clienteDTO> getAll() {
        return dao.getAllClienti();
    }
}
