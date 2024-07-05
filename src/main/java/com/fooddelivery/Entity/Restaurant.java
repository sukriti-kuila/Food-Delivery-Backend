package com.fooddelivery.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.*;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String resName;
	String itemName;
	double rating;
	List <String> cuisines;
	String imgLink;
	public String getImgLink() {
		return imgLink;
	}
	public void setImgLink(String imgLink) {
		this.imgLink = imgLink;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public List<String> getCuisines() {
		return cuisines;
	}
	public void setCuisines(List<String> cuisines) {
		this.cuisines = cuisines;
	}
	
	public Restaurant(int id, String resName, String itemName, double rating, List<String> cuisines, String imgLink) {
		super();
		this.id = id;
		this.resName = resName;
		this.itemName = itemName;
		this.rating = rating;
		this.cuisines = cuisines;
		this.imgLink = imgLink;
	}
	public Restaurant() {
		super();
	}
	
	
}
