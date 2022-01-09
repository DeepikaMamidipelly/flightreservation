package com.flightReserve.flightreservation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.flightReserve.flightreservation.entities.Reservation;
import com.flightReserve.flightreservation.repos.FlightRepository;
import com.flightReserve.flightreservation.repos.PassengerRepository;
import com.flightReserve.flightreservation.repos.ReservationRepository;
import com.flightReserve.flightreservation.util.EmailUtil;
import com.flightReserve.flightreservation.util.PDFGenerator;

@SpringBootTest
public class FlightreservationApplicationTests {

	@Autowired
	PassengerRepository repo;

	@Autowired
	FlightRepository flightRepo;

	@Autowired
	ReservationRepository reservationRepo;

	@Autowired
	PDFGenerator pdfGenerator;

	@Autowired
	EmailUtil emailUtil;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGenerateItenarary() {
		Reservation reservation = reservationRepo.findById(1L).get();
		String filePath = "/Users/bharaththippireddy/Documents/reservations/reservation" + reservation.getId() + ".pdf";
		pdfGenerator.generateItinerary(reservation, filePath);
	}

	@Test
	public void testEmail() {
		Reservation reservation = reservationRepo.findById(1L).get();
		String filePath = "/Users/bharaththippireddy/Documents/reservations/reservation" + reservation.getId() + ".pdf";
		emailUtil.sendItinerary("thippireddy.bharath@gmail.com", filePath);
	}

}
