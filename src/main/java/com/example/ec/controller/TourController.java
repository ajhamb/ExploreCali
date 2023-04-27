package com.example.ec.controller;

import com.example.ec.domain.Tour;
import com.example.ec.repo.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/tours")
@CrossOrigin
public class TourController {

    private TourRepository tourRepository;

    @Autowired
    public TourController(TourRepository tourRepository){
        this.tourRepository = tourRepository;
    }

    protected TourController(){
    }

    @GetMapping
    public List<Tour> getAllTours(){
        return (List<Tour>) tourRepository.findAll();
    }
}
