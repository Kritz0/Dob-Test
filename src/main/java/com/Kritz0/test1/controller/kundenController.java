package com.Kritz0.test1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Kritz0.test1.pkg.kunde;
import com.Kritz0.test1.repository.kundenRepository;

@RestController
@RequestMapping("/rest/kunde")
public class kundenController {
    @Autowired
    private kundenRepository kundenRepository;

    @RequestMapping("/countries/all")
    public ResponseEntity<List<kunde>> getAllCountries() {
        List<kunde> allKunde = kundenRepository.findAll();
        return new ResponseEntity<List<kunde>>(allKunde, HttpStatus.OK);
    }

    @GetMapping
    public List<kunde> listCountries(){
        return kundenRepository.findAll();
    }

//	@GetMapping
//	public List<Country> listCountry(@RequestParam Integer countryPopulation){
//		return countryRepository.findOne(countryPopulation);
//	}

    @PostMapping
    public void addCountry(@RequestBody kunde kunde) {
        kundenRepository.save(kunde);
    }

    @DeleteMapping
    public void deleteCountry(@RequestParam Integer idKunde) {
        kundenRepository.deleteById(idKunde);
    }

    @PutMapping
    public void updateCountry(@RequestBody kunde kunde) {
        kundenRepository.save(kunde);
    }
}
