package com.codeclan.example.pirateService.controllers;

import com.codeclan.example.pirateService.models.Raid;
import com.codeclan.example.pirateService.repositories.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/raids")
public class RaidController {

    @Autowired
    RaidRepository raidRepository;

    @GetMapping(value = "/")
    public List<Raid> getAllRaids(){
        return raidRepository.findAll();
    }
}
