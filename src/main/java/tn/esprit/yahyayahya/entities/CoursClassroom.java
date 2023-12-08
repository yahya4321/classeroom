package tn.esprit.yahyayahya.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class CoursClassroom implements Serializable {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCours ;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private String nom ;
    private int nbHoures;
    private boolean archive;

    @ManyToOne
    public Classe classe;

}
