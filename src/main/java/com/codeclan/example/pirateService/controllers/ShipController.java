package com.codeclan.example.pirateService.controllers;


import com.codeclan.example.pirateService.models.Ship;
import com.codeclan.example.pirateService.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ships")
public class ShipController {

    @Autowired
    ShipRepository shipRepository;

    @GetMapping(value = "/")
    public List<Ship> getAllShips(){
        return shipRepository.findAll();
    }

}
