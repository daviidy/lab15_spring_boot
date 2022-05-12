package com.example.lab15.controller;

import com.example.lab15.domain.Country;
import com.example.lab15.repository.CountryRepository;
import com.example.lab15.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    @ResponseBody
    public List<Country> findAll(){
        return countryService.findAll();
    }

    /*@PostMapping("/countries")
    @ResponseBody
    public Country save(@RequestBody Country country){
        return countryService.save(country);
    }*/
}
