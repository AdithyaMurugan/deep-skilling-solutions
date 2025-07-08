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
    	testAddCountry();  // ✅ This method exists

    }

    private void testAddCountry() {
        LOGGER.info("Start");
        
        Country country = new Country();
        country.setCode("JP");  // Example country code
        country.setName("Japan"); // Example country name

        countryService.addCountry(country);

        try {
            Country result = countryService.findCountryByCode("JP");
            LOGGER.debug("Added Country: {}", result);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Country not found!", e);
        }

        LOGGER.info("End");
    }
}
