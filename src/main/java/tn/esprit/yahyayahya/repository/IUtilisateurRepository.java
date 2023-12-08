package tn.esprit.yahyayahya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.yahyayahya.entities.Utlisateur;
@Repository
public interface IUtilisateurRepository extends JpaRepository<Utlisateur,Integer> {
}
