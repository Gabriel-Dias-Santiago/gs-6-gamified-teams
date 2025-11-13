package com.gitihub.gabrieldias.GS2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class TemaController {

    @GetMapping("/info")
    public Map<String, String> getInfo() {
        return Map.of(
            "tema", "Soluções gamificadas para motivação em equipes híbridas",
            "membro1", "Gabriel Dias Santiago",
            "membro2", "",
            "descricao", "Uma plataforma que utiliza elementos de gamificação para motivar e engajar equipes de trabalho híbridas, promovendo produtividade e satisfação."
        );
    }
}
