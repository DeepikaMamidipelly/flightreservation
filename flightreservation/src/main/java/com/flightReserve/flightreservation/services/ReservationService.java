package com.flightReserve.flightreservation.services;

import com.flightReserve.flightreservation.dto.ReservationRequest;
import com.flightReserve.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
