package com.example.countryservice.service;
import java.util.Optional;


import com.example.countryservice.model.Country;
import com.example.countryservice.repository.CountryRepository;
import com.example.countryservice.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Optional<Country> findCountryByCodeOptional(String code) {
        return countryRepository.findById(code);
    }
    
   


    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(countryCode);
        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country not found with code: " + countryCode);
        }
        return result.get();
    }

    
    @Transactional
    public void updateCountry(String code, String name) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(code);

        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country not found with code: " + code);
        }

        Country country = result.get();
        country.setName(name); // Update the name
        countryRepository.save(country); // Save updated entity
    }


    public Country updateCountry(String code, Country updatedCountry) {
        return countryRepository.findById(code)
                .map(existing -> {
                    existing.setName(updatedCountry.getName());
                    return countryRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Country not found"));
    }

    @Transactional
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }


    public List<Country> searchCountriesByPartialName(String name) {
        return countryRepository.findByNameContainingIgnoreCase(name);
    }
    @Transactional
    public Country addCountry(Country country) {
        return countryRepository.save(country); // Return the saved country
    }
}
   