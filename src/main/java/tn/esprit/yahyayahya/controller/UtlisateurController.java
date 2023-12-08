package tn.esprit.yahyayahya.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.yahyayahya.entities.Utlisateur;
import tn.esprit.yahyayahya.service.IUtlisateurService;

@RestController
@Api(tags = "Gestion des classes")

@RequestMapping("/utilisateur")


public class UtlisateurController {

    @Autowired
    IUtlisateurService iUtlisateurService;
    @PostMapping("/add-utilisateur")
    public Utlisateur addUtilisateur(@RequestBody Utlisateur u) {
        return iUtlisateurService.ajouterUtilisateur(u);
    }
}
