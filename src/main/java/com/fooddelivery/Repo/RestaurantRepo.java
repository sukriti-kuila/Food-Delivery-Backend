package com.fooddelivery.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fooddelivery.Entity.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant, Integer>{

}
