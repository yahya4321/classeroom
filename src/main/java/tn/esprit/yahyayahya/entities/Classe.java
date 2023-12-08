package tn.esprit.yahyayahya.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
@Entity

public class Classe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeClasse ;
    private String titre;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
@OneToMany(cascade = CascadeType.ALL , mappedBy = "classe")
    List<CoursClassroom> coursClassrooms;
}
