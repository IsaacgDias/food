package com.card.cardapio.food;

import com.card.cardapio.model.Food;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {
	public FoodResponseDTO(Food food) {
		this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
	}
}