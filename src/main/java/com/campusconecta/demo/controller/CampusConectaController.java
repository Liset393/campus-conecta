package com.campusconecta.demo.controller;

import com.campusconecta.demo.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CampusConectaController {

    @GetMapping("/muro")
    public String verMuro(Model model) {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Ana María", "¡Bienvenidos a la nueva versión de Campus Conecta! Genial verlos por aquí.", "Tecnología", "Hoy, 10:15 AM", "badge-tech"));
        posts.add(new Post("Carlos Gómez", "¿Alguien sabe a qué hora abre la biblioteca central hoy?", "Dudas", "Ayer, 4:30 PM", "badge-info"));

        model.addAttribute("posts", posts);
        return "muro"; // Apunta a tu archivo muro.html en templates
    }
}