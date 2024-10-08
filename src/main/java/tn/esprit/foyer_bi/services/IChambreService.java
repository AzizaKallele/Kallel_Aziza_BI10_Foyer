package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer_bi.entities.Chambre;

import java.util.List;

public interface IChambreService {
    public Chambre addChambre(Chambre chambre);
    public void DeleteChambre(Long idChambre);
    public Chambre updateChambre(Chambre chambre);
    public    List<Chambre> getAllChambre();

}
