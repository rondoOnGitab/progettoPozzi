package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping(path = "/user")


public class helloController {

    /*
    private List<User> listaUtenti = new ArrayList<>();
    
    //http://localhost:8080/user/hello
    @GetMapping("/hello")
    @ResponseBody
    public String funzione_che_stampa_ciao(@RequestParam(name = "name", defaultValue = "world") String NOME){
        return "hello, " + NOME;
    }

    //http://localhost:8080/user/get
    @GetMapping("/get")
    public User getUser(@RequestParam(name = "indice", required = true) int indice){
        if (indice < listaUtenti.size()) {
            return listaUtenti.get(indice);
        }
        else{
            return null;
        }
    }

    //http://localhost:8080/user/get
    @GetMapping("/getAll")
    public List<User> getAllUser(){
        return listaUtenti;
    }

    //http://localhost:8080/user/get
    @GetMapping("/add")
    public User addUser(
        @RequestParam(name = "nome", required = true) String nome,
        @RequestParam(name = "eta", required = true) int eta
    ){
        User nuovo = new User(nome, eta);
        listaUtenti.add(nuovo);
        return nuovo;
    }

    */
}
