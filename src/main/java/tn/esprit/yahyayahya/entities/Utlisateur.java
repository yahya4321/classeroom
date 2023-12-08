package tn.esprit.yahyayahya.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Utlisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUtlisateur ;
    private String prenom;
    private String nom;
    private String passeword;
   @ManyToOne(cascade = CascadeType.ALL)
   public Classe classe;

}
