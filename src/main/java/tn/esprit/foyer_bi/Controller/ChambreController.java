package tn.esprit.foyer_bi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_bi.entities.Chambre;
import tn.esprit.foyer_bi.services.IChambreService;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {
    IChambreService chambreService;

    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }
    @GetMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }
}