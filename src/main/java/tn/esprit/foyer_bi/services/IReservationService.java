package tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer_bi.entities.Reservation;

import java.util.List;


public interface IReservationService {
    public   Reservation addReservation(Reservation reservation);
    public   void deleteReservation(String idReservation);
    public   Reservation UpdateReservation(Reservation reservation);
    public   List<Reservation> getAllReservations();
}
