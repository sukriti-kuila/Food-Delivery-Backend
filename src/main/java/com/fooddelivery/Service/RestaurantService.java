package com.fooddelivery.Service;

import com.fooddelivery.Entity.Restaurant;
import java.util.*;

public interface RestaurantService {
	public Restaurant add(Restaurant r);
	public List<Restaurant> getAll();
	public void delete(int id);
}
