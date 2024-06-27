package com.example.perfiles.controller;

import com.example.perfiles.model.Perfil;
import com.example.perfiles.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/github/users")
public class PerfilController {
    @Autowired
    private PerfilService perfilService;

    @GetMapping("/{username}")
    public Perfil getPerfilUser(@PathVariable String username) {
        return perfilService.getUserByUsername(username);
    }
}
