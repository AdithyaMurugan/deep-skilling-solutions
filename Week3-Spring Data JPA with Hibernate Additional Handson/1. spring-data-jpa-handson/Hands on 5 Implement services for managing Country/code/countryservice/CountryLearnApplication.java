package com.example.countryservice;

import com.example.countryservice.model.Country;
import com.example.countryservice.service.CountryService;
import com.example.countryservice.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
	    "com.example.countryservice",
	    "com.cognizant.springlearn.countrydemo.country_learn"
	})

public class CountryLearnApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryLearnApplication.class);

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(CountryLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        getCountryTest();
    }

    private void getCountryTest() {
        LOGGER.info("Start");
        try {
            Country country = countryService.findCountryByCode("IN");
            LOGGER.debug("Country: {}", country);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Exception: {}", e.getMessage());
        }
        LOGGER.info("End");
    }
}
