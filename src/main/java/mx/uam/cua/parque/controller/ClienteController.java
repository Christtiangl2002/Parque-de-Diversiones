package mx.uam.cua.parque.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/chris")
    public String chris() {
        return "Christian springboot";
    }
}