package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String mensagemBoasVindas() {
        // TODO
        return "Bem vindos";
    }


    @GetMapping("/getNumbers")
    public List<Integer> numerosMegaSena() {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            int numero = (int) (Math.random() * 60);
            numeros.add(numero);
        }
        return numeros.stream().sorted().collect(Collectors.toList());
    }
}