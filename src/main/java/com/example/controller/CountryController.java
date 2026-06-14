package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Country;
import com.example.service.CountryCreateService;
import com.example.service.CountryDeleteService;
import com.example.service.CountryFetchAllService;
import com.example.service.CountryFetchService;
import com.example.service.CountryUpdateService;


@RestController
@RequestMapping("/country")
public class CountryController {

		@Autowired
		private CountryCreateService countryCreateService;
		@Autowired
		private CountryDeleteService countryDeleteService;
		@Autowired
		private CountryUpdateService countryUpdateService;
		@Autowired
		private CountryFetchService countryFetchService;
		@Autowired
		private CountryFetchAllService countryFetchAllService;
		
		@PostMapping("/save")
	    public Country saveCountry(@RequestBody Country country) {
	        return countryCreateService.addData(country);
	    }
		
		@DeleteMapping("/delete/{id}")
	    public void delteCountry(@PathVariable int id) {
	        countryDeleteService.deleteById( id);
	    }
		
		@GetMapping("/fetchAll")
		public List<Country> fetchAllCountry(){
			return countryFetchAllService.fetchAll();
		}
		
		@GetMapping("/fetch/{id}")
		public Country fetchCountry(@PathVariable int id){
			return countryFetchService.fetchById(id);
		}
		
		@PutMapping("/update/{id}")
		public Country updateCountry(@RequestBody Country country, @PathVariable int id){
			return countryUpdateService.updateData(country, id);
		}
		
		
}
