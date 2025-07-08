package com.example.countryservice.controller;

import com.example.countryservice.model.Country;
import com.example.countryservice.service.CountryService;
import com.example.countryservice.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{code}")
    public ResponseEntity<Country> getCountryByCode(@PathVariable String code) {
        try {
            return ResponseEntity.ok(countryService.findCountryByCode(code));
        } catch (CountryNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Country> addCountry(@RequestBody Country country) {
        return ResponseEntity.ok(countryService.addCountry(country));
    }

    @PutMapping("/{code}")
    public ResponseEntity<Country> updateCountry(@PathVariable String code, @RequestBody Country country) {
        return ResponseEntity.ok(countryService.updateCountry(code, country));
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<Void> deleteCountry(@PathVariable String code) {
        countryService.deleteCountry(code);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Country>> searchCountries(@RequestParam String name) {
        return ResponseEntity.ok(countryService.searchCountriesByPartialName(name));
    }
}

