package com.fooddelivery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fooddelivery.Entity.Restaurant;
import com.fooddelivery.Service.*;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
	RestaurantService reservice;
	@Autowired
	ApiService apiservice;
	
	@PostMapping
	public Restaurant create(@RequestBody Restaurant r) {
		return reservice.add(r);
	}
	
	@GetMapping()
	public List<Restaurant> getAll() {
		return reservice.getAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteOne(@PathVariable int id) {
		reservice.delete(id);
		return "Restaurant deleted with id "+id;
	}
	
	@GetMapping("/resmenu")
	public String resMenu() {
		return apiservice.fetchDataFromExternalApi();
	}
}
