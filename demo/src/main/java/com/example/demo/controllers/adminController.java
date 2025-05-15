package com.example.demo.controllers;

import com.example.demo.DAO.adminDAO;
import com.example.demo.DTO.adminDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class adminController {

    private final adminDAO dao = new adminDAO();

    // 🔹 Login admin
    @GetMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {
        adminDTO admin = dao.login(username, password);
        if (admin != null) {
            return "Login admin riuscito! Benvenuto " + admin.getUsername();
        } else {
            return "Login fallito: credenziali errate.";
        }
    }

    // 🔹 Visualizza tutti gli admin
    @GetMapping("/tutti")
    public List<adminDTO> getAll() {
        return dao.getAllAdmin();
    }
}
