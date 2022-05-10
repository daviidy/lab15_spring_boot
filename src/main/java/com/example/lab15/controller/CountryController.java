package com.example.lab15.controller;

import com.example.lab15.domain.Country;
import com.example.lab15.repository.CountryRepository;
import com.example.lab15.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> findAll(){
        return countryService.findAll();
    }
}
