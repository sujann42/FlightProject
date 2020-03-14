package com.flight.FlightProject.persistence.repo;

import com.flight.FlightProject.persistence.Model.Flight;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightRepository extends CrudRepository<Flight, Long> {
    List<Flight> findByTitle(String title);
}
