package com.flightReserve.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightReserve.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
