package com.fooddelivery.Service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
	private final String externalApiUrl = "https://www.swiggy.com/dapi/menu/pl?page-type=REGULAR_MENU&complete-menu=true&lat=22.572646&lng=88.36389500000001&restaurantId=94438&catalog_qa=undefined&query=Biryani&metaData=%7B%22type%22%3A%22DISH%22%2C%22data%22%3A%7B%22vegIdentifier%22%3A%22NA%22%2C%22cloudinaryId%22%3A%22ocrnq6kwvvrl2ouea492%22%2C%22dishFamilyId%22%3A%22846613%22%2C%22dishFamilyIds%22%3A%5B%22846613%22%5D%7D%2C%22businessCategory%22%3A%22SWIGGY_FOOD%22%2C%22displayLabel%22%3A%22Dish%22%7D&submitAction=SUGGESTION";
	public String fetchDataFromExternalApi() {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println(restTemplate);
        return restTemplate.getForObject(externalApiUrl, String.class);
    }
}
