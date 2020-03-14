package com.flight.FlightProject.web;


import com.flight.FlightProject.persistence.Model.Flight;
import com.flight.FlightProject.persistence.repo.FlightRepository;
import com.flight.FlightProject.web.exception.FlightIdMisMatchException;
import com.flight.FlightProject.web.exception.FlightNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    //Getting all books
    @GetMapping
    public Iterable findAll(){
        return flightRepository.findAll();
    }
    //Getting books by titles
    @GetMapping("/title/{flightTitle}")
    public List findByTitle(@PathVariable String bookTitle){
        return flightRepository.findByTitle(bookTitle);
    }

    //Getting 1 book by id
    public Flight findOne(@PathVariable Long id){
        return flightRepository.findById(id)
                .orElseThrow(FlightNotFoundException::new);
    }

    //Post Book Details
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Flight create(@RequestBody Flight book){
        return flightRepository.save(book);

    }

    //Delete a book
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        flightRepository.findById(id)
                .orElseThrow(FlightNotFoundException::new);
        flightRepository.deleteById(id);
    }

    //Update a book
    @PutMapping("/{id}")
    public Flight updateBook(@RequestBody Flight book, @PathVariable Long id){
        if(book.getId() != id){
            throw new FlightIdMisMatchException();
        }
        flightRepository.findById(id)
                .orElseThrow(FlightNotFoundException::new);
        return flightRepository.save(book);
    }
}
