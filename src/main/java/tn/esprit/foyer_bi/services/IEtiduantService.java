package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer_bi.entities.Etudiant;

import java.util.List;


public interface IEtiduantService {
    public   Etudiant addEtudiant(Etudiant etudiant);
    public   void deleteEtudiant(Long idEtudiant);
    public    Etudiant upadteEtudiant(Etudiant etudiant);
    public    List<Etudiant> getAllEtudiants();
}
