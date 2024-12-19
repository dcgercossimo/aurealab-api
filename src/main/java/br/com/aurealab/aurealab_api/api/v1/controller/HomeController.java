package br.com.aurealab.aurealab_api.api.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Aurealab API";
    }

    @GetMapping
    public String emConstrucao() {
        return "Em construção";
    }

    @GetMapping("/")
    public String emConstrucaoBarra() {
        return emConstrucao();
    }
}
