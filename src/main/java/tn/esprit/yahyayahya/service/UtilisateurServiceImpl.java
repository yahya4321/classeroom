package tn.esprit.yahyayahya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.yahyayahya.entities.Utlisateur;
import tn.esprit.yahyayahya.repository.IUtilisateurRepository;

@Service


public class UtilisateurServiceImpl implements IUtlisateurService{
    @Autowired
    IUtilisateurRepository iUtilisateurRepository;

    @Override
    public Utlisateur ajouterUtilisateur(Utlisateur utilisateur) {
       return iUtilisateurRepository.save(utilisateur);


    }
}
