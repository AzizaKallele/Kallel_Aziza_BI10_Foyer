package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer_bi.entities.Bloc;

import java.util.List;


public interface IBlocService {
   public Bloc addBloc(Bloc bloc);
   public Bloc deleteBloc(Long idBloc);
  public Bloc UpdateBloc(Bloc bloc);
   public List<Bloc> getAllBlocs();
}
