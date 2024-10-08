package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer_bi.entities.Universite;

import java.util.List;


public interface IUniversiteService {

    public  Universite addUniversite(Universite universite);
    public   void deleteUniversite(Long idUniversite);
    public   Universite UpdateUniversite(Universite universite);
    public List<Universite> getAllUniversites();
}
