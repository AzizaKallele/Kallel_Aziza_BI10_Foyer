package tn.esprit.foyer_bi.repositories;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer_bi.entities.Chambre;
@Repository
public interface chambreRepository extends JpaRepository<Chambre,Long>{

}

