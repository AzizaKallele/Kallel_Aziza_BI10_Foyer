package tn.esprit.foyer_bi.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_bi.entities.Reservation;
import tn.esprit.foyer_bi.repositories.ReservationRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService{
    ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(String idReservation) {
reservationRepository.deleteById(idReservation);
    }

    @Override
    public Reservation UpdateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
}
