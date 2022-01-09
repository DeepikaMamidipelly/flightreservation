package com.flightReserve.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightReserve.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
