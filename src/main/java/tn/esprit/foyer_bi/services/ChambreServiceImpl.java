package tn.esprit.foyer_bi.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_bi.entities.Chambre;
import tn.esprit.foyer_bi.repositories.chambreRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {
    chambreRepository ChambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return ChambreRepository.save(chambre);
    }

    @Override
    public void DeleteChambre(Long idChambre) {
        ChambreRepository.deleteById(idChambre);

    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return ChambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return ChambreRepository.findAll();
    }
}
