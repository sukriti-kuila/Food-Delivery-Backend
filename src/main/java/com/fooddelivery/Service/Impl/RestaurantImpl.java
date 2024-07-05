package com.fooddelivery.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fooddelivery.Entity.Restaurant;
import com.fooddelivery.Repo.RestaurantRepo;
import com.fooddelivery.Service.RestaurantService;

@Service
public class RestaurantImpl implements RestaurantService{
	@Autowired
	RestaurantRepo resRepo;
	@Override
	public Restaurant add(Restaurant r) {
		return resRepo.save(r);
	}

	@Override
	public List<Restaurant> getAll() {
		return resRepo.findAll();
	}

	@Override
	public void delete(int id) {
		resRepo.deleteById(id);
		
	}
	
}
