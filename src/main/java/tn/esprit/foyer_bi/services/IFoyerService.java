package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer_bi.entities.Foyer;

import java.util.List;


public interface IFoyerService {
    public   Foyer addFoyer(Foyer foyer);
    public   void deleteFoyer(Long idFoyer);
    public   Foyer UpdateFoyer(Foyer foyer);
    public   List<Foyer> getAllFoyers();
}
