package com.card.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.card.cardapio.food.FoodRequestDTO;
import com.card.cardapio.food.FoodResponseDTO;
import com.card.cardapio.model.Food;
import com.card.cardapio.repository.FoodRepository;

@RestController
@RequestMapping("/food")
public class FoodController {
	
	@Autowired
	private FoodRepository repository;
	
	@CrossOrigin
	@PostMapping
	public void saveFood(@RequestBody FoodRequestDTO data) {
		Food foodData = new Food(data);
		repository.save(foodData);
		return;
	}
	
	@GetMapping
	public List<FoodResponseDTO> getAll() {
		List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
		return foodList;
	}
}
